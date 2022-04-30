
package otras;


public class ClaseProtected {
    /*
    protected no aplica a clases.
    */
    
    protected String atributoProtected="Valor atributo protected";
    
    protected ClaseProtected(){
        System.out.println("Contructor protected");
    }
    public ClaseProtected(String string){
        System.out.println("Constructor publico");
    }
    
    protected void MetodoProtected(){
        System.out.println("Metodo Protected");
    }
}
