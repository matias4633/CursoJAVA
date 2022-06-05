
package test;

import genericos.ClaseGenerica;


public class TesteGenericas {
    public static void main(String[] args) {
        ClaseGenerica<Float> objetofloat= new ClaseGenerica(15.5);
        /*
        Al instanciar la clase se indica el tipo de clase que sera la que 
        en principio es de tipo generico.
        */
        objetofloat.obtenerTipo();
        
        ClaseGenerica<String> objetoString=new ClaseGenerica("HOlA");
        
        objetoString.obtenerTipo();
    }
}
