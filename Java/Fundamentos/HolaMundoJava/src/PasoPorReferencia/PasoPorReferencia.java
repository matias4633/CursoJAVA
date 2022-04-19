
package PasoPorReferencia;

import clases.Persona;



public class PasoPorReferencia {
    
    public static void main(String[] args) {
        Persona ps1= new Persona();
        Persona ps2= new Persona();
        ps1.nombre="Juan";
        System.out.println("ps1.nombre = " + ps1.nombre);
        ps2=cambiarValor(ps1);
        
        System.out.println("ps2.nombre = " + ps1.nombre);
        
    }
    public static Persona cambiarValor(Persona ps){
        
        ps.nombre="Carla";
        return ps;
        
    }
}
