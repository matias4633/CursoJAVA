package test;

import operaciones.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 4);
        System.out.println("resultado = " + resultado);
        
        var resultado2=Operaciones.sumar(5.0, 4);
        /*Para que java use el de tipo double uno de los argumentos debe ser
        de este tipo. Sino va a usar el de tipo entero.
        */
        System.out.println("resultado2 = " + resultado2);
        
        var resultado3= Operaciones.sumar(3, 5L);
        
        System.out.println("resultado3 = " + resultado3);
       
        
        
    }

}
