
package test;


public class TestAutoboxinUnboxing {
    public static void main(String[] args) {
        /*
        Clases envolventes(Wrapper) de tipos primitivos
        
        int -Integer
        long - Long
        float - Float
        double - Double
        booulean - Boolean
        byte - Byte
        char - Character
        short- Short
        */
        
        Integer numero=10;/*
        Esto es el Autoboxing, la literal primitiva se comvierte en un tipo
        Object. Se puede usar como un pritivo usando su valor pero te da mas posi
        bilidades al tener disponibles los metodos del objeto.
        */
        System.out.println("numero = " + numero);
        System.out.println("numero = " + numero.toString());
        
        int numero2=numero;
        /*
        Aca se esta trasformando un tipo Objet (numero) a un tipo primitivo
        (int). Este el concepto de Unboxing, extrae el valor primitivo del objeto.
        */
        System.out.println("numero2 = " + numero2);
        
    }
}
