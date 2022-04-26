
package test;


public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5,6);
        imprimirNumeros(1,2);
        
        variosParamentros("Varios parametros",7,8,9,20);
    }
    
    private static void imprimirNumeros(int... numeros){
        /*al usar la sintaxis int... usamos un argumento variable.
        significa que no definimos cuantos espacios va a tener, se define
        en la ejecucion al pasar los argumentos. numeros sera un array en ejecucion*/
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: "+ numeros[i]);
        }
    }
    
//    private static void variosParamentros(int... numeros,String nombre){
//        Esto dara error por que en necesario que el agumento variable,
//        sea el ultimo en la lista de argumentos.
//    }
    private static void variosParamentros(String nombre,int... numeros){
        System.out.println("nombre = " + nombre);
      for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: "+ numeros[i]);
        }
      }
    
}
