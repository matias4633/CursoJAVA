package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Juan", 5000);
        //determinarTipo(emp1);
        //emp1 = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(emp1);
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado;
            //copio la referencia guardada en la variable empleado
            //y la guardo en la variable de tipo gerente, por que ya se que es
            //de ese tipo por el instanceof.
            System.out.println("gerente = " + gerente.getDepartamento());
            //((Gerente) empleado).getDepartamento(); sintaxis corta.
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            /*
            Esto dara un error en ejecucion, por que estoy poniendo una referencia
            de clase padre(Empleado) en una variable de tipo hija(Gerente).
            No dara un error en complilacion.
            */
//            Gerente gerente = (Gerente)empleado;
//            System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("empleado = " + empleado.getNombre());
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
        
        /*
        instanceof pregunta si la variable que guarda la referencia apunta es
        del tipo especificado. variable instanceof tipoQueApuntaPregunta.
        devuelve un boolean. Pero como un objeto es de un tipo y al mismo tiempo
        de sus clases padres se debe preguntar desde la ultima clase hija para atras.
        
        */
        
    }

}
