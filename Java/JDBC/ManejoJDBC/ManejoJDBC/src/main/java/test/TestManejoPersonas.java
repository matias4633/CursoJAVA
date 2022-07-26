package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;


/*DAO es Data access object*/
public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
        

//        for (Persona persona : personas) {
//            System.out.println("persona = " + persona);
//        }

        Persona personaNueva = new Persona(6,"marge", "Piripipi", "raque@gmail.com", "1156226789");
//        PersonaDAO.insertar(personaNueva);
        
        //personaDao.eliminar(personaNueva);
        
        personaDao.actualizar(personaNueva);
        
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            ex.printStackTrace(System.out);
        }
        List<Persona> personas = personaDao.selecionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}
