
package test;


import static manejoarchivos.ManejoArchivos.*;


public class TestManejoArchivos {
    public static void main(String[] args) {
//        var nombreArchivo="C:\\Cursos\\Java\\Programacion\\ManejoArchivos\\prueba.txt";
        /*
        mas que nombre, yo lo llamaria ruta y tipo del archivo con la extension
        asi se usa la ruta en windows con sobre barra invertida, usa es para escapar 
        el caracter de barra invertida, no crea la carpeta si es que no existe.
        */
        
        //var nombreArchivo="/Cursos/Java/Nuevacarpeta/prueba.txt";
        //asi en Mac o linux.
        var nombreArchivo="prueba";
        
        //crearArchivo(nombreArchivo);
        
//        escribirArchivo(nombreArchivo, "Hola desde Java");
//        escribirArchivo(nombreArchivo, "Segunda escritura");
        /*
        escribirArchivo crea, abre, escribe y cierra el archivo. Pero lo llamo
        dos veces se suplanta lo anterior
        */
        
//        anexarArchivo(nombreArchivo, "Hola desde Java");
//        anexarArchivo(nombreArchivo, "Segunda escritura");
        
        leerArchivo(nombreArchivo);
    }
}
