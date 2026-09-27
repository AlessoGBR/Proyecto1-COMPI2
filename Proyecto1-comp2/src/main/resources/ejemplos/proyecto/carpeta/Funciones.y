%estructuras
estructura Direccion:
    cadena calle
    entero numero

estructura Persona:
    cadena nombre
    entero edad
    Direccion domicilio

%funciones
definir calcularPoder(entero fuerza) -> entero :
    retornar fuerza * 10

definir maximo(entero a, entero b) -> entero :
    si(a > b) entonces
        retornar a
    retornar b
