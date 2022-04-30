package test;


import paquete1.Clase1;
import paquete2.ClaseHija;

public class TestModificadoresAcceso {

    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.Metodo();

        /*
        public aplica a clases, atributos,contructores y metodos, es el menos restrictivo
        los tres se podran acceder desde cualquier parte del codigo, desde el mismo
        paquete u otro paquete tambien desde las clases hijas.
         */
//        ClaseProtected claseProtected = new ClaseProtected("HOla");
//        System.out.println("clase1 = " + claseProtected.atributoProtected);
//        claseProtected.MetodoProtected();
      /*
        protected no aplica a clases. El constructor de tipo protected no podra ser 
        usado desde otro paquete. Solo padra ser utilizado desde clases hijas,
        usando super(), pero nunca se heredan los constructores.
        No se puede acceder directamente al atributo protegido, solo se podra mediante
        los get y set del atributo. Solo las clases hijas podran acceder al atributo marcado
        como protected. Tampoco se puede acceder a los metodos protectes desde otro paquete
        .Protected es todo para mis hijas, para los demas nada.
         */
        System.out.println("");
      ClaseHija claseHija=new ClaseHija();
        System.out.println("claseHija = " + claseHija);
        
         /*Para default
    Se puede usar todo siempre y cuando este en el mismo paquete, 
    sin importar si es clase hija o no.
    */
         
         /*
         Para private
         NO aplica a clases.
         los atributos, metodos, atributos marcados como private solo podran ser 
         usados desde la misma clase, sin importar si otras clases esten en el mismo 
         paquete o en otro.Tampoco desde una clase hija.
         */

    }

}
