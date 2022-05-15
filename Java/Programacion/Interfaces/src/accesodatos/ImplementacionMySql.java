
package accesodatos;

/*
La palabra reservada, implements significa que esta clase implementa el comporta-
miento de la interface mensionada, y asu vez como todos los metodos definidos en 
la interface son abstractos, obliga a que se implementen en esta clase.
*/
public class ImplementacionMySql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
         System.out.println("Listar desde Mysql");
    }

    @Override
    public void actualizar() {
         System.out.println("Actualizar desde Mysql");
    }

    @Override
    public void eliminar() {
         System.out.println("Eliminar desde Mysql");
    }
    
}
