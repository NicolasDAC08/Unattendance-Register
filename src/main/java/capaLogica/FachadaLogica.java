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

    public boolean IniciarAds(String contrasenia) throws Exception {
        PersistenciaAdscripcion ads = new PersistenciaAdscripcion();
        return ads.Iniciar(contrasenia);

    }
    
    public boolean IniciarUs(int cedula) throws Exception{
        PersistenciaUsuario us = new PersistenciaUsuario();
        return us.Iniciar(cedula);
    }
    
    public void obtenerInasistencias(InasistenciaDocente inasis) throws Exception{
        PersistenciaInasistencia per = new PersistenciaInasistencia();
        per.obtenerInasistencias();
       
    }
    
    
    
    
}
   
   
   
   
   
   
   
   
   
   

