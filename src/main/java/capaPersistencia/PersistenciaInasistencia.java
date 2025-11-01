/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaPersistencia;

import capaLogica.InasistenciaDocente;
import capaException.DBException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class PersistenciaInasistencia {
    private static final String SQLGuardar = "INSERT INTO registro_de_inasistencias.inasistencia_docente(nombre, apellido, turno, fecha_finalizacion, fecha_inicio, cedula) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SQL_ELIMINAR = ("DELETE FROM productos WHERE id= ?");
    private static final String SQLMostrar= ("Select * FROM registro_de_inasistencias.inasistencia_docente WHERE id =? AND nombre=? AND apellido=? AND turno=? AND fecha_inicio=? AND fecha_finalizacion=? AND cedula=?");
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
    
    
    public void guardarInasistencias(InasistenciaDocente inasis) throws Exception,SQLException {     
        try {
            Connection con = Conexion.getConnection();
            ps = (PreparedStatement) con.prepareStatement(SQLGuardar);
            
            int resultado = 0;
            
            ps.setString(1, inasis.getNombre());
            ps.setString(2, inasis.getApellido());
            ps.setString(3, inasis.getTurno());
            ps.setString(4, inasis.getFechaDeFinalizacion());
            ps.setString(5, inasis.getFechaDeInicio());
            ps.setInt(6, inasis.getCI());
            
            resultado = ps.executeUpdate();
            
            ps.close();
            
            if (resultado == 0) {
                throw new Exception("No se pudo guardar la inasistencia en la base de datos.");
            }
            
        } catch (SQLException e) {
            System.err.println("Error SQL: " + e.getMessage());
            System.err.println("Código SQL: " + e.getSQLState());
            throw new Exception("Error al registrar inaistencia, Verifique los datos e intentelo de nuevo.");       
        }
    }
    
    public void eliminarInasistencia(int id) throws Exception {

        try {
            String Eliminacion = null;
            Connection conexion;
            conexion = cone.getConnection();

            ps = conexion.prepareStatement(SQL_ELIMINAR);
            ps.setInt(1, id);
            int resultado = ps.executeUpdate();

            if (rs.next()) {
                Eliminacion = "Inasistencia eliminada con exito.";

            } else {
                Eliminacion = "Hubo un error.";
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    
    public List<InasistenciaDocente> obtenerInasistencias() throws Exception {
    List<InasistenciaDocente> lista = new ArrayList<>();

        try (Connection con = Conexion.getConnection()) {
            PreparedStatement ps = con.prepareStatement(SQLMostrar);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                InasistenciaDocente i = new InasistenciaDocente();
                i.setID(rs.getInt("id"));
                i.setNombre(rs.getString("nombre"));
                i.setApellido(rs.getString("apellido"));
                i.setCI(rs.getInt("cedula"));
                i.setTurno(rs.getString("turno"));
                i.setFechaDeInicio(rs.getString("fecha_inicio"));
                i.setFechaDeFinalizacion(rs.getString("fecha_finalizacion"));
                lista.add(i);
            }   }
    return lista;
}

}

