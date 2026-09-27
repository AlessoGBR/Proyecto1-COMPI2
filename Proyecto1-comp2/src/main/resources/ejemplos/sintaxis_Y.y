// definicion de estructuras globales, la seccion es opcional
%estructuras
estructura MiEstructura:
    cadena nombre

estructura Persona:
    entero edad
    cadena nombre
    flotante promedio // numero con decimales
    caracter letra
    /*
     la expresion para definir arreglos
     obligatoriamente debe ser constante
     unicamente dentro de la definicion de una estructura
    */
    entero miArray[10]

    // es posible anidar estructuras
    MiEstructura miEstructura

// definicion de funciones, la seccion es obligatoria
%funciones

// Funcion sin retorno, con un parametro. Los parametros son opcionales
definir funcionSinRetorno(entero miEntero):
    miEntero = 90 * 10

// Funcion con retorno de tipo entero
definir funcionConRetorno(entero miEntero) -> entero :
    miEntero = 10 + 10
    retornar 160

// Los arreglos y las estructuras se pasan por referencia
definir sumarArreglo([] entero miArray, {} Persona persona) -> entero :
    entero total = 0
    total = miArray[0] + miArray[1]
    persona.edad = total
    retornar total

definir calcularPoder(entero fuerza) -> entero :
    retornar fuerza * 10

definir principal():
    // declaracion de variables
    entero sinInicializacion
    entero edadUsuario = 25
    flotante temperatura = 36.6
    caracter inicial = 'A'
    bool bandera = verdadero
    bool bandera2 = falso
    cadena saludos = "Saludos zetarianos"
    entero numeros[5] = {10, 20, 30, 40, 50}
    entero matriz[3][3]

    // uso de arreglos
    entero resultado
    resultado = numeros[0] + numeros[1]
    numeros[2] = numeros[0] * 3

    // uso de estructuras
    Persona alumno1
    alumno1.nombre = "Yennifer"
    alumno1.edad = edadUsuario

    // condicionales
    si(edadUsuario > 18) entonces
        imprimir("Codigo si es mayor de edad")

        si(bandera == verdadero) entonces
            imprimir("Otra condicion")

        imprimir("Esto siempre se imprime")
    sino (edadUsuario == 18) entonces
        imprimir("Codigo si tiene exactamente 18")
    contrario
        imprimir("Codigo si es menor de edad")

    entero opcion = 2
    entero x = 0
    elegir(opcion) :
        caso 1:
            x = 10
            romper
        caso 2:
            x = 20
            romper
        siempre:
            x = 30
            romper

    // ciclos
    para(entero i = 0; i < 10; i++):
        si(i == 3) entonces
            continuar

        si(i == 8) entonces
            romper

    entero contador = 0
    mientras(contador < 5) hacer
        contador++;

        si(contador == 2) entonces
            continuar;

    entero intentos = 0
    hacer:
        intentos++

        si(intentos == 4) entonces
            romper
    mientras(intentos < 10)

    // funciones especiales
    imprimir("Imprimir")
    leer()
    cadena entrada = leer()
    entrada = leer()

    resultado = calcularPoder(x)
    imprimir(resultado)
