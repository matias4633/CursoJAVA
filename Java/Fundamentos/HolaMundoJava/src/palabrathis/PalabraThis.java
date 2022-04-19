
package palabrathis;


public class PalabraThis {
    
    public static void main(String[] args) {
        Persona ps1=new Persona(new String("Juan"),"Perez");
        // con el new String obliga a guardar la cadena en un nuevo espacio 
        // de memoria, si lo mando solo reutiliza la memoria.
        System.out.println("ps1 = " + ps1);
        System.out.println("ps1.nombre = " + ps1.nombre);
        System.out.println("ps1.apellido = " + ps1.apellido);
    }
    
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String n,String a){
        
        
        this.nombre=n;
        this.apellido=a;
        System.out.println("Objeto this: " + this);
        
        Imprimir imp = new Imprimir();
        imp.imprimir(this); 
        
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    
    public void imprimir(Persona ps){
        System.out.println("Persona desde imprimir  "+ ps );
        System.out.println("Imprimir objeto actual con this "+ this);
    }
}