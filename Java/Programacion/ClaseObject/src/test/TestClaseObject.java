
package test;

import domain.Empleado;
public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado("Juan",5000);
        Empleado empleado2=new Empleado("juan", 5000);
        
        if(empleado1==empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }
        else{
            System.out.println("Tiene diferente referencia en memoria.");
            
        }
        
        System.out.println(empleado1.equals(empleado2));
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El hashCode es igual");
        }
        else{
            System.out.println("El hashCode es Distinto");
        }
        
        /*
        el hashCode es igual porque esta calculado usando los mismos valores de
        los atributos. Si cambio una letra por miniscula en algun atributo ya
        daria el hashCode distinto.
        */
        
        
    }
}
