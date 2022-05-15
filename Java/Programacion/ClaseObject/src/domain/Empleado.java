
package domain;

import java.util.Objects;


public class Empleado {
    protected String nombre;
    
    protected double sueldo;
    
    public Empleado(String nombre,double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
        
    }
    public String obtenerDetalles(){
        return "nombre "+this.nombre+", sueldo "+this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }
    /*
    el metodo hashCode, calcula un entero lo mas unico posible usando
    los atributos del objeto para asignarselo
    al objeto que se crea. El calculo puede variar.
    */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    /*
    el metodo equals compara dos objetos, el referenciado por this y otro que 
    mando por parametro. Compara el contenido de objetos.
    */
    
    
}
