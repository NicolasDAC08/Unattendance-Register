

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

/**
 *
 * @author octavio
 */
import java.sql.Date;

public class InasistenciaDocente extends Adscripcion {
    
    private int ID;
    public String Nombre;
    public String Apellido;
    public int CI;
    public String Turno;
    public String FechaDeFinalizacion;
    public String FechaDeInicio;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public void setCI(int Cedula) {
        this.CI = Cedula;
    }

    public int getCI() {
        return CI;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public String getFechaDeFinalizacion() {
        return FechaDeFinalizacion;
    }

    public void setFechaDeFinalizacion(String FechaDeFinalizacion) {
        this.FechaDeFinalizacion = FechaDeFinalizacion;
    }

    public String getFechaDeInicio() {
        return FechaDeInicio;
    }

    public void setFechaDeInicio(String FechaDeInicio) {
        this.FechaDeInicio = FechaDeInicio;
    }
    
    
}
