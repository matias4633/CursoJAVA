
package enumeracion;


public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    private final int paises;
    /*al ser un enum, el contructor se llama automaticamente para cada
    item de la enumeracion secuencialmente. Osea, dice Africa, llama al contructor
    para africa, despues europa llama al contructor para europa etc.
    Esto pasa en el primer llamado, contruye uno por uno y luego regresa al
    punto de llamada. Se contruyen todos en la primera llamada, en las siguiente ya no.*/
    Continentes(int paises){
        this.paises=paises;
    }
    public int getPaises(){
        return this.paises;
    }
}
