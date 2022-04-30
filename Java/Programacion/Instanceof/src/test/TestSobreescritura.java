package test;

import domain.*;

public class TestSobreescritura {

    public static void main(String[] args) {
        /*
        Polimorfismo: multiples comportamientos, solo se puede ver en tiempo
        de ejecucion*/
        Empleado emp1 = new Empleado("Juan", 5000);
//        System.out.println("emp1 = " + emp1.obtenerDetalles());
        imprimir(emp1);
        
        emp1= new Gerente("Carla",10000,"Contabilidad");
        /*
        la variable de tipo Empleado puede guardar la referencia de tipo 
        gerente por que empleado es padre de gerente.
        */
//        System.out.println("ger1 = " + ger1.obtenerDetalles());
        imprimir(emp1);
        
    }
    /*
    Usa de argumento el tipo mas generico que tengan tus clases.
    Aca uso polimorfismo, dependiendo del Tipo de objeto que mande al metodo,
    este tendra un comportamiento distinto, este comportamiento esta definido
    en la clase de ese objeto o sobre escrito en la clase hija.
    
    */
    /*
    El metodo sobre escrito no puede ser mas restrictivo, pero si menos restrictivo.
    */
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
        /*
        Aunque use de argumento un objeto de clase empleado, solo lo uso por que 
        es el mas generico, este argumento se podra comportar como de tipo Gerente.
        */
    }

}
