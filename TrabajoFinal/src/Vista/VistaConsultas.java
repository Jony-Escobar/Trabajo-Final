package Vista;

public class VistaConsultas extends javax.swing.JInternalFrame {

    public VistaConsultas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        radioButtonProyectos = new javax.swing.JRadioButton();
        radioButtonTareas = new javax.swing.JRadioButton();
        radioButtonEquipo = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CONSULTAS");

        radioButtonProyectos.setText("Proyectos");
        radioButtonProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonProyectosActionPerformed(evt);
            }
        });

        radioButtonTareas.setText("Tareas");
        radioButtonTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonTareasActionPerformed(evt);
            }
        });

        radioButtonEquipo.setText("Equipo");
        radioButtonEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(radioButtonProyectos)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioButtonTareas)
                        .addGap(106, 106, 106)
                        .addComponent(radioButtonEquipo))
                    .addComponent(jLabel1))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonProyectos)
                    .addComponent(radioButtonTareas)
                    .addComponent(radioButtonEquipo))
                .addContainerGap(304, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioButtonProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonProyectosActionPerformed

    }//GEN-LAST:event_radioButtonProyectosActionPerformed

    private void radioButtonTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonTareasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonTareasActionPerformed

    private void radioButtonEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonEquipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton radioButtonEquipo;
    private javax.swing.JRadioButton radioButtonProyectos;
    private javax.swing.JRadioButton radioButtonTareas;
    // End of variables declaration//GEN-END:variables
}
