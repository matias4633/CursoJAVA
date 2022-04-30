
package paquete1;

public class ClaseHija2 extends ClaseDefault {
    ClaseHija2(){
        super();
        this.atributoDefault="Modificacion atributo default";
        System.out.println("this.atributoDefault = " + this.atributoDefault);
        this.MetodoDefault();
    }
    
    /*
    Con default o package se podra acceder a todo siempre y cuando todo este
    en el mismo paquete,sin importar si es un clase hija o no.. 
    */
}
