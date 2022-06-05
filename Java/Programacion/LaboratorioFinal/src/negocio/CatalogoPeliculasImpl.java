package negocio;

import excepciones.LecturaDatosEx;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {

    public CatalogoPeliculasImpl() {

    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        File archivo = new File(nombreArchivo);//Crea un objeto del archivo en memoria
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));//Escribe el archivo en disco
            salida.println(nombrePelicula);//Imprime el contenido en el archivo

            salida.close();//Cierra el Archivo.
            System.out.println("Pelicula agregada exitosamente.");
        } catch (IOException x) {
            System.out.println("Error al guardar la pelicula.");
            x.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo){
        var archivo= new File(nombreArchivo);
        
        try {
            var entrada=new BufferedReader(new FileReader(archivo));
            var lectura= entrada.readLine();
            
            while(lectura!=null){
                System.out.println("Pelicula = " + lectura);
                lectura=entrada.readLine();
            }
            entrada.close();
            
        } catch (FileNotFoundException ex) {
            
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);        
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        var archivo= new File(nombreArchivo);
        
        try {
            var entrada=new BufferedReader(new FileReader(archivo));
            var lectura= entrada.readLine();
            
            while(lectura!=null){
                if(lectura.equals(buscar)){
                    System.out.println("La pelicula esta disponible!");
                    break;
                }
            }
            System.out.println("Pelicula no Disponible.");
            entrada.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);        
        }
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        File archivo=new File(nombreArchivo);//Crea un objeto del archivo en memoria
        try{
        PrintWriter salida=new PrintWriter(archivo);//Escribe el archivo en disco
        salida.close();//Cierra el Archivo.
            System.out.println("Se ha creado el archivo");
        }catch(FileNotFoundException x){
            System.out.println("Error al crear el archivo");
            x.printStackTrace(System.out);
        }
    }

}
