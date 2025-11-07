/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capaGrafica;

import capaLogica.InasistenciaDocente;
import capaPersistencia.PersistenciaInasistencia;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author octavio
 */
public class TablaDeDatos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TablaDeDatos.class.getName());

    /**
     * Creates new form TablaDeDatos
     */
    public TablaDeDatos() {
        initComponents();
        cargarInasistencias();
        setLocationRelativeTo(null);
        PersistenciaInasistencia persistencia = new PersistenciaInasistencia();
        persistencia.programarLimpiezaAutomatica();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladedatos = new javax.swing.JTable();
        BtnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabladedatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cedula", "Turno", "Fecha de inicio", "Fecha de finalizacion"
            }
        ));
        jScrollPane1.setViewportView(tabladedatos);

        BtnVolver.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        BtnVolver.setText("Volver");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 3, 12)); // NOI18N
        jLabel2.setText("TABLA DE INASISTENCIAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnVolver))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnVolver)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        dispose();
        setVisible(false);
        IngresoUsuario Usuario =new IngresoUsuario();
        Usuario.setVisible(true);        
    }//GEN-LAST:event_BtnVolverActionPerformed

    
    // TABLA PARA MOSTRAR INASISTENCIAS NO BORRAR!!1!!1
    private void cargarInasistencias() {
        //crea la tabla con las diferentes columnas vacias
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Cédula");
        modelo.addColumn("Turno");
        modelo.addColumn("Fecha de inicio");
        modelo.addColumn("Fecha de finalización");
        
        tabladedatos.setModel(modelo);

        try {
            //llama a la clase persistenciainasistencia y llama al arraylist que contiene la funcion sql
            PersistenciaInasistencia persistencia = new PersistenciaInasistencia();
            
            int eliminadas = persistencia.eliminarInasistenciasExpiradas();
            if (eliminadas > 0) {
                System.out.println("Se eliminaron " + eliminadas + " inasistencias expiradas");
            }
            
            List<InasistenciaDocente> lista = persistencia.obtenerInasistencias();
            //ejecuta la funcion sql por cada columna de datos
            for (InasistenciaDocente i : lista) {
                Object[] fila = {
                    i.getID(),
                    i.getNombre(),
                    i.getApellido(),
                    i.getCI(),
                    i.getTurno(),
                    i.getFechaDeInicio(),
                    i.getFechaDeFinalizacion()
                };
                modelo.addRow(fila);
            }
        //catch para manejo de excepciones
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladedatos;
    }
    // End of variables declaration//GEN-END:variables

