
package test;


public class TestArreglos {
    public static void main(String[] args) {
        int edades[]= new int[3]; //Forma de declarar un array.
        
        /*En java el array es un objeto. por eso se define como una
        instancia de la
        clase int double float etc.*/
        
        System.out.println("edades = " + edades);
        
        edades[0]=10; //modificando el valor dela primera posicion del array
        System.out.println("edades 0 = " + edades [0]);
        
        //edades[3]=7;//aunque no me marque error, marcara error en ejecucion
        // por que la posicion esta fuera de la definida
        
        for(int i=0;i< edades.length;i++){
            System.out.println("edades elemento "+i +": "+ edades[i]);
        }
    }
    
}
