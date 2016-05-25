
package GUI;

import bean.ConexionRRHHBD;


public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        ConexionRRHHBD.getConnection();
        
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMpais = new javax.swing.JMenuItem();
        jMdepartamento = new javax.swing.JMenuItem();
        jMmunicipio = new javax.swing.JMenuItem();
        jMestadocivil = new javax.swing.JMenuItem();
        jMfuncion = new javax.swing.JMenuItem();
        jMsancion = new javax.swing.JMenuItem();
        jMtipofaltas = new javax.swing.JMenuItem();
        jMrecinto = new javax.swing.JMenuItem();
        jMfactoreval = new javax.swing.JMenuItem();
        jMinstituciones = new javax.swing.JMenuItem();
        jMpermiso = new javax.swing.JMenuItem();
        jMnacionalidad = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Catalogo");

        jMpais.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMpais.setText("País");
        jMpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMpaisActionPerformed(evt);
            }
        });
        jMpais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jMpaisKeyTyped(evt);
            }
        });
        jMenu1.add(jMpais);

        jMdepartamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMdepartamento.setText("Departamento");
        jMdepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMdepartamentoActionPerformed(evt);
            }
        });
        jMenu1.add(jMdepartamento);

        jMmunicipio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMmunicipio.setText("Municipio");
        jMmunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmunicipioActionPerformed(evt);
            }
        });
        jMenu1.add(jMmunicipio);

        jMestadocivil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMestadocivil.setText("Estado Civil");
        jMestadocivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMestadocivilActionPerformed(evt);
            }
        });
        jMenu1.add(jMestadocivil);

        jMfuncion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMfuncion.setText("Funciones");
        jMfuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMfuncionActionPerformed(evt);
            }
        });
        jMenu1.add(jMfuncion);

        jMsancion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMsancion.setText("Sanciones");
        jMsancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMsancionActionPerformed(evt);
            }
        });
        jMenu1.add(jMsancion);

        jMtipofaltas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMtipofaltas.setText("Tipos de Faltas");
        jMtipofaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMtipofaltasActionPerformed(evt);
            }
        });
        jMenu1.add(jMtipofaltas);

        jMrecinto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMrecinto.setText("Recinto");
        jMrecinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMrecintoActionPerformed(evt);
            }
        });
        jMenu1.add(jMrecinto);

        jMfactoreval.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMfactoreval.setText("Factores de Evaluacion");
        jMfactoreval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMfactorevalActionPerformed(evt);
            }
        });
        jMenu1.add(jMfactoreval);

        jMinstituciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMinstituciones.setText("Instituciones");
        jMinstituciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMinstitucionesActionPerformed(evt);
            }
        });
        jMenu1.add(jMinstituciones);

        jMpermiso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMpermiso.setText("Permisos");
        jMpermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMpermisoActionPerformed(evt);
            }
        });
        jMenu1.add(jMpermiso);

        jMnacionalidad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMnacionalidad.setText("Nacionalidades");
        jMnacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnacionalidadActionPerformed(evt);
            }
        });
        jMenu1.add(jMnacionalidad);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMpaisActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        pais p=new pais();
       /* departamento d= new departamento();*/
       
        Escritorio.add(p);
        p.show();
     
    }//GEN-LAST:event_jMpaisActionPerformed

    private void jMpaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMpaisKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jMpaisKeyTyped

    private void jMdepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMdepartamentoActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        Departamento d=new Departamento();
        Escritorio.add(d);
        d.show();
    }//GEN-LAST:event_jMdepartamentoActionPerformed

    private void jMestadocivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMestadocivilActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        Estado_civil ec=new Estado_civil();
        Escritorio.add(ec);
        ec.show();
    }//GEN-LAST:event_jMestadocivilActionPerformed

    private void jMfuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMfuncionActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        Funcion f = new Funcion();
        Escritorio.add(f);
        f.show();
    }//GEN-LAST:event_jMfuncionActionPerformed

    private void jMmunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmunicipioActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        Municipio m = new Municipio();
        Escritorio.add(m);
        m.show();
    }//GEN-LAST:event_jMmunicipioActionPerformed

    private void jMrecintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMrecintoActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        Recinto r=new Recinto();
        Escritorio.add(r);
        r.show();
    }//GEN-LAST:event_jMrecintoActionPerformed

    private void jMsancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMsancionActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        Sancion s= new Sancion();
        Escritorio.add(s);
        s.show();
    }//GEN-LAST:event_jMsancionActionPerformed

    private void jMtipofaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMtipofaltasActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        Tipofalta t = new Tipofalta();
        Escritorio.add(t);
        t.show();
                      
    }//GEN-LAST:event_jMtipofaltasActionPerformed

    private void jMfactorevalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMfactorevalActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        Factorevaluacion fe = new Factorevaluacion();
        Escritorio.add(fe);
        fe.show();
    }//GEN-LAST:event_jMfactorevalActionPerformed

    private void jMinstitucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinstitucionesActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        Institucion i = new Institucion();
        Escritorio.add(i);
        i.show();
    }//GEN-LAST:event_jMinstitucionesActionPerformed

    private void jMpermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMpermisoActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        Permiso p = new Permiso();
        Escritorio.add(p);
        p.show();
    }//GEN-LAST:event_jMpermisoActionPerformed

    private void jMnacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnacionalidadActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        Nacionalidad na = new Nacionalidad();
        Escritorio.add(na);
        na.show();
    }//GEN-LAST:event_jMnacionalidadActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem jMdepartamento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMestadocivil;
    private javax.swing.JMenuItem jMfactoreval;
    private javax.swing.JMenuItem jMfuncion;
    private javax.swing.JMenuItem jMinstituciones;
    private javax.swing.JMenuItem jMmunicipio;
    private javax.swing.JMenuItem jMnacionalidad;
    private javax.swing.JMenuItem jMpais;
    private javax.swing.JMenuItem jMpermiso;
    private javax.swing.JMenuItem jMrecinto;
    private javax.swing.JMenuItem jMsancion;
    private javax.swing.JMenuItem jMtipofaltas;
    // End of variables declaration//GEN-END:variables
}
