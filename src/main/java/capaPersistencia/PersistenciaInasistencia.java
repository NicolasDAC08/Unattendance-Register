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
import java.sql.Date;




public class PersistenciaInasistencia {
    private static final String SQLGuardar = ("INSERT INTO registro_de_inasistencias.inasistencia_docente(id,nombre,apellido,cedula,turnos,fecha_inicio,fecha_final)VALUES (?,?,?,?,?,?)");        private static final String SQL_ELIMINAR = ("DELETE FROM productos WHERE id= ?");
    private static final String SQLELIMINAR = ("DELETE FROM inasistencia_docente WHERE cedula= ?");
    private static final String SQLMostrar = ("Select * FROM registro_de_inasistencias.inasistencia_docente WHERE id =? AND nombre=? AND apellido=? AND turno=? AND fecha_inicio=? AND fecha_final=?");
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
    
    
    public void guardarInasistencias(InasistenciaDocente inasis) throws Exception, SQLException {     
        try {
            int resultado = 0;
   
            Connection con = cone.getConnection();
            ps = (PreparedStatement) con.prepareStatement(SQLGuardar);
            ps.setInt(1, inasis.getID());
            ps.setString(2, inasis.getNombre());
            ps.setString(3, inasis.getApellido());
            ps.setString(4, inasis.getTurno());
            ps.setDate(5, inasis.getFechaDeFinalización());
            ps.setDate(6, inasis.getFechaDeInicio());

            resultado = ps.executeUpdate();
        } catch (SQLException e) {
            throw new Exception("Error al registrar inaistencia, Intentelo de nuevo mas tarde.");

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
    
    public void mostrarInasistenciaAdmin(int id) throws Exception {
        InasistenciaDocente inasis = new InasistenciaDocente();
        Connection con;
        try {
            con = cone.getConnection();
            ps = (PreparedStatement) con.prepareStatement(SQLMostrar);
            rs = ps.executeQuery();
            if (rs.next()) {
                int ID = rs.getInt("id");
                String Nombre = rs.getString("nombre");
                String Apellido = rs.getString("apellido");
                int Cedula = rs.getInt("cedula");
                String Turno = rs.getString("turno");
                Date FechaDeInicio = rs.getDate("fecha_inicio");
                Date FechaDeFinalizacion = rs.getDate("fecha_final");
                

                inasis.setID(id);
                inasis.setNombre(Nombre);
                inasis.setApellido(Apellido);
                inasis.setCedula(Cedula);
                inasis.setTurno(Turno);
                inasis.setFechaDeInicio(FechaDeInicio);
                inasis.setFechaDeFinalización(FechaDeFinalizacion);
                
            } else {
                throw new DBException("El producto no esta ingresado, por favor ingreselo");
            }
            con.close();
        } catch (DBException e) {

            throw new DBException("No pude obtener el producto");
        }

        //return inasis;
    }
    
    public void mostrarInasistenciausuario(int cedula) throws Exception {
        InasistenciaDocente inasis = new InasistenciaDocente();
        Connection con;
        try {
            con = cone.getConnection();
            ps = (PreparedStatement) con.prepareStatement(SQLMostrar);
            rs = ps.executeQuery();
            if (rs.next()) {
                String Nombre = rs.getString("nombre");
                String Apellido = rs.getString("apellido");
                int Cedula = rs.getInt("cedula");
                String Turno = rs.getString("turno");
                Date FechaDeInicio = rs.getDate("fecha_inicio");
                Date FechaDeFinalizacion = rs.getDate("fecha_final");
                

                inasis.setNombre(Nombre);
                inasis.setApellido(Apellido);
                inasis.setCedula(Cedula);
                inasis.setTurno(Turno);
                inasis.setFechaDeInicio(FechaDeInicio);
                inasis.setFechaDeFinalización(FechaDeFinalizacion);
                
            } else {
                throw new DBException("El producto no esta ingresado, por favor ingreselo");
            }
            con.close();
        } catch (DBException e) {

            throw new DBException("No pude obtener el producto");
        }

        //return inasis;
    }
}

