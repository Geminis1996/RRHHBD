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
public final class Municipio extends javax.swing.JInternalFrame {

    /**
     * Creates new form pais
     */
    private Colecciones.Municipios objmunicipios;
    private bean.Municipio objmunicipio;

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

    public Municipio() {

        try {
            objmunicipios = new Colecciones.Municipios();
        } catch (Exception e) {
        }
        initComponents();
        cargar();
        desactivar();
    }

    public void cargar() {
        try {
            objmunicipios.actualizar();
        } catch (Exception e) {
        }

        int filas = jTMunicipio.getRowCount();
        for (int i = 0; i < filas; i++) {
            ((javax.swing.table.DefaultTableModel) jTMunicipio.getModel()).removeRow(0);
        }

        for (bean.Municipio obj : objmunicipios) {
            ((javax.swing.table.DefaultTableModel) jTMunicipio.getModel()).addRow(new Object[]{obj.getId(), obj.getDescripcion()});
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
        jTMunicipio = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Municipios"));

        jLabel1.setText("Codigo");

        jLabel2.setText("Municipio");

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

        jTMunicipio.setModel(new javax.swing.table.DefaultTableModel(
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
        jTMunicipio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTMunicipioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTMunicipio);
        if (jTMunicipio.getColumnModel().getColumnCount() > 0) {
            jTMunicipio.getColumnModel().getColumn(0).setMaxWidth(50);
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
        jBsalir.setText("Cancelar");
        objmunicipio = new bean.Municipio();
        switch (jBnuevo.getText()) {
            case "Nuevo":
                activar();
                jBnuevo.setText("Guardar");
                break;

            case "Guardar":

                objmunicipio.setId(Integer.parseInt(jtxtcodigo.getText()));
                objmunicipio.setDescripcion(jtxtdescripcion.getText());

                try {
                    objmunicipio.insertar();
                } catch (Exception e) {

                }

                cargar();

                jBnuevo.setText("Nuevo");

                desactivar();
                break;

            case "Modificar":
                jBnuevo.setText("Nuevo");
                objmunicipio.setId(Integer.parseInt(jtxtcodigo.getText()));
                objmunicipio.setDescripcion(jtxtdescripcion.getText());
                objmunicipio.actualizar();
                cargar();

                break;

        }

    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jTMunicipioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTMunicipioMouseClicked
        jBsalir.setText("Cancelar");
        if (evt.getButton() == 1) {
            int codigo = Integer.parseInt(String.valueOf(jTMunicipio.getValueAt(jTMunicipio.getSelectedRow(), 0)));
            activar();
            jBnuevo.setText("Modificar");
            for (bean.Municipio obj : objmunicipios) {
                if (obj.getId() == codigo) {
                    jtxtcodigo.setText(String.valueOf(obj.getId()));
                    jtxtdescripcion.setText(obj.getDescripcion());
                }

            }
        }
    }//GEN-LAST:event_jTMunicipioMouseClicked

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
        jBsalir.setText("Salir");
        objmunicipio = new bean.Municipio();
        objmunicipio.setId(Integer.parseInt(jtxtcodigo.getText()));
        jtxtcodigo.setText(String.valueOf(objmunicipio.getId()));
        objmunicipio.eliminar();
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
    private javax.swing.JTable jTMunicipio;
    private javax.swing.JTextField jtxtcodigo;
    private javax.swing.JTextField jtxtdescripcion;
    // End of variables declaration//GEN-END:variables
}
