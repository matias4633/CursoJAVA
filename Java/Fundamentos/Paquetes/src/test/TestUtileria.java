
package test;
//import mx.com.globalmentoring.Utileria;

/*import mx.com.globalmentoring.*; Si quiero importar todo el paquete. Solo se 
importaran las clases que esten en uso.*/

//import static mx.com.globalmentoring.Utileria.imprimir;

//Con esta sintaxis importo solamente el metodo estatico de la clase.

public class TestUtileria {
    public static void main(String[] args) {
        //Utileria.imprimir("hola");
        
        //imprimir("Saludos"); llamando solo al metodo static
        
        mx.com.globalmentoring.Utileria.imprimir("ADIOS");
        //llamada con el nombre completamente calificado de la clase, no es
        //necesario importar clase o metodo.
        
    }
}
