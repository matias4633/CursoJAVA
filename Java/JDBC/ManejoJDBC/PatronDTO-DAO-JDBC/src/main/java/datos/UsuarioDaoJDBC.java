
package datos;

import domain.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoJDBC implements UsuarioDao{

    private Connection conexionTransacciones;

    private static final String SQL_SELECT = "SELECT id_usuario,usuario,password FROM usuario;";
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario,password) VALUES(?,?);";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario= ?";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario=?,password=? WHERE id_usuario=?";

    public UsuarioDaoJDBC() {

    }

    public UsuarioDaoJDBC(Connection conexion) {
        this.conexionTransacciones = conexion;
    }

    public List<UsuarioDTO> selecionar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<UsuarioDTO> usuarios = new ArrayList<>();

        try {
            conn = this.conexionTransacciones != null ? this.conexionTransacciones : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");

                UsuarioDTO user = new UsuarioDTO(idUsuario, usuario, password);
                usuarios.add(user);
            }
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                if (this.conexionTransacciones != null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return usuarios;

    }

    public int insertar(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransacciones != null ? this.conexionTransacciones : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());

            registros = stmt.executeUpdate();
        } finally {
            try {
                Conexion.close(stmt);
                if (this.conexionTransacciones != null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int eliminar(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexionTransacciones != null ? this.conexionTransacciones : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
        } finally {
            try {
                Conexion.close(stmt);
                if (this.conexionTransacciones != null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int actualizar(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexionTransacciones != null ? this.conexionTransacciones : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
        } finally {
            try {
                Conexion.close(stmt);
                if (this.conexionTransacciones != null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

}