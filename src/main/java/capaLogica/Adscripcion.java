/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

/**
 *
 * @author octavio
 */
public class Adscripcion extends Usuario {
    String Contrasenia;
    
    @Override
    public void setCedula(int cedula) {
        super.setCedula(cedula); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getCedula() {
        return super.getCedula(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }
    
    
}
