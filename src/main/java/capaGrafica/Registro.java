/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capaGrafica;

import capaLogica.FachadaLogica;
import capaLogica.InasistenciaDocente;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
/**
 *
 * @author octavio
 */
public class Registro extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Registro.class.getName());   
    
    
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        configuracionParaLaSeleccionDeFechas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreDocente = new javax.swing.JTextField();
        ApellidoDocente = new javax.swing.JTextField();
        CedulaDocente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnIngresar = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();
        btnTablaDeDatos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnmatutino = new javax.swing.JToggleButton();
        btnvespertino = new javax.swing.JToggleButton();
        btnnocturno = new javax.swing.JToggleButton();
        spinnerFechaInicio = new javax.swing.JSpinner();
        spinnerFechaFinalizacion = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NombreDocente.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        NombreDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreDocenteActionPerformed(evt);
            }
        });

        ApellidoDocente.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N

        CedulaDocente.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        CedulaDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaDocenteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        jLabel3.setText("Cedula");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        jLabel4.setText("Turno a los que afecta");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        jLabel5.setText("Fecha de finalizacion de la inasistencia");

        BtnIngresar.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        BtnIngresar.setText("Ingresar datos");
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        BtnVolver.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        BtnVolver.setText("Volver");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        btnTablaDeDatos.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        btnTablaDeDatos.setText("Ir a tabla de datos");
        btnTablaDeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaDeDatosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        jLabel6.setText("Informacion personal del docente");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        jLabel7.setText("Fecha de inicio de la inasistencia");

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        jLabel8.setText("Tiempos");

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 3, 12)); // NOI18N
        jLabel9.setText("REGISTRO DE INASISTENCIA");

        btnmatutino.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        btnmatutino.setText("Matutino");
        btnmatutino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmatutinoActionPerformed(evt);
            }
        });

        btnvespertino.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        btnvespertino.setText("Vesperitno");
        btnvespertino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvespertinoActionPerformed(evt);
            }
        });

        btnnocturno.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        btnnocturno.setText("Nocturno");
        btnnocturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnocturnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnTablaDeDatos)
                        .addGap(18, 18, 18)
                        .addComponent(BtnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ApellidoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CedulaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(NombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 349, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(BtnIngresar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(121, 121, 121))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(71, 71, 71)
                                                            .addComponent(jLabel8))
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(34, 34, 34)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(74, 74, 74)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnmatutino)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnvespertino)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnnocturno))
                                            .addComponent(spinnerFechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(2, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(NombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApellidoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CedulaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnvespertino)
                    .addComponent(btnnocturno)
                    .addComponent(btnmatutino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spinnerFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerFechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addComponent(BtnIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnVolver)
                    .addComponent(btnTablaDeDatos))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
    //verifica si el usuario dejo campos vacios dentro los text fields
    //(.trim para los espacios inecesarios)
    if(NombreDocente.getText().trim().isEmpty()||
       ApellidoDocente.getText().trim().isEmpty()||
       CedulaDocente.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "No se puede ingresar una inasistencia con campos vacios.");
    } else {
        try {
            //verifica que los campos nombre y apellido no contengan numeros
            if (NombreDocente.getText().trim().matches(".*\\d.*") || ApellidoDocente.getText().trim().matches(".*\\d.*")) {
                JOptionPane.showMessageDialog(this, "Error: El nombre y el apellido no pueden contener numeros.");
                return;
            }
            
            //estructura para obtener los turnos con los botones de matutino vespertino y nocturno
            StringBuilder turnosSeleccionados = new StringBuilder();
            
            if (btnmatutino.isSelected()) {
                if (turnosSeleccionados.length() > 0) turnosSeleccionados.append(", ");
                turnosSeleccionados.append("Matutino");
            }
            if (btnvespertino.isSelected()) {
                if (turnosSeleccionados.length() > 0) turnosSeleccionados.append(", ");
                turnosSeleccionados.append("Vespertino");
            }
            if (btnnocturno.isSelected()) {
                if (turnosSeleccionados.length() > 0) turnosSeleccionados.append(", ");
                turnosSeleccionados.append("Nocturno");
            }

            //verifica que al menos un turno haya sido seleccionado
            if (turnosSeleccionados.length() == 0) {
                JOptionPane.showMessageDialog(this, "Error: Debes seleccionar al menos un turno.");
                return;
            }
            
            //clase propia de java para verificar el formato de fecha
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            //fexliviliza la fecha que ingresa el usuario
            sdf.setLenient(false);
            
            //convierte la cedula a entero
            int cedula = Integer.parseInt(CedulaDocente.getText().trim());
            
            
            //obtener fechas de los spinners (selectores de fecha)
            java.util.Date utilFechaInicio = (java.util.Date) spinnerFechaInicio.getValue();
            java.util.Date utilFechaFinalizacion = (java.util.Date) spinnerFechaFinalizacion.getValue();
        
            //convertir la variable de utilFechaInicio / FechaFinalizacion de java.util.Date a java.sql.Date
            java.sql.Date sqlFechaInicio = new java.sql.Date(utilFechaInicio.getTime());
            java.sql.Date sqlFechaFinalizacion = new java.sql.Date(utilFechaFinalizacion.getTime());
                       
            //valida que fecha inicio no sea despues de fecha finalizacion
            if (utilFechaInicio.after(utilFechaFinalizacion)) {
                JOptionPane.showMessageDialog(this, "Error: La fecha de inicio no puede ser posterior a la fecha de finalización");
                return;
            }
            
            //llama a la clase FachadaLogica
            FachadaLogica logica = new FachadaLogica();
            
            //llama a la clase inasistenciadocente
            InasistenciaDocente inasis = new InasistenciaDocente();
            
            
            //setea en cada objeto lo que ingreso el usuario
            inasis.setCI(cedula);
            inasis.setNombre(NombreDocente.getText().trim());
            inasis.setApellido(ApellidoDocente.getText().trim());
            inasis.setTurno(turnosSeleccionados);
            inasis.setFechaDeInicio(sqlFechaInicio);
            inasis.setFechaDeFinalizacion(sqlFechaFinalizacion);
            
            //ejecuta el metodo de fachada logica, guardar inasistencias
            logica.guardarInasistencias(inasis);
            
            //confirma al usuario
            JOptionPane.showMessageDialog(this, "Inasistencia registrada correctamente");
            
        //todos los catch con todos las posibles excepciones que puedan estar asociadas con formatos y exceptions1111111111111111111111
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: La cedula debe contener solo numeros");
        } catch (java.text.ParseException e) {
            JOptionPane.showMessageDialog(this, "Error en formato de fecha, porfavor usar el formato de fecha: dd/mm/aaaa (ej: 25/12/2025)");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
    }//GEN-LAST:event_BtnIngresarActionPerformed

    
    
    private void configuracionParaLaSeleccionDeFechas() {
        try {
        //obtiene fecha actual (sin hora)
        Calendar calendario = Calendar.getInstance();
        Date hoy = new Date();
        
        //limpia la hora para tener solo la fecha
        calendario.setTime(hoy);
        calendario.set(Calendar.HOUR_OF_DAY, 0);
        calendario.set(Calendar.MINUTE, 0);
        calendario.set(Calendar.SECOND, 0);
        calendario.set(Calendar.MILLISECOND, 0);
        //setea devuelta
        Date hoySinHora = calendario.getTime();
        
        //fecha de inicio
        SpinnerDateModel modelInicio = new SpinnerDateModel( hoySinHora, hoySinHora, null, Calendar.DAY_OF_MONTH);
        
        spinnerFechaInicio.setModel(modelInicio);
        JSpinner.DateEditor editorInicio = new JSpinner.DateEditor(spinnerFechaInicio, "dd/MM/yyyy");
        spinnerFechaInicio.setEditor(editorInicio);
        editorInicio.getTextField().setEditable(false);
        
        //fecha finalizacion
        SpinnerDateModel modelFinal = new SpinnerDateModel( hoySinHora, hoySinHora, null, Calendar.DAY_OF_MONTH);

            spinnerFechaFinalizacion.setModel(modelFinal);
            JSpinner.DateEditor editorFinal = new JSpinner.DateEditor(spinnerFechaFinalizacion, "dd/MM/yyyy");
            spinnerFechaFinalizacion.setEditor(editorFinal);
            editorFinal.getTextField().setEditable(false);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al configurar selectores de fecha: " + ex.getMessage());
        }
    }
    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        setVisible(false);
        InterfazDeEleccion inter=new InterfazDeEleccion();
        inter.setVisible(true);
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void btnTablaDeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaDeDatosActionPerformed
        //la ventana actual la esconde
        setVisible(false);
        //crea un objeto para llamar a la pestaña siguiente
        TablaDeDatosAdmin tabla =new TablaDeDatosAdmin();
        //hace visible el objeto
        tabla.setVisible(true);
    }//GEN-LAST:event_btnTablaDeDatosActionPerformed

    private void NombreDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreDocenteActionPerformed

    private void CedulaDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaDocenteActionPerformed

    private void btnmatutinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmatutinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmatutinoActionPerformed

    private void btnvespertinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvespertinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvespertinoActionPerformed

    private void btnnocturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnocturnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnocturnoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoDocente;
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JTextField CedulaDocente;
    private javax.swing.JTextField NombreDocente;
    private javax.swing.JButton btnTablaDeDatos;
    private javax.swing.JToggleButton btnmatutino;
    private javax.swing.JToggleButton btnnocturno;
    private javax.swing.JToggleButton btnvespertino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner spinnerFechaFinalizacion;
    private javax.swing.JSpinner spinnerFechaInicio;
    // End of variables declaration//GEN-END:variables
}
