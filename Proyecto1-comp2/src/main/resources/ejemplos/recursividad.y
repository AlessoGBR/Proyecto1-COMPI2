%estructuras
estructura Punto:
    entero x
    entero y

%funciones
definir factorial(entero n) -> entero :
    si(n <= 1) entonces
        retornar 1
    retornar n * factorial(n - 1)

definir fib(entero n) -> entero :
    si(n < 2) entonces
        retornar n
    retornar fib(n - 1) + fib(n - 2)

definir sumar(entero a, entero b) -> entero :
    retornar a + b

definir principal():
    imprimir("factorial(6) =")
    imprimir(factorial(6))

    imprimir("fib(10) =")
    imprimir(fib(10))

    imprimir("sumar(20, 22) =")
    imprimir(sumar(20, 22))

    entero numeros[5] = {10, 20, 30, 40, 50}
    entero resultado
    resultado = numeros[0] + numeros[1]
    numeros[2] = numeros[0] * 3
    imprimir("numeros[0] + numeros[1] =")
    imprimir(resultado)
    imprimir("numeros[2] =")
    imprimir(numeros[2])

    Punto p1 = {7, 9}
    imprimir("p1.x + p1.y =")
    imprimir(p1.x + p1.y)
    p1.x = 100
    imprimir("p1.x =")
    imprimir(p1.x)

    entero contador = 0
    entero total = 0
    mientras(contador < 5) hacer
        contador++;
        si(contador == 3) entonces
            continuar;
        total = total + contador

    imprimir("total del ciclo (sin el 3) =")
    imprimir(total)

    entero opcion = 2
    elegir(opcion) :
        caso 1:
            imprimir("caso uno")
            romper
        caso 2:
            imprimir("caso dos")
            romper
        siempre:
            imprimir("caso por defecto")
            romper

    flotante promedio = 7.5
    imprimir("promedio =")
    imprimir(promedio)
