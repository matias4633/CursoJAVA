package test;

import domain.Persona;

public class TestForEach {

    public static void main(String[] args) {
        int edades[] = {5, 6, 7, 8, 9};

        Persona ps[] = {new Persona("Matias"), new Persona("Fabiana"),
            new Persona("Zoe")};

        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }
        //Declaracion del ForEach
        /*Funcionamiento: la variable declarada del foreach debe ser del
        mismo tipo de dato que el array a recorrer(o minimo de la clase padre)
        , esta variable guardara el
        valor desde la primera posicion del array hasta la ultima, uno a uno en cada
        vuelta.*/

        for (Persona pst : ps) {
            System.out.println("pst = " + pst);
        }

    }
}
