
package Vista;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Proyecto Final - Grupo 5");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemCrearProyecto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemAsignarTarea = new javax.swing.JMenuItem();
        menuItemActualizarEstadoTarea = new javax.swing.JMenuItem();
        menuItemRegistrarAvance = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        menuItemListaProyectos = new javax.swing.JMenuItem();
        menuItemTareas = new javax.swing.JMenuItem();
        menuItemInformacionDeEquipo = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jmiMiembro = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        jMenu1.setText("Proyecto");

        menuItemCrearProyecto.setText("Crear proyecto");
        menuItemCrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearProyectoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemCrearProyecto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tareas");

        menuItemAsignarTarea.setText("Asignar tarea");
        menuItemAsignarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAsignarTareaActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemAsignarTarea);

        menuItemActualizarEstadoTarea.setText("Actualizar estado de tarea");
        jMenu2.add(menuItemActualizarEstadoTarea);

        menuItemRegistrarAvance.setText("Registrar avance");
        jMenu2.add(menuItemRegistrarAvance);

        jMenuBar1.add(jMenu2);

        jMenu7.setText("Consultar");

        menuItemListaProyectos.setText("Lista de proyectos");
        menuItemListaProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListaProyectosActionPerformed(evt);
            }
        });
        jMenu7.add(menuItemListaProyectos);

        menuItemTareas.setText("Tareas");
        jMenu7.add(menuItemTareas);

        menuItemInformacionDeEquipo.setText("Información de equipo");
        jMenu7.add(menuItemInformacionDeEquipo);

        jMenuBar1.add(jMenu7);

        jMenu4.setText("Equipo");

        jMenuItem2.setText("Crear Equipo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu8.setText("Miembro");

        jmiMiembro.setText("Agregar Miembro");
        jmiMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMiembroActionPerformed(evt);
            }
        });
        jMenu8.add(jmiMiembro);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCrearProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearProyectoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaProyecto vcp = new VistaProyecto();
        vcp.setVisible(true);
        escritorio.add(vcp);
        escritorio.moveToFront(vcp);
    }//GEN-LAST:event_menuItemCrearProyectoActionPerformed

    private void menuItemListaProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListaProyectosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemListaProyectosActionPerformed

    private void menuItemAsignarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAsignarTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemAsignarTareaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaEquipo ve = new VistaEquipo();
        ve.setVisible(true);
        escritorio.add(ve);
        escritorio.moveToFront(ve);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmiMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMiembroActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        VistaMiembro vm = new VistaMiembro();
        vm.setVisible(true);
        escritorio.add(vm);
        escritorio.moveToFront(vm);
        
    }//GEN-LAST:event_jmiMiembroActionPerformed


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
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jmiMiembro;
    private javax.swing.JMenuItem menuItemActualizarEstadoTarea;
    private javax.swing.JMenuItem menuItemAsignarTarea;
    private javax.swing.JMenuItem menuItemCrearProyecto;
    private javax.swing.JMenuItem menuItemInformacionDeEquipo;
    private javax.swing.JMenuItem menuItemListaProyectos;
    private javax.swing.JMenuItem menuItemRegistrarAvance;
    private javax.swing.JMenuItem menuItemTareas;
    // End of variables declaration//GEN-END:variables
}
