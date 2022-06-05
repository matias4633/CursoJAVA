
package genericos;

/*
Al etiquetar la clase con <T> me permite crear la clase, con atributos genericos.
La T significa que en el momento de instanciar la clase puedo definir el tipo del 
atributo siempre y cuando sea un objeto, cualquiera, pero no tipos primitivos,
solo como objetos, incluso mis propios tipos de objetos.
*/
public class ClaseGenerica<T> {
    
    private T objeto;
    
    public ClaseGenerica(T objeto){
        this.objeto=objeto;
    }
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
