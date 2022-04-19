
package test;
import dominio.*; //Importa todos los .java del paquete.

public class PersonaPrueba {
    public static void main(String[] args) {
        
        Persona ps1= new Persona("Juan",5000.00,false);
        
        System.out.println("Persona 1: "+ ps1.toString());
        
        ps1.setNombre("Juan Carlos");
        
      System.out.println("Persona 1 Modificada : "+ ps1);
        
        
    }
}
