
package domain;


public enum TipoEscritura {
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");
    
    private final String descripcion;
    
    private TipoEscritura(String descrip){
        this.descripcion=descrip;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
}
