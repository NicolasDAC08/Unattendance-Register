/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaPersistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 57534278
 */
public class PersistenciaUsuario {
    private static final String SQL_Iniciar = ("Select * FROM registro_de_inasistencias.usuario WHERE cedula =?");
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
    
    
    public Boolean Iniciar(int cedula) throws Exception {
        Boolean valido = false;
        try {
            Connection con = cone.getConnection();
            ps = con.prepareStatement(SQL_Iniciar);
            ps.setInt(1, cedula);
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
}
