package test;

import domain.Persona;

public class Matrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        edades[0][0]=5;
        edades[0][1]=7;
        edades[1][0]=8;
        edades[1][1]=4;
        
        System.out.println("edades[0][0] = " + edades[0][0]);
        
        for(int filas=0;filas<edades.length;filas++){
            for(int columnas=0;columnas<edades[filas].length;columnas++){
                /*edades[filas].length retorna el largo de esa fila,la cantidad de
                columnas que tiene esa fila en especifico.*/
                
                System.out.println("edades["+filas+"]["+columnas+"] = " + edades[filas][columnas]);
            }
        }
        
        String frutas[][]={{"Naranja","Limon"},{"Fresa","Zarzamora","Mora"}};
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j<frutas[i].length; j++) {
                System.out.println("frutas["+i+"]["+j+"] = " + frutas[i][j]);
            }
        }
        
        Persona personas[][]= new Persona[2][3];
        
        personas[0][0]= new Persona("Juan");
        personas[0][1]= new Persona("Karla");
        personas[0][2]= new Persona("Matias");
        System.out.println("\n");
        imprimir(frutas);
        System.out.println("\n");
        imprimir(personas);
        
    }
    
    public static void imprimir(Object matriz[][]){
       /*Que reciba como parametro un tipo object, significa que podra imprimir
        cualquier tipo de matriz,ya que en java todo deriva de objetos
        incluso los tipos primitivos.*/
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j<matriz[i].length; j++) {
                System.out.println("Matriz["+i+"]["+j+"] = " + matriz[i][j]);
            }
        }
    }
}
