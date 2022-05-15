
package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura=new FiguraGeometrica();
        //Las clases abstractas no pueden ser instanciadas.
        //El objetivo de marcarla asi, es que no se pueda trabajar con la clase padre.
        
        FiguraGeometrica figura=new Rectangulo("Rectangulo");
        
        figura.dibujar();
        
    }
}
