##
    Importaciones de los otros lenguajes
##
import carpeta.Guerrero.z
import carpeta.Funciones.y

VARIABILES>
esto edad : numerus 20;
esto cifrado : bool falsus;
esto comandante : textum "Estudiante X";
esto fuerza : numerus 10;
esto poder : numerus 0;
esto mi_direccion : Direccion {"Calle Real", 42};
esto ciudadano : Persona {"Valeria", 25, {"Avenida Central", 500}};
esto heroe : novus Guerrero("Capitan Esparragos", 3);
series nombres[2] : textum {"Hola", "Adios"};

MAIOR>
>> "Hola comandante!" ;
>> "Bienvenido " >> comandante ;

si (edad >= 18) {
    cifrado = verum;
    fuerza = 12;
} finis ;

>> "Tu poder es: " >> calcularPoder(fuerza);
>> "El maximo entre 7 y 19 es: " >> maximo(7, 19);
>> "La puerta esta cifrada? " >> cifrado ;

>> "Direccion: " >> mi_direccion.calle >> " #" >> mi_direccion.numero ;
>> "Ciudadano: " >> ciudadano.nombre >> " de " >> ciudadano.edad >> " anios" ;
>> "Vive en: " >> ciudadano.domicilio.calle ;

>> "Heroe: " >> heroe.getNombre() >> " nivel " >> heroe.getNivel() ;
heroe.subirNivel();
>> "Despues de subir: " >> heroe.getNivel() ;

nombres[0] = "Capitan";
nombres[1] = nombres[0] + " clon";
>> nombres[1] ;

per (esto i : numerus 0; i < 5; i++) {
    si (i == 2) {
        perge;
    } finis;
    poder = poder + i;
}
>> "Poder acumulado (sin el 2): " >> poder ;

dum (poder < 10) {
    poder = poder + 1;
} finis;
>> "Poder tras el dum: " >> poder ;

facere {
    fuerza++;
} dum (fuerza < 15);
>> "Fuerza final: " >> fuerza ;

FINIS;
