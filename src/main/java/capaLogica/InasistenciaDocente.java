

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

/**
 *
 * @author octavio
 */

public class InasistenciaDocente {
    
    private int ID;
    public String Nombre;
    public String Apellido;
    public int CI;
    public StringBuilder Turno;
    public java.util.Date fechaDeFinalizacion; 
    public java.util.Date fechaDeInicio;        

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

    public StringBuilder getTurno() {
        return Turno;
    }

    public void setTurno(StringBuilder Turno) {
        this.Turno = Turno;
    }

    public java.util.Date getFechaDeFinalizacion() {
        return fechaDeFinalizacion;
    }

    public void setFechaDeFinalizacion(java.util.Date fechaDeFinalizacion) {
        this.fechaDeFinalizacion = fechaDeFinalizacion;
    }

    public java.util.Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(java.util.Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

 
}
