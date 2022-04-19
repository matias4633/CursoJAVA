package clases;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona per1 = new Persona();
        System.out.println("per1 = " + per1);
        per1.nombre = "Juan";
        per1.apellido = "Perez";
        per1.desplegarInformacion();
    }
}
