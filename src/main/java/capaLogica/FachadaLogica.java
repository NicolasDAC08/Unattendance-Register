/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

import capaPersistencia.PersistenciaAdscripcion;
import capaPersistencia.PersistenciaUsuario;
import capaPersistencia.PersistenciaInasistencia;

/**
 *
 * @author Usuario
 */
public class FachadaLogica {

    public void guardarInasistencias(InasistenciaDocente prop) throws Exception {
        PersistenciaInasistencia inasis = new PersistenciaInasistencia();
        inasis.guardarInasistencias(prop);

    }

    public void eliminarInasistencia(int cedula) throws Exception {
        PersistenciaInasistencia pers = new PersistenciaInasistencia();
        pers.eliminarInasistencia(cedula);
    }


    public void Registro(Usuario login) throws Exception {
        PersistenciaAdscripcion us = new PersistenciaAdscripcion();
        us.Registro(login);
    }

    public Boolean IniciarAds(String cedula, String contrasenia) throws Exception {
        PersistenciaAdscripcion persistencia = new PersistenciaAdscripcion();
        return persistencia.Iniciar(contrasenia, cedula);
    }

    
    public boolean IniciarUs(int cedula) throws Exception{
        PersistenciaUsuario us = new PersistenciaUsuario();
        return us.Iniciar(cedula);
    } 
}
   
   
   
   
   
   
   
   
   
   

