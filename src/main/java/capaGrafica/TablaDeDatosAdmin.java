/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capaGrafica;

import capaLogica.InasistenciaDocente;
import capaPersistencia.PersistenciaInasistencia;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author octavio
 */
public class TablaDeDatosAdmin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TablaDeDatos.class.getName());

    /**
     * Creates new form TablaDeDatos
     */
    public TablaDeDatosAdmin() {
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
        eliminarinasistencia = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabladedatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Cedula", "Turno", "Fecha de inicio", "Fecha de finalizacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
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

        eliminarinasistencia.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        eliminarinasistencia.setText("Eliminar inasistencia");
        eliminarinasistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarinasistenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 391, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eliminarinasistencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnVolver)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnVolver)
                    .addComponent(eliminarinasistencia))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        dispose();
        setVisible(false);
        Registro reg =new Registro();
        reg.setVisible(true);        
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void eliminarinasistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarinasistenciaActionPerformed
            try {
            // esta es una ventana emergente para pedir el ID para eliminar
            String input = JOptionPane.showInputDialog(this, "Ingrese el ID de la inasistencia a eliminar:", "Eliminar Inasistencia", 
                JOptionPane.QUESTION_MESSAGE);
            //si lo que puso el usuario esta vacio lo returnea
            if (input == null) {
                return;
            }
            
            int id;
            
            //parsea lo que usuario ingreso en id y verifica en el catch si lo que puso el usuario sea un numero entero
            try {
                id = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID valido (numero entero).", "Error", 
                JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //aca verifica si el numero que ingreso el usuario sea mayor a 0 o sea positivo
            if (id <= 0) {
                JOptionPane.showMessageDialog(this, "El ID debe ser un numero positivo.", "Error", 
                JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //aca hace una ventana popup para confirmar si queire eliminar esa inasistencia
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar la inasistencia con ID: " + id + "?", "Confirmar Eliminación",
                // crea dos botones de yes y no
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
            
            //si la opcion era yes elimina la inasistencia llamando la clase persistencia y llamando la funcion sql de eliminar inasistencia
            if (confirmacion == JOptionPane.YES_OPTION) {
                PersistenciaInasistencia persistencia = new PersistenciaInasistencia();
                boolean eliminado = persistencia.eliminarInasistencia(id);
                //este if verifica si hay una inasistencia con ese id ejecuntando el codigo sql
                //y ademas enseña un popup que confirma la elimianacion de la inasistencia
                if (eliminado) {
                    JOptionPane.showMessageDialog(this,"Inasistencia eliminada exitosamente.","Exito",
                    JOptionPane.INFORMATION_MESSAGE);
                    cargarInasistencias();
                //si la id no existe en la base de datos muestra un mensaje de error
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontro ninguna inasistencia con el ID: " + id, "No encontrado",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        //aca es el mismo catch con todos solo que muestra un popup con mensaje de error
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar inasistencia: " + e.getMessage(), "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarinasistenciaActionPerformed

    // TABLA PARA MOSTRAR INASISTENCIAS NO BORRAR!!1!!1
    private void cargarInasistencias() {
        // modelo no editable
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Cédula");
        modelo.addColumn("Turno");
        modelo.addColumn("Fecha de inicio");
        modelo.addColumn("Fecha de finalización");
        
        tabladedatos.setModel(modelo);

        try {
            //llama a la clase persistenciainasistencia
            PersistenciaInasistencia persistencia = new PersistenciaInasistencia();
            //llama al arraylist dentro de persistenciainasistencia
            List<InasistenciaDocente> lista = persistencia.obtenerInasistencias();

            //aca ejecuta el codigo de sql para que en cada columna se coloque su debido objeto y en cada fila la inasistencia
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
        
        //catch para ejecutar un codigo de error si no se pudo ejecutar el bloque de codigo anterior
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
        }
        tabladedatos.setEnabled(true); //tabla habilitada
        tabladedatos.getTableHeader().setReorderingAllowed(false); //no reordenar columnas
        tabladedatos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //seleccion simple (solo te permite seleccionar una cosa a la vez)
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVolver;
    private javax.swing.JButton eliminarinasistencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladedatos;
    }
    // End of variables declaration//GEN-END:variables

