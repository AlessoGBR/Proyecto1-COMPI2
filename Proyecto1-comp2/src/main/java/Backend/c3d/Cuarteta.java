package Backend.c3d;

public class Cuarteta {

    private final OperadorC3D operador;
    private final String arg1;
    private final String arg2;
    private final String resultado;

    public Cuarteta(OperadorC3D operador, String arg1, String arg2, String resultado) {
        this.operador = operador;
        this.arg1 = arg1 == null ? "" : arg1;
        this.arg2 = arg2 == null ? "" : arg2;
        this.resultado = resultado == null ? "" : resultado;
    }

    public OperadorC3D getOperador() {
        return operador;
    }

    public String getArg1() {
        return arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public String getResultado() {
        return resultado;
    }

    public String aFormatoCuarteta() {
        return String.format("(%-14s, %-12s, %-12s, %-12s)",
                operador.name(),
                arg1.isEmpty() ? "-" : arg1,
                arg2.isEmpty() ? "-" : arg2,
                resultado.isEmpty() ? "-" : resultado);
    }

    public String aFormatoC3D() {
        return switch (operador) {
            case SUMA, RESTA, MULT, DIV, DIV_ENT, MOD ->
                    resultado + " = " + arg1 + " " + operador.getSimbolo() + " " + arg2;
            case ASIG -> resultado + " = " + arg1;
            case GOTO -> "goto " + resultado;
            case IF_EQ, IF_NEQ, IF_LT, IF_LE, IF_GT, IF_GE ->
                    "if " + arg1 + " " + operador.getSimbolo() + " " + arg2 + " goto " + resultado;
            case IF_FALSE -> "if_false " + arg1 + " goto " + resultado;
            case ACCESO_STACK -> resultado + " = stack[" + arg1 + "]";
            case ASIG_STACK -> "stack[" + resultado + "] = " + arg1;
            case ACCESO_HEAP -> resultado + " = heap[" + arg1 + "]";
            case ASIG_HEAP -> "heap[" + resultado + "] = " + arg1;
            case ETIQUETA -> resultado + ":";
            case COMENTARIO -> "// " + arg1;
            case CALL -> "call " + resultado;
            case PARAM -> "param " + arg1;
            case RETURN -> "return";
            case PRINT_INT, PRINT_FLOAT, PRINT_CHAR, PRINT_BOOL, PRINT_STR -> "print " + arg1;
            case PRINT_NL -> "print '\\n'";
            case READ_NUM, READ_STR -> resultado + " = read()";
            case CONCAT -> resultado + " = concat(" + arg1 + ", " + arg2 + ")";
            case A_CADENA_NUM, A_CADENA_FLOTANTE, A_CADENA_CHAR, A_CADENA_BOOL ->
                    resultado + " = " + operador.getSimbolo() + "(" + arg1 + ")";
            case INICIO_FUNCION -> "\n" + resultado + ":  // INICIO DE FUNCION";
            case FIN_FUNCION -> "end " + resultado + "\n";
        };
    }

    public String aCodigoC() {
        return switch (operador) {
            case SUMA -> sangria() + resultado + " = " + arg1 + " + " + arg2 + ";";
            case RESTA -> sangria() + resultado + " = " + arg1 + " - " + arg2 + ";";
            case MULT -> sangria() + resultado + " = " + arg1 + " * " + arg2 + ";";
            case DIV -> sangria() + resultado + " = dividir(" + arg1 + ", " + arg2 + ");";
            case DIV_ENT -> sangria() + resultado + " = dividir_entero(" + arg1 + ", " + arg2 + ");";
            case MOD -> sangria() + resultado + " = modulo(" + arg1 + ", " + arg2 + ");";
            case ASIG -> sangria() + resultado + " = " + arg1 + ";";
            case GOTO -> sangria() + "goto " + resultado + ";";
            case IF_EQ -> saltoCondicional("==");
            case IF_NEQ -> saltoCondicional("!=");
            case IF_LT -> saltoCondicional("<");
            case IF_LE -> saltoCondicional("<=");
            case IF_GT -> saltoCondicional(">");
            case IF_GE -> saltoCondicional(">=");
            case IF_FALSE -> sangria() + "if (" + arg1 + " == 0) goto " + resultado + ";";
            case ACCESO_STACK -> sangria() + resultado + " = stack[(int)" + arg1 + "];";
            case ASIG_STACK -> sangria() + "stack[(int)" + resultado + "] = " + arg1 + ";";
            case ACCESO_HEAP -> sangria() + resultado + " = heap[(int)" + arg1 + "];";
            case ASIG_HEAP -> sangria() + "heap[(int)" + resultado + "] = " + arg1 + ";";
            case ETIQUETA -> resultado + ": ;";
            case COMENTARIO -> sangria() + "// " + arg1;
            case CALL -> sangria() + resultado + "();";
            case PARAM -> sangria() + "// param " + arg1;
            case RETURN -> sangria() + "return;";
            case PRINT_INT -> sangria() + "printf(\"%d\", (int)" + arg1 + ");";
            case PRINT_FLOAT -> sangria() + "imprimir_flotante(" + arg1 + ");";
            case PRINT_CHAR -> sangria() + "printf(\"%c\", (char)(int)" + arg1 + ");";
            case PRINT_BOOL -> sangria() + "printf(\"%s\", (" + arg1 + " != 0) ? \"true\" : \"false\");";
            case PRINT_STR -> sangria() + "imprimir_cadena(" + arg1 + ");";
            case PRINT_NL -> sangria() + "printf(\"\\n\");";
            case READ_NUM -> sangria() + resultado + " = leer_numero();";
            case READ_STR -> sangria() + resultado + " = leer_cadena();";
            case CONCAT -> sangria() + resultado + " = concatenar(" + arg1 + ", " + arg2 + ");";
            case A_CADENA_NUM -> sangria() + resultado + " = cadena_desde_numero(" + arg1 + ");";
            case A_CADENA_FLOTANTE -> sangria() + resultado + " = cadena_desde_flotante(" + arg1 + ");";
            case A_CADENA_CHAR -> sangria() + resultado + " = cadena_desde_caracter(" + arg1 + ");";
            case A_CADENA_BOOL -> sangria() + resultado + " = cadena_desde_booleano(" + arg1 + ");";
            case INICIO_FUNCION -> "void " + resultado + "() {";
            case FIN_FUNCION -> "}";
        };
    }

    private String saltoCondicional(String simboloC) {
        return sangria() + "if (" + arg1 + " " + simboloC + " " + arg2 + ") goto " + resultado + ";";
    }

    private String sangria() {
        return "    ";
    }

    @Override
    public String toString() {
        return aFormatoC3D();
    }
}
