package Vista;

import AccesoADatos.ProyectoData;
import Modelo.Proyecto;
import javax.swing.JOptionPane;

public class VistaCrearProyecto extends javax.swing.JFrame {

    public VistaCrearProyecto() {
        initComponents();
        
        //Desactivamos botones
        buttonCrear.setEnabled(false);
        buttonModificar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGroupCrearProyecto = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        radioButtonCrear = new javax.swing.JRadioButton();
        radioButtonModificar = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        buttonSalir = new javax.swing.JButton();
        buttonCrear = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        textFieldDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        radioButtonEstado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        textFieldID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PROYECTO");

        bGroupCrearProyecto.add(radioButtonCrear);
        radioButtonCrear.setText("CREAR PROYECTO");
        radioButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCrearActionPerformed(evt);
            }
        });

        bGroupCrearProyecto.add(radioButtonModificar);
        radioButtonModificar.setText("MODIFICAR PROYECTO");
        radioButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonModificarActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("DESCRIPCIÓN:");

        jLabel4.setText("FECHA DE INICIO:");

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        buttonCrear.setText("Crear");
        buttonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearActionPerformed(evt);
            }
        });

        buttonModificar.setText("Modificar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        buttonLimpiar.setText("Limpiar campos");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        jLabel5.setText("ESTADO:");

        jLabel6.setText("ID PROYECTO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(radioButtonModificar)
                .addGap(18, 18, 18)
                .addComponent(radioButtonCrear)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonModificar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCrear)
                        .addGap(18, 18, 18)
                        .addComponent(buttonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(radioButtonEstado))
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldDescripcion)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioButtonCrear)
                            .addComponent(radioButtonModificar))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(radioButtonEstado))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSalir)
                            .addComponent(buttonCrear)
                            .addComponent(buttonModificar)
                            .addComponent(buttonLimpiar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void radioButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCrearActionPerformed
        
        buttonCrear.setEnabled(true);
        buttonModificar.setEnabled(false);
        radioButtonEstado.setEnabled(false);
        textFieldID.setEnabled(false);
        
    }//GEN-LAST:event_radioButtonCrearActionPerformed

    private void radioButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonModificarActionPerformed
        
        buttonCrear.setEnabled(false);
        buttonModificar.setEnabled(true);
        radioButtonEstado.setEnabled(true);
        textFieldID.setEnabled(true);
        
    }//GEN-LAST:event_radioButtonModificarActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        
        textFieldNombre.setText("");
        textFieldDescripcion.setText("");
        radioButtonEstado.setSelected(false);
        //SETEAR FECHA
        
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void buttonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearActionPerformed
        
        Proyecto pr = new Proyecto();
        ProyectoData pd = new ProyectoData();
        
        try {
            
            if(textFieldNombre.getText().equals("")){
                textFieldNombre.requestFocus();
                throw new Exception("Por favor, ingrese un nombre al proyecto.");
            }
            
            //HACER VALIDACION DE FECHA
            
            pr.setNombre(textFieldNombre.getText());
            pr.setDescripcion(textFieldDescripcion.getText());
            //SETEAR FECHA
            if(radioButtonEstado.isSelected()){
                pr.setEstado(1);
            }else{
                pr.setEstado(0);
            }
            
            pd.guardarProyecto(pr);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_buttonCrearActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        
        Proyecto pr = new Proyecto();
        ProyectoData pd = new ProyectoData();
        
        try {
            
            if(textFieldID.getText().equals("")){
                textFieldID.requestFocus();
                throw new Exception("Por favor, ingrese un ID.");
            }
            
            if(!textFieldNombre.getText().equals("")){
                //SETEAR SOLO CAMPOS INGRESADOS?
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        
    }//GEN-LAST:event_buttonModificarActionPerformed


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
            java.util.logging.Logger.getLogger(VistaCrearProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCrearProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCrearProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCrearProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCrearProyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGroupCrearProyecto;
    private javax.swing.JButton buttonCrear;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton radioButtonCrear;
    private javax.swing.JRadioButton radioButtonEstado;
    private javax.swing.JRadioButton radioButtonModificar;
    private javax.swing.JTextField textFieldDescripcion;
    private javax.swing.JTextField textFieldID;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
}
