package Operaciones;

public class Aritmetica {
    //ATRIBUTOS
    int a;
    int b;
    
    //Constructor vacio
    
    public Aritmetica(){
        System.out.println("Ejecutando constructor vacio");
    }
    
    //Segundo constructor,(sobrecarga de constructores)
    
    public Aritmetica(int arg1, int arg2){
        this.a=arg1;
        this.b=arg2;
        System.out.println("Segundo constructor iniciado");
    }
    
    //METODOS
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        int resultado = a + b;
        return resultado;
    }

    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
        return this.sumarConRetorno();

    }
    public void mostrarInfo(){
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
    }
}
