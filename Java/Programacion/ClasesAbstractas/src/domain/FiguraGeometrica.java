
package domain;

/*
El marcar un metodo como abstract me permite no definir el comportamiento
del metodo en el momento por si nose que hace en este momento.
A su vez, esto obliga a marcar toda la clase como abstract,
Y el marcar la clase como abstract obliga a definir el metodo abstract en la 
clase hija.
*/
public abstract class FiguraGeometrica {
    protected String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura=tipoFigura;
    }
    
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
    
}
