
package test;

import datos.Conexion;
import datos.UsuarioDao;
import datos.UsuarioDaoJDBC;
import domain.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public class TestManejoUsuarios {

    public static void main(String[] args) {
        Connection conexion = null;
        UsuarioDao usuario = new UsuarioDaoJDBC();
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            //aca poner las transacciones.
            List<UsuarioDTO> usuarios=usuario.selecionar();
            
            for(UsuarioDTO user:usuarios){
                System.out.println("Usuario DTO : "+user);
                
            }

            conexion.commit();

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