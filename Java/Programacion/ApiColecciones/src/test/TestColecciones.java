package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestColecciones {

    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miercoles");
        lista.add("Jueves");
        lista.add("Viernes");
        /*
        List es una interface la clase ArayList la implementa, esta clase permite
        crear un array
        de objetos de forma dinamica, no hace falta indicarle cuantos objetos tendra
        el array. La clase List es abstracta, Esta mantiene el orden en el cual
        se ingresaron los objetos al array. En la clase ArrayList se puede duplicar
        elementos.
        
         */
        lista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

        for (Object elemento : lista) {
            System.out.println("elemento = " + elemento);
        }

        /*
         Estas dos sintaxis hacen lo mismo, la Clase ArrayList tiene el metodo 
         forEach, este tipo de metodos se lo llama lamda o flecha,
         */
        lista.forEach(dato -> {
            System.out.println("dato = " + dato);
        });

        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
        /*
        La clase HashSet permite crear el array dinamicamente,
        pero no guarda el orden en el que se agregan, lo va cambiando de posiciones
        en el array, La ventaja es que puede ser mas rapido. En la clase HashSet 
        NO se puede duplicar elementos, si ve que se duplico, lo desecha.
         */
        imprimir(miSet);
        System.out.println("");
        /*
        La clase HashMap guarda valores en un array pero usando una clave(key)
        
         */

        Map miMapa = new HashMap();

        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Matias");
        miMapa.put("valor3", "Fabiana");

        Object elemento = miMapa.get("valor1");
        System.out.println("elemento = " + elemento);

        imprimir(miMapa.keySet());
        /*
        El metodo keySet devuelve un Set (array) con las llaves, al ser un Set,
        no se asegura el orden.
         */
        imprimir(miMapa.values());
        /*
        El metodo values devuelve un tipo Coleccion con los valores
         */

    }

    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }

}
