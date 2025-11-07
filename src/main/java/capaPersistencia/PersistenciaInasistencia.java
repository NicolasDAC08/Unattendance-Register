/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaPersistencia;

import capaLogica.InasistenciaDocente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;




public class PersistenciaInasistencia {
    private static final String SQLGuardar = "INSERT INTO registro_de_inasistencias.inasistencia_docente(nombre, apellido, turno, fecha_finalizacion, fecha_inicio, cedula) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SQL_ELIMINAR = "DELETE FROM registro_de_inasistencias.inasistencia_docente WHERE id = ?";
    private static final String SQLMostrar = "SELECT * FROM registro_de_inasistencias.inasistencia_docente";
    
    //EXPERIMENTAL !!!!
    //*
    private static final String SQLELIMINAR_EXPIRADAS = "DELETE FROM registro_de_inasistencias.inasistencia_docente WHERE fecha_finalizacion < CURDATE()";
    //*
    //EXPERIMENTAL !!!!
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
    
    
    public void guardarInasistencias(InasistenciaDocente inasis) throws Exception,SQLException {     
        try {
            Connection con = Conexion.getConnection();
            ps = (PreparedStatement) con.prepareStatement(SQLGuardar);
            
            StringBuilder turnosSeleccionados = new StringBuilder();
            
            if (inasis.getTurno() != null && !inasis.getTurno().isEmpty()) {
                turnosSeleccionados.append(inasis.getTurno());
            }
            
            int resultado = 0;
            
            String turnosString = turnosSeleccionados.toString();
            
            ps.setString(1, inasis.getNombre());
            ps.setString(2, inasis.getApellido());
            ps.setString(3, turnosString);
            ps.setDate(4, new java.sql.Date(inasis.getFechaDeFinalizacion().getTime()));
            ps.setDate(5, new java.sql.Date(inasis.getFechaDeInicio().getTime()));
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
    
    public boolean eliminarInasistencia(int id) throws Exception {
        Connection conexion = null;
        PreparedStatement ps = null;
        
        try {
            conexion = Conexion.getConnection();
            ps = conexion.prepareStatement(SQL_ELIMINAR);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            throw new Exception("Error al eliminar inasistencia: " + e.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
    }
    

    
    public List<InasistenciaDocente> obtenerInasistencias() throws Exception {
        List<InasistenciaDocente> lista = new ArrayList<>();

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(SQLMostrar);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                InasistenciaDocente i = new InasistenciaDocente();
                i.setID(rs.getInt("id"));
                i.setNombre(rs.getString("nombre"));
                i.setApellido(rs.getString("apellido"));
                i.setCI(rs.getInt("cedula"));
                 i.setTurno(new StringBuilder(rs.getString("turno")));
                i.setFechaDeInicio(rs.getDate("fecha_inicio"));
                i.setFechaDeFinalizacion(rs.getDate("fecha_finalizacion"));
                
                lista.add(i);
            }
        } catch (Exception e) {
            throw new Exception("Error al obtener inasistencias: " + e.getMessage());
        }
        return lista;
    }
    

    //EXPERIMENTAL !!!!!!!1
    // Método para eliminar inasistencias expiradas
    public int eliminarInasistenciasExpiradas() throws Exception {
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(SQLELIMINAR_EXPIRADAS)) {
            
            return ps.executeUpdate();
            
        } catch (SQLException e) {
            throw new Exception("Error al eliminar inasistencias expiradas: " + e.getMessage());
        }
    }
    
    // Programar tarea automática - CORREGIDO
    public void programarLimpiezaAutomatica() {
        
        // Usar java.util.Timer para tareas programadas
        java.util.Timer timer = new java.util.Timer(true); // true = daemon timer
        
        java.util.TimerTask tarea = new java.util.TimerTask() {
            @Override
            public void run() {
                try {
                    int eliminadas = eliminarInasistenciasExpiradas();
                    if (eliminadas > 0) {
                        System.out.println("Inasistencias eliminadas automáticamente: " + eliminadas);
                    }
                } catch (Exception e) {
                    System.err.println("Error en limpieza automática: " + e.getMessage());
                }
            }
        };
        
        // Programar para ejecutar todos los días a la 1:00 AM
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 1);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        
        
        timer.scheduleAtFixedRate(tarea, calendar.getTime(), 24 * 60 * 60 * 1000); // Cada 24 horas
    }
    
    //EXPERIMENTAL !!!!!!!!
}

