
package test;

import accesodatos.*;


public class TestInterfaces {
    public static void main(String[] args) {
        /*IAccesoDatos datos = new IAccesoDatos();
        Como la interface simpre es abstracta, no se puede instanciar, por se 
        usa la implementacion.
        */
        
        IAccesoDatos datos=new ImplementacionMySql();
        datos.insertar();
        System.out.println("");
        imprimir(datos);
        
        
        datos= new ImplementacionOracle();
        datos.insertar();
        System.out.println("");
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.insertar();
    }
}
