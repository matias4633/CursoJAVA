
package domain;


//public final class Persona {
//      
//}//no permitira definir clases hijas.

public class Persona {
    
    public final static int MI_CONSTANTE=1; //Definiendo una constante
    
    public String nombre;
    
    
    public final void imprimir(){
        System.out.println("Metodo imprimir");
    }//El metodo se va a heredar a la clase hija, pero no podra modificar el
    // funcionamieno del metodo, no podra sobreescribir.
    
}
