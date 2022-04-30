
package paquete1;


public class TestClaseDefault {
    public static void main(String[] args) {
        ClaseDefault claseDefault=new ClaseDefault();
        claseDefault.atributoDefault="Cambio del la prueba en el mismo paquete.";
        System.out.println("claseDefault atributo default = " + claseDefault.atributoDefault);
        claseDefault.MetodoDefault();
    }
    /*
    Se puede usar todo siempre y cuando este en el mismo paquete, 
    sin importar si es clase hija o no.
    */
}
