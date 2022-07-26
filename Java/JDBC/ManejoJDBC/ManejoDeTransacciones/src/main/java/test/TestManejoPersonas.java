package test;

import datos.PersonaDAO;
import datos.Conexion;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;


/*DAO es Data access object*/
public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaDAO personaDao = new PersonaDAO();
            Persona cambiarPersona = new Persona(8, "Raquel", "Ajhuacho", "raquelitasupi@gmail.com", "1156226789");

            personaDao.actualizar(cambiarPersona);

            Persona insertarPersona = new Persona("Zoe", "Basilotta", "zoe@gmail.com", "1122334455");
            personaDao.insertar(insertarPersona);

            conexion.commit();// en esta linea se hace el commit manualmente, se guardan los cambios.
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }

}
