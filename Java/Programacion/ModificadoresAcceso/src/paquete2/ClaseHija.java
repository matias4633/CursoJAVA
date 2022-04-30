
package paquete2;

import otras.ClaseProtected;


public class ClaseHija extends ClaseProtected{
    public ClaseHija(){
        super();
        this.atributoProtected="Modificacion atributo protected.";
        System.out.println("this.atributoProtected = " + this.atributoProtected);
        this.MetodoProtected();
    }
    /*
    Al ser una clase hija, se puede usar directamente los atributos y metodos 
    directamente.Auque la clase hija este en otro paquete.
    */
}
