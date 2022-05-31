
package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        /*
        El catch se puede comprobar varias excepciones, se recomienda, de las de 
        menor jerarkia, hasta las de mayor, la mayor es la de tipo Exception.
        */
        int resultado=0;
        try{
        resultado=Aritmetica.division(10, 0);
        }catch(OperacionExcepcion b){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(b.getMessage());
        }catch(Exception a){
            System.out.println("Que paso que paso vamoa say");
            a.printStackTrace(System.out);
            
            /*
            la variable a de tipo Exception usa el metodo printStackTrace,
            que imprime la pila de excepciones, la manda a la consola con System.out
            
            */
        }
        finally{
            System.out.println("Se reviso la division entre cero.");
            /*
            Este bloque pertenece al try catch, este bloque se ejecuta siempre,
            ocurra o no la excepcion.
            */
        }
        
        /*
        El 
        
        try{
            Intrucciones que dan el problema.
        }catch(Exception x){
            Intrucciones si hay una Excepcion.
        }
        */
  
        System.out.println("resultado = " + resultado);
    }
}
