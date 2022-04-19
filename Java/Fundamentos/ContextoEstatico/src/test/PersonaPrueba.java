
package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    
    
    public static void main(String[] args) {
        Persona ps1=new Persona("Matias");
        
        System.out.println("Persona1 : "+ ps1);
        
        Persona ps2= new Persona("Fabiana");
        System.out.println("ps2 = " + ps2);
        
        imprimir(ps1);
        
        
    }
    
    static public void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Carlos"));
        return this.contador;
    }
}
