
package domain;

public class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Persona(String n){
        this.nombre=n;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + "},"+super.toString();
    }
    /*Al poner super.toString estamos llamando al metodo de la clase padre,
    en este caso es directamente objet, ToString de objet imprime la dire
    ccion de memoria del objeto.
    */
    
    
    
}
