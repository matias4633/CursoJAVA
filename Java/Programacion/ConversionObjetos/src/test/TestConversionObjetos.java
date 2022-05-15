
package test;

import domain.Empleado;
import domain.Escritor;
//import domain.Gerente;
import domain.TipoEscritura;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado emp1=new Escritor("Matias",90000,TipoEscritura.CLASICO);
        //System.out.println("emp1 = " + emp1);;
        System.out.println(emp1.toString());
        
        /*
        Se puede guardar un objeto de tipo hijo en una referencia de 
        tipo padre, y se podra acceder solo a los metodos que esten
        definidos en ambas clases, y tendra prioridad el metodo
        de la clase hija.
        Si tengo definido un metodo en la clase hija, pero no en la clase
        padre, entonces no se podra acceder a ese metodo atravez
        de padre.metodo
        solo se podra forzar convirtiendo la variable al tipo hijo.
        
        */
        ((Escritor) emp1).getTipoescritura();//downcasting.
        /*
        aca estoy convirtiendo la variable de tipo padre a tipo hijo para acceder
        a los metodos definidos en la clase hija,aunque esta no este definida 
        en la clase tipo padre.
        
        referencia convertida de padre a hijo ---> downcasting
        referencia convertida de hijo a padre --> upcasting.
        */
        
        Escritor escritor=new Escritor("Fabiana",80000,TipoEscritura.CLASICO);
        
        Empleado empleado2;
        
        empleado2=escritor; //upcasting, de tipo hijo a padre,
        /*
        En el upcasting no es necesario poner la conversion explicita, pero en 
        el downcasting si.
        */
     
    }
}
