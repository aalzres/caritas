/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caritas.vistas;

import caritas.controlador.ControladorAyuda;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class Ayuda extends javax.swing.JDialog {

    private String refUsuario;
    private String refAyuda;
    private DefaultTableModel dtm;
    private Frame parent;
    private ResultSet resultSet;

    /**
     * Creates new form Ayuda
     *
     * @param parent
     * @param modal
     */
    public Ayuda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * Creates new form Ayuda
     *
     * @param parent
     * @param modal
     * @param refUsuario
     */
    public Ayuda(java.awt.Frame parent, boolean modal, String refUsuario) {
        super(parent, modal);
        initComponents();
        this.refUsuario = refUsuario;
        this.parent = parent;
        this.setLocationRelativeTo(null);
        this.setTitle("Caritas - Ayudas");
        this.jtFecha.setText(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
        dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        dtm.setColumnIdentifiers(new Object[]{"Referencia", "Tipo", "Fecha", "Descripción"});
        setAyudas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jtDescripcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAyudas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setText("Fecha");
        jPanel1.add(jLabel1);
        jPanel1.add(jtFecha);

        jLabel2.setText("Tipo");
        jPanel1.add(jLabel2);

        jcTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Económica", "Alimentos" }));
        jPanel1.add(jcTipo);

        jLabel3.setText("Descripción");
        jPanel1.add(jLabel3);
        jPanel1.add(jtDescripcion);

        jtAyudas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtAyudas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAyudasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAyudas);

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jbAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbModificar)
                    .addComponent(jbBorrar)
                    .addComponent(jbCancelar)
                    .addComponent(jbLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtAyudasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAyudasMouseClicked
        this.refAyuda = dtm.getValueAt(jtAyudas.getSelectedRow(), 0).toString();
        setAyuda(this.refAyuda);
    }//GEN-LAST:event_jtAyudasMouseClicked

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        if (this.refAyuda != null && JOptionPane.showConfirmDialog(parent, "La ayuda va a ser eliminada y no podrá recuperarla.\n¿Está seguro?") == 0) {
            if (ControladorAyuda.getInstance().deleteAyuda(refUsuario, refAyuda)) {
                JOptionPane.showMessageDialog(this, "Ayuda borrada de la base de datos.");
                setAyudas();
                cleanJTextField();
            } else {
                JOptionPane.showMessageDialog(this, "Ayuda no encontrada en la base de datos.");
            }
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        caritas.modelo.Ayuda a = new caritas.modelo.Ayuda();
        a.setRefUsuario(refUsuario);
        a.setTipo(jcTipo.getSelectedItem().toString());
        a.setFechaRec(jtFecha.getText());
        a.setDescripcion(jtDescripcion.getText());

        if (ControladorAyuda.getInstance().addAyuda(a)) {
            JOptionPane.showMessageDialog(this, "Ayuda agregada con éxito");
            setAyudas();
            cleanJTextField();
        } else {
            JOptionPane.showMessageDialog(this, "La ayuda no se ha podido agregar");
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        cleanJTextField();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        caritas.modelo.Ayuda a = new caritas.modelo.Ayuda();
        a.setRefAyuda(refAyuda);
        a.setTipo(jcTipo.getSelectedItem().toString());
        a.setFechaRec(jtFecha.getText());
        a.setDescripcion(jtDescripcion.getText());

        if (ControladorAyuda.getInstance().updateAyuda(a)) {
            JOptionPane.showMessageDialog(this, "Ayuda modificada con éxito");
            setAyudas();
            cleanJTextField();
        } else {
            JOptionPane.showMessageDialog(this, "La ayuda no se ha podido modificar");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ayuda dialog = new Ayuda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jcTipo;
    private javax.swing.JTable jtAyudas;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtFecha;
    // End of variables declaration//GEN-END:variables

    private void setAyudas() {
        try {
            dtm.setNumRows(0);
            resultSet = ControladorAyuda.getInstance().getAyudas(refUsuario);
            while (resultSet.next()) {
                dtm.addRow(new Object[]{
                    resultSet.getString("id_ayuda"),
                    resultSet.getString("tipo"),
                    resultSet.getString("fecharec"),
                    resultSet.getString("descripcion")});
            }
            jtAyudas.setModel(dtm);
        } catch (SQLException e) {
           
        }
    }

    private void setAyuda(String refAyuda) {
        try {
            dtm.setNumRows(0);
            resultSet = ControladorAyuda.getInstance().getAyuda(this.refUsuario, refAyuda);
            while (resultSet.next()) {
                String sTipo = resultSet.getString("tipo");
                if (sTipo.equalsIgnoreCase("alimentos")) {
                    jcTipo.setSelectedIndex(1);
                } else {
                    jcTipo.setSelectedIndex(0);
                }
                jtFecha.setText(resultSet.getString("fecharec"));
                jtDescripcion.setText(resultSet.getString("descripcion"));
            }
        } catch (SQLException e) {
            
        }
    }

    private void cleanJTextField() {
        jtDescripcion.setText("");
        jtFecha.setText("");
        jcTipo.setSelectedIndex(0);
    }
}
