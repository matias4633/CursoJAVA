
package excepciones;
/*
Aca defino mi propia clase de excepcion, para que el compilador la reconosca
como tal debe extender de la clase Exception o alguna de las siguientes clases.
Debe tener un contructor que reciba un mensaje y subir este mensaje al contructor
de la clase padre con super.
*/

//public class OperacionExcepcion extends Exception {
//    
//    public OperacionExcepcion(String mensaje){
//        super(mensaje);
//    }
//}
public class OperacionExcepcion extends RuntimeException {
    
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}/*
y que pasa si la clase extiende de RuntimeException?
La diferencia es que el compilador no nos obliga a reportar la excepcion,
osea a usar el throws en la firma del metodo.
y tambien al uso de try catch
*/