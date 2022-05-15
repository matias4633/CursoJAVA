
package domain;


public class Escritor extends Empleado {
    
    final TipoEscritura tipoescritura;
    
    public Escritor(String nombre, float sueldo, TipoEscritura tipoescritura){
        super(nombre,sueldo);
        this.tipoescritura=tipoescritura;
        
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", tipoEscritura: "+ this.tipoescritura;
    }

    @Override
    public String toString() {
        return super.toString()+", Escritor{" + "tipoescritura=" + tipoescritura + '}';
    }

    public TipoEscritura getTipoescritura() {
        return tipoescritura;
    }
    
    
    
}
