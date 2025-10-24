/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaPersistencia;

import capaLogica.LoginUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PersistenciaAdscripcion {
    
    
    
    private static final String SQL_Registrar = ("INSERT INTO registro_de_inasistencias.usuario(cedula)VALUES (?)");
    private static final String SQL_Iniciar = ("Select * FROM inasistencia_docente. contrasenia =?");
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
    
    
    public Boolean Iniciar(String Contrasenia) throws Exception {
        Boolean valido = false;
        try {
            Connection con = cone.getConnection();
            ps = con.prepareStatement(SQL_Iniciar);
            ps.setString(1, Contrasenia);
            rs = ps.executeQuery();
            if (rs.next()) {
                valido = true;
            }
            con.close();
        } catch (SQLException e) {
            throw new Exception("Error al validar inicio de sesión");

        }
        return valido;

    }
    
    public void Registro(LoginUsuario login) throws Exception {

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
