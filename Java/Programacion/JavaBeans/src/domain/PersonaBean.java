
package domain;

import java.io.Serializable;

/*
Condiciones para que se le considere un JavaBeans debe implementar a Serializable,
los atributos deben ser privados, debe tener un constructor vacio, debe tener
los respectivos metodos get y set.
Serealizable es un interface.

*/

public class PersonaBean implements Serializable {
    
    private String nombre;
    private String apellido;
    
    public PersonaBean(){
        
    }
    
    public PersonaBean(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "PersonaBean{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
