
package manejoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo){
        File archivo=new File(nombreArchivo);//Crea un objeto del archivo en memoria
        try{
        PrintWriter salida=new PrintWriter(archivo);//Escribe el archivo en disco
        salida.close();//Cierra el Archivo.
            System.out.println("Se ha creado el archivo");
        }catch(Exception x){
            System.out.println("Error al guardar el archivo");
            x.printStackTrace(System.out);
        }
    }
    
    public static void escribirArchivo(String nombreArchivo, String contenido){
        File archivo=new File(nombreArchivo);//Crea un objeto del archivo en memoria
        try{
        PrintWriter salida=new PrintWriter(archivo);//Escribe el archivo en disco
        salida.println(contenido);//Imprime el contenido en el archivo
        
        salida.close();//Cierra el Archivo.
            System.out.println("Se ha escrito el archivo");
        }catch(Exception x){
            System.out.println("Error al guardar el archivo");
            x.printStackTrace(System.out);
        }
    }
    
    public static void anexarArchivo(String nombreArchivo,String contenido){
        
        File archivo=new File(nombreArchivo);//Crea un objeto del archivo en memoria
        try{
        PrintWriter salida=new PrintWriter(new FileWriter(archivo,true));//Escribe el archivo en disco
        salida.println(contenido);//Imprime el contenido en el archivo
        
        salida.close();//Cierra el Archivo.
            System.out.println("Se ha anexado informacion al archivo");
        }catch(IOException x){
            System.out.println("Error al guardar el archivo");
            x.printStackTrace(System.out);
        }
        
    }
    
    public static void leerArchivo(String nombreArchivo){
        var archivo= new File(nombreArchivo);
        
        try {
            var entrada=new BufferedReader(new FileReader(archivo));
            var lectura= entrada.readLine();
            
            while(lectura!=null){
                System.out.println("lectura = " + lectura);
                lectura=entrada.readLine();
            }
            entrada.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);        
        }
    }
}
