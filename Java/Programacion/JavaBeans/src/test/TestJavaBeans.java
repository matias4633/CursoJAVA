
package test;


import domain.PersonaBean;
public class TestJavaBeans {
    public static void main(String[] args) {
        PersonaBean persona=new PersonaBean();
        persona.setNombre("Matias");
        persona.setApellido("Basilotta");
        
        System.out.println("persona = " + persona);
        
        System.out.println("Persona nombre= "+ persona.getNombre());
        System.out.println("Persona apellido= "+ persona.getApellido());
        
        /*Serializable significa que el objeto se combierte a ceros y unos, se
                usa para transferirse atravez de la red a otro servidor */
        
    }
}
