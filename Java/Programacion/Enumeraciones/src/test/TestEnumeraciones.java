
package test;

import enumeracion.Dias;
import enumeracion.Continentes;
        

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println(Dias.LUNES);
//        indicarDia(Dias.MARTES);
        System.out.println("Continente n. 4 : " + Continentes.AMERICA);
        System.out.println("Paises en el cuarto continente: "+ 
                Continentes.AMERICA.getPaises());
        
        System.out.println("Continente n. 1 : " + Continentes.AFRICA);
        System.out.println("Paises del primer continente: "+ 
                Continentes.AFRICA.getPaises());

    }
    private static void indicarDia(Dias dia){
        switch (dia){
            case LUNES:
                System.out.println("ES lunes perri,que fiaca");
                break;
            case MARTES:
                System.out.println("Es Martes, bueno, recien se arraca");
                break;
            default:
                System.out.println("Dia no encontrado");
        }
    }
}
