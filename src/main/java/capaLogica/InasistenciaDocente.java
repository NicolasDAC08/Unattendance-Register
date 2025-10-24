

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
    public Date FechaDeFinalización;
    public Date FechaDeInicio;

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

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public Date getFechaDeFinalización() {
        return FechaDeFinalización;
    }

    public void setFechaDeFinalización(Date FechaDeFinalización) {
        this.FechaDeFinalización = FechaDeFinalización;
    }

    public Date getFechaDeInicio() {
        return FechaDeInicio;
    }

    public void setFechaDeInicio(Date FechaDeInicio) {
        this.FechaDeInicio = FechaDeInicio;
    }
    
    
}
