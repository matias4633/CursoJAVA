
package aritmetica;

import excepciones.OperacionExcepcion;
/*
con el if estoy validando si tengo que mandar o no la excepcion, la palabra
throw significa lanzar, lanzo la excepcion, se crea un objeto de tipo (mi excepcion)
llamando a su contructor ya definido.
la palabra throws CLASEDEEXCEPCION colocada en la firma del metodo, le indica 
al compilador que este metodo puede que tire una excepcion. es obligatorio.
*/

public class Aritmetica {
    public static int division(int numerador, int denominador) throws OperacionExcepcion{
        if(denominador==0){
            throw new OperacionExcepcion("Division por cero");
        }
        return numerador/denominador;
    }
}
