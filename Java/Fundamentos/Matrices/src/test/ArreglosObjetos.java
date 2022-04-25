
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
        System.out.println("personas[1] = " + personas[1].toString()+"\n");
        
        for(int i=0;i<personas.length;i++){
            System.out.println("personas["+i+"] : " + personas[i]);
        }
        String frutas[] = {"Naranja","Banana","Manzana"}; 
        /*Inicio el array directamente asigno los valores que quiero,
        la cantidad que asigne de esa cantidad sera el array. Se le llama
        sintaxis resumida.*/
         for(int i=0;i<frutas.length;i++){
            System.out.println("Frutas["+i+"] : " + frutas[i]);
        }
        
        
        
    }
}
