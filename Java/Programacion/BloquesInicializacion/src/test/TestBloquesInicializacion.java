
package test;

import domain.Persona;


public class TestBloquesInicializacion {
    public static void main(String[] args) {
        Persona ps1=new Persona();
        System.out.println("ps1 = " + ps1);
        System.out.println("");
        Persona ps2=new Persona();//En la segunda ya no se ejecuta el bloque estatico.
        System.out.println("ps2 = " + ps2);
        
        /*Al mencionar la clase ya se ejecuta el bloque estatico
        luego, cuando se llama al contructor, no entra al contructor sino que 
        vuelve al bloque NO estatico, cuando termina el bloque no estatico
        ahi ejecuta el contructor.*/
    }
}
