
package accesodatos;

/*
las interfaces no heredan de la clase object, pero si existe la herencia
entre interfaces.
Todos los atributos de una interface son CONSTANTES, y obligatoriamente se le tiene
que asignar un valor.
Las interfaces, no tienen constructor.
Cualquier metodo definido en una interface, siempre sera abstracto.
*/
public interface IAccesoDatos {
    int MAX_REGISTRO= 10;
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
}
