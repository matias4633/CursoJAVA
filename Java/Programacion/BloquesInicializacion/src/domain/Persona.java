package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    static {
        System.out.println("Ejecutando bloque de inicializacion estatico.");
        ++Persona.contadorPersonas;
        //idPersona=10; en este bloque solo se podra usar variables estaticas
    }

    /*De esta manera se declara un bloque de inicializacion static,
    estos de ejecutaran antes que el contructor e incluso antes de los bloques
    de inicialicion no estaticos. Este bloque se ejecutara solo una vez,
    al momento de cargar esta clase en memoria.*/

 /*Este es un bloque NO estatico, se ejecutara cada vez que 
    creemos un objeto.
     */
    {
        System.out.println("Ejecutando bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del Contructor");
    }
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
