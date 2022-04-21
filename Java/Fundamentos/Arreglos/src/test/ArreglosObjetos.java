
package test;
import domain.Persona;

public class ArreglosObjetos {
    public static void main(String[] args) {
        Persona personas[]=new Persona[2];//Personas[] es una array
                                            //de direcciones que apuntan
                                            //a objetos, se deben crear los nuevos 
                                            //objetos.
        personas[0]=new Persona("Matias");
        personas[1]=new Persona("Fabiana");
        
        System.out.println("personas[0] = " + personas[0].toString());
        System.out.println("personas[1] = " + personas[1].toString());
        
        for(int i=0;i<personas.length;i++){
            System.out.println("personas["+i+"] : " + personas[i]);
        }
    }
}
