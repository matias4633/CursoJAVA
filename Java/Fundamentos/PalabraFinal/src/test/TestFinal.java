
package test;

import domain.Persona;


public class TestFinal {
    public static void main(String[] args) {
        final int miVariable;
        
        miVariable=6;
        
        System.out.println("miVariable = " + miVariable);
        
        //miVariable=8;
        /*Al usar la palabra final en la variable, una vez que se le asigne un
        valor pasa a ser una constante, no se puede cambiar.
        */
        
         //Persona.MI_CONSTANTE=7; es una constante, no se permitira cambiarla
         
         System.out.println("La consante " + Persona.MI_CONSTANTE);
         
         final Persona ps1 = new Persona();
        // ps1=new Persona(); //No permitira almacenar la direccion de un nuevo objeto.
         ps1.nombre=("Matias"); // Pero si va a poder cambiar los atributos del 
                                //Objeto.
                                
        
    }
}
