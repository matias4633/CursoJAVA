package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica arit1 = new Aritmetica();
        int a=10;
        arit1.mostrarInfo();

        Aritmetica arit2 = new Aritmetica(5, 8);
        arit2.mostrarInfo();
        
        arit1=null;
        
    }
    
    public static void miMetodo(){
        
    }
}
