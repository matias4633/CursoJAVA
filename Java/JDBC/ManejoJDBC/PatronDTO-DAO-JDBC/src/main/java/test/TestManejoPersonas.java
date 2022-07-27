package test;

import datos.Conexion;
import datos.PersonaDao;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


/*DAO es Data access object*/
public class TestManejoPersonas {

    public static void main(String[] args) {
       Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaDao personaDao = new PersonaDaoJDBC();
            List<PersonaDTO> personas = personaDao.selecionar();
            
            for(PersonaDTO persona:personas){
                System.out.println("Persona DTO:" +persona);
            }
            
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

