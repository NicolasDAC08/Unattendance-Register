/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaPersistencia;

import capaException.DBException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Doctor Mengueche
 */

public class Conexion {
    public static Connection getConnection() throws DBException {
        Connection con=null;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registro_de_inasistencias?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            }catch(SQLException sqle){
            throw new DBException("Hubo un error al conectarse a la base de datos del sistema.");
        }
        return con;
    }
    
}
