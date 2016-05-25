/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import bean.ConexionRRHHBD;

/**
 *
 * @author Enrique
 */
public final class Institucion extends javax.swing.JInternalFrame {

    /**
     * Creates new form pais
     */
    private Colecciones.Instituciones objinstituciones;
    private bean.institucion objinstitucion;

    public void desactivar() {
        jtxtcodigo.setEnabled(false);
        jtxtdescripcion.setEnabled(false);
        jtxtcodigo.setText("");
        jtxtdescripcion.setText("");
    }

    public void activar() {
        jtxtcodigo.setEnabled(true);
        jtxtdescripcion.setEnabled(true);
    }

    public Institucion() {
        try {
            objinstituciones = new Colecciones.Instituciones();
        } catch (Exception e) {
        }
        initComponents();
        cargar();
        desactivar();
    }

    public void cargar() {
        try {
            objinstituciones.actualizar();
        } catch (Exception e) {
        }

        int filas = jTPais.getRowCount();
        for (int i = 0; i < filas; i++) {
            ((javax.swing.table.DefaultTableModel) jTPais.getModel()).removeRow(0);
        }

        for (bean.institucion obj : objinstituciones) {
            ((javax.swing.table.DefaultTableModel) jTPais.getModel()).addRow(new Object[]{obj.getId(), obj.getDescripcion()});
        }
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
        jLabel2 = new javax.swing.JLabel();
        jtxtcodigo = new javax.swing.JTextField();
        jtxtdescripcion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBnuevo = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTPais = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Instituciones"));

        jLabel1.setText("Codigo");

        jLabel2.setText("Institucion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBsalir.setText("Cerrar");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jBnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBeliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBeliminar)
                    .addComponent(jBsalir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTPais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPaisMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTPais);
        if (jTPais.getColumnModel().getColumnCount() > 0) {
            jTPais.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
        jBsalir.setText("Cancelar");
        objinstitucion = new bean.institucion();
        switch (jBnuevo.getText()) {
            case "Nuevo":
                activar();
                jBnuevo.setText("Guardar");
                break;

            case "Guardar":

                objinstitucion.setId(Integer.parseInt(jtxtcodigo.getText()));
                objinstitucion.setDescripcion(jtxtdescripcion.getText());

                try {
                    objinstitucion.insertar();
                } catch (Exception e) {

                }

                cargar();

                jBnuevo.setText("Nuevo");

                desactivar();
                break;

            case "Modificar":
                jBnuevo.setText("Nuevo");
                objinstitucion.setId(Integer.parseInt(jtxtcodigo.getText()));
                objinstitucion.setDescripcion(jtxtdescripcion.getText());
                objinstitucion.actualizar();
                cargar();

                break;

        }

    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jTPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPaisMouseClicked
        jBsalir.setText("Cancelar");
        if (evt.getButton() == 1) {
            int codigo = Integer.parseInt(String.valueOf(jTPais.getValueAt(jTPais.getSelectedRow(), 0)));
            activar();
            jBnuevo.setText("Modificar");
            for (bean.institucion obj : objinstituciones) {
                if (obj.getId() == codigo) {
                    jtxtcodigo.setText(String.valueOf(obj.getId()));
                    jtxtdescripcion.setText(obj.getDescripcion());
                }

            }
        }
    }//GEN-LAST:event_jTPaisMouseClicked

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
        jBsalir.setText("Salir");
        objinstitucion = new bean.institucion();
        objinstitucion.setId(Integer.parseInt(jtxtcodigo.getText()));
        jtxtcodigo.setText(String.valueOf(objinstitucion.getId()));
        objinstitucion.eliminar();
        desactivar();
        cargar();
        jBnuevo.setText("Nuevo");

    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        switch (jBsalir.getText()) {
            case "Salir":
                setVisible(false);
                break;

            case "Cancelar":
                desactivar();
                jBsalir.setText("Salir");
                jBnuevo.setText("Nuevo");
                break;

        }


    }//GEN-LAST:event_jBsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTPais;
    private javax.swing.JTextField jtxtcodigo;
    private javax.swing.JTextField jtxtdescripcion;
    // End of variables declaration//GEN-END:variables
}
