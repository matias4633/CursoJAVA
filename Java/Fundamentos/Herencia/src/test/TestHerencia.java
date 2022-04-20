package test;

import domain.Empleado;
import domain.Cliente;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado emp1=new Empleado("Matias",80000);
        System.out.println("emp1 = " + emp1);
        
        emp1.getGenero();
        System.out.println("emp1 = " + emp1);

        Cliente cl1 = new Cliente(true, "Fabiana", 'f', 30, "Crisostomo Alvarez 3296");
        System.out.println("cl1 = " + cl1);

        Cliente cl2 = new Cliente(true, "Matias", 'v', 30, "Crisostomo Alvarez 3296");
        System.out.println("cl2 = " + cl2);
        
        
    }
}
