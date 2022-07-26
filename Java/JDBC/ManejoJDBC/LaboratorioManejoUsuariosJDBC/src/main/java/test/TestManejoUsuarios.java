package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;


public class TestManejoUsuarios {

    public static void main(String[] args) {
        Connection conexion = null;
        UsuarioDAO usuario = new UsuarioDAO();
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            //aca poner las transacciones.
            Usuario nuevo1 = new Usuario("root", "papa1");
            usuario.insertar(nuevo1);

            Usuario nuevo2 = new Usuario("Matias", "Basilotttaaa");
            usuario.insertar(nuevo2);

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
