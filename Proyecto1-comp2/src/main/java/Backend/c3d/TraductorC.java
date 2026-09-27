package Backend.c3d;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TraductorC {

    private static final int TAMANIO_MEMORIA = 100000;

    private static final Pattern TEMPORAL = Pattern.compile("\\bT\\d+\\b");

    public static String traducir(ControladorC3D controlador) {
        if (controlador == null) {
            return "";
        }

        List<Cuarteta> cuartetas = controlador.getCuartetas();
        StringBuilder sb = new StringBuilder();

        escribirCabecera(sb, controlador.getTamanioAreaGlobal());
        escribirFuncionesNativas(sb);
        escribirPrototipos(sb, cuartetas);
        escribirFunciones(sb, cuartetas);
        escribirMain(sb, controlador.getTamanioAreaGlobal());

        return sb.toString();
    }


    private static void escribirCabecera(StringBuilder sb, int areaGlobal) {
        sb.append("/* CODIGO C GENERADO CON C3D */\n");
        sb.append("#include <stdio.h>\n");
        sb.append("#include <stdlib.h>\n");
        sb.append("#include <string.h>\n");
        sb.append("#include <math.h>\n\n");

        sb.append("/* SEGMENTOS DE MEMORIA */\n");
        sb.append("double stack[").append(TAMANIO_MEMORIA).append("];\n");
        sb.append("double heap[").append(TAMANIO_MEMORIA).append("];\n");
        sb.append("double P = ").append(areaGlobal).append(";\n");
        sb.append("double H = 1;\n");
        sb.append("double THIS = 0;\n\n");
    }

    private static void escribirFuncionesNativas(StringBuilder sb) {
        sb.append("""
                
                double dividir(double a, double b) {
                    if (b == 0) {
                        printf("\\nERROR: DIVISION ENTRE CERO\\n");
                        exit(1);
                    }
                    return a / b;
                }
                
                double dividir_entero(double a, double b) {
                    if (b == 0) {
                        printf("\\nERROR: DIVSION ENTRE CERO\\n");
                        exit(1);
                    }
                    return (double)((long)a / (long)b);
                }
                
                double modulo(double a, double b) {
                    if (b == 0) {
                        printf("\\nERROR: MODULO EN CERO\\n");
                        exit(1);
                    }
                    return (double)((long)a % (long)b);
                }
                
                void imprimir_cadena(double direccion) {
                    int dir = (int)direccion;
                    while (dir >= 0 && dir < %TAM% && heap[dir] != -1) {
                        printf("%c", (char)(int)heap[dir]);
                        dir++;
                    }
                }
                
                void copiar_cadena(double origen) {
                    int dir = (int)origen;
                    while (dir >= 0 && dir < %TAM% && heap[dir] != -1) {
                        heap[(int)H] = heap[dir];
                        H = H + 1;
                        dir++;
                    }
                }
                
                double concatenar(double a, double b) {
                    double inicio = H;
                    copiar_cadena(a);
                    copiar_cadena(b);
                    heap[(int)H] = -1;
                    H = H + 1;
                    return inicio;
                }
                
                double guardar_texto(const char *texto) {
                    double inicio = H;
                    for (int i = 0; texto[i] != '\\0'; i++) {
                        heap[(int)H] = (double)texto[i];
                        H = H + 1;
                    }
                    heap[(int)H] = -1;
                    H = H + 1;
                    return inicio;
                }
                
                double cadena_desde_numero(double valor) {
                    char buffer[64];
                    if (valor == (long)valor) {
                        snprintf(buffer, sizeof(buffer), "%ld", (long)valor);
                    } else {
                        snprintf(buffer, sizeof(buffer), "%g", valor);
                    }
                    return guardar_texto(buffer);
                }
                
                void formato_flotante(double valor, char *buffer, int tamanio) {
                    snprintf(buffer, tamanio, "%g", valor);
                    if (strchr(buffer, '.') == NULL && strchr(buffer, 'e') == NULL
                            && strchr(buffer, 'n') == NULL && strchr(buffer, 'i') == NULL) {
                        strncat(buffer, ".0", tamanio - strlen(buffer) - 1);
                    }
                }
                
                void imprimir_flotante(double valor) {
                    char buffer[64];
                    formato_flotante(valor, buffer, sizeof(buffer));
                    printf("%s", buffer);
                }
                
                double cadena_desde_flotante(double valor) {
                    char buffer[64];
                    formato_flotante(valor, buffer, sizeof(buffer));
                    return guardar_texto(buffer);
                }
                
                double cadena_desde_caracter(double valor) {
                    char buffer[2];
                    buffer[0] = (char)(int)valor;
                    buffer[1] = '\\0';
                    return guardar_texto(buffer);
                }
                
                double cadena_desde_booleano(double valor) {
                    return guardar_texto(valor != 0 ? "true" : "false");
                }
                
                void leer_linea(char *buffer, int tamanio) {
                    fflush(stdout);
                    if (fgets(buffer, tamanio, stdin) == NULL) {
                        buffer[0] = '\\0';
                        return;
                    }
                    size_t fin = strcspn(buffer, "\\r\\n");
                    if (buffer[fin] == '\\0') {
                        int c;
                        while ((c = getchar()) != '\\n' && c != EOF) { }
                    }
                    buffer[fin] = '\\0';
                }

                double leer_numero() {
                    char buffer[1024];
                    char *fin;
                    leer_linea(buffer, sizeof(buffer));
                    double valor = strtod(buffer, &fin);
                    return fin == buffer ? 0 : valor;
                }

                double leer_cadena() {
                    char buffer[1024];
                    leer_linea(buffer, sizeof(buffer));
                    return guardar_texto(buffer);
                }
                
                """.replace("%TAM%", String.valueOf(TAMANIO_MEMORIA)));
    }

    private static void escribirPrototipos(StringBuilder sb, List<Cuarteta> cuartetas) {
        for (Cuarteta c : cuartetas) {
            if (c.getOperador() == OperadorC3D.INICIO_FUNCION) {
                sb.append("void ").append(c.getResultado()).append("();\n");
            }
        }
        sb.append('\n');
    }

    private static void escribirFunciones(StringBuilder sb, List<Cuarteta> cuartetas) {

        int i = 0;
        while (i < cuartetas.size()) {
            Cuarteta actual = cuartetas.get(i);

            if (actual.getOperador() != OperadorC3D.INICIO_FUNCION) {
                sb.append("/* ").append(actual.aFormatoC3D()).append(" */\n");
                i++;
                continue;
            }

            int fin = buscarFinDeFuncion(cuartetas, i);
            List<Cuarteta> cuerpo = cuartetas.subList(i + 1, fin);

            sb.append('\n').append(actual.aCodigoC()).append('\n');
            escribirDeclaracionDeTemporales(sb, cuerpo);
            for (Cuarteta c : cuerpo) {
                sb.append(c.aCodigoC()).append('\n');
            }
            sb.append("}\n");

            i = fin + 1;
        }
    }

    private static int buscarFinDeFuncion(List<Cuarteta> cuartetas, int inicio) {
        for (int j = inicio + 1; j < cuartetas.size(); j++) {
            if (cuartetas.get(j).getOperador() == OperadorC3D.FIN_FUNCION) {
                return j;
            }
        }
        return cuartetas.size();
    }

    private static void escribirDeclaracionDeTemporales(StringBuilder sb, List<Cuarteta> cuerpo) {
        Set<String> temporales = new LinkedHashSet<>();
        for (Cuarteta c : cuerpo) {
            recolectarTemporales(c.getArg1(), temporales);
            recolectarTemporales(c.getArg2(), temporales);
            recolectarTemporales(c.getResultado(), temporales);
        }
        if (temporales.isEmpty()) {
            return;
        }

        List<String> ordenados = new ArrayList<>(temporales);
        sb.append("    double ");
        for (int i = 0; i < ordenados.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (i > 0 && i % 12 == 0) {
                sb.append("\n            ");
            }
            sb.append(ordenados.get(i)).append(" = 0");
        }
        sb.append(";\n");
    }

    private static void recolectarTemporales(String texto, Set<String> destino) {
        if (texto == null || texto.isEmpty()) {
            return;
        }
        Matcher m = TEMPORAL.matcher(texto);
        while (m.find()) {
            destino.add(m.group());
        }
    }

    private static void escribirMain(StringBuilder sb, int areaGlobal) {
        sb.append("\nint main() {\n");
        sb.append("    P = ").append(areaGlobal).append(";\n");
        sb.append("    H = 1;\n");
        sb.append("    main_programa();\n");
        sb.append("    return 0;\n");
        sb.append("}\n");
    }
}
