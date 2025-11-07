
package capaPersistencia;

import capaLogica.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PersistenciaAdscripcion {
    
    
    
    private static final String SQL_Registrar = ("INSERT INTO registro_de_inasistencias.usuario(cedula)VALUES (?)");
    private static final String SQL_Iniciar = ("SELECT * FROM registro_de_inasistencias.adscripto WHERE cedula = ? AND contrasenia = ?");
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
    
    
        public Boolean Iniciar(String contrasenia, String cedula) throws Exception {
        Boolean valido = false;
        
        try (Connection con = cone.getConnection();
             PreparedStatement ps = con.prepareStatement(SQL_Iniciar)) {
            
            ps.setString(1, cedula);
            ps.setString(2, contrasenia);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    valido = true;
                }
            }
            
        } catch (SQLException e) {
            throw new Exception("Error al validar inicio de sesión: " + e.getMessage());
        }
        return valido;
    }

    
    public void Registro(Usuario login) throws Exception {

        try {
            Connection con = cone.getConnection();
            ps = con.prepareStatement(SQL_Registrar);
            ps.setInt(1, login.getCedula());
            int resultado = ps.executeUpdate();

            if (resultado <= 0) {
                throw new Exception("No se pudo registrar el usuario");
            }
            con.close();
        } catch (SQLException e) {
            throw new Exception("Error al registrar al usuario");
        }
    }

}
