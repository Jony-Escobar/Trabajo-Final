package Vista;

import AccesoADatos.ProyectoData;
import Modelo.Proyecto;
import java.time.ZoneId;
import javax.swing.JOptionPane;

public class VistaProyecto extends javax.swing.JInternalFrame {

    public VistaProyecto() {
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
        jdcFechaCreacion = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(radioButtonCrear)))
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(buttonLimpiar)
                        .addGap(32, 32, 32)
                        .addComponent(buttonModificar)
                        .addGap(45, 45, 45)
                        .addComponent(buttonCrear))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButtonEstado))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioButtonCrear)
                                    .addComponent(radioButtonModificar))
                                .addGap(44, 44, 44))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(radioButtonEstado))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonModificar)
                    .addComponent(buttonLimpiar)
                    .addComponent(buttonCrear)
                    .addComponent(buttonSalir))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void radioButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCrearActionPerformed
        
        buttonCrear.setEnabled(true);
<<<<<<< HEAD
        limpiar();
=======
        buttonModificar.setEnabled(false);
        radioButtonEstado.setEnabled(false);
        textFieldID.setEnabled(false);
        
>>>>>>> parent of 633bb72 (Actualizando vistaProyecto)
    }//GEN-LAST:event_radioButtonCrearActionPerformed

    private void radioButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonModificarActionPerformed
        
        buttonCrear.setEnabled(false);
        buttonModificar.setEnabled(true);
        radioButtonEstado.setEnabled(true);
        textFieldID.setEnabled(true);
<<<<<<< HEAD
        btnBuscar.setEnabled(true);
        limpiar();
=======
        
>>>>>>> parent of 633bb72 (Actualizando vistaProyecto)
    }//GEN-LAST:event_radioButtonModificarActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        textFieldNombre.setText("");
        textFieldDescripcion.setText("");
        radioButtonEstado.setSelected(false);
        jdcFechaCreacion.setCalendar(null);        
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void buttonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearActionPerformed
        
        Proyecto pr = new Proyecto();
        ProyectoData pd = new ProyectoData();
        
        try {
            
            if(textFieldID.getText().equals("")){
                textFieldID.requestFocus();
                throw new Exception("Por favor, ingrese un ID.");
            }
            
            if(jdcFechaCreacion.toString().isEmpty()){
                jdcFechaCreacion.requestFocus();
                throw new Exception("Por favor, ingrese una fecha.");
            }
            
            if(textFieldDescripcion.getText().equals("")){
                textFieldDescripcion.requestFocus();
                throw new Exception("Por favor, ingrese una descripción.");
            } 
            
            pr.setNombre(textFieldNombre.getText());
            pr.setDescripcion(textFieldDescripcion.getText());
            pr.setFechaInicio(jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());//SETEAR FECHA
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
            textFieldNombre.setEnabled(false);
            jdcFechaCreacion.setEnabled(false);
            textFieldDescripcion.setEnabled(false);
            radioButtonEstado.setEnabled(false);
            if(textFieldID.getText().equals("")){
                textFieldID.requestFocus();
                throw new Exception("Por favor, ingrese un ID.");
            }
            
<<<<<<< HEAD
            if(jdcFechaCreacion.toString().isEmpty()){
                jdcFechaCreacion.requestFocus();
                throw new Exception("Por favor, ingrese una fecha.");
=======
            if(!textFieldNombre.getText().equals("")){
                //SETEAR SOLO CAMPOS INGRESADOS?
>>>>>>> parent of 633bb72 (Actualizando vistaProyecto)
            }
            
            if(textFieldDescripcion.getText().equals("")){
                textFieldDescripcion.requestFocus();
                throw new Exception("Por favor, ingrese una descripción.");
            }
            
            pr.setIdProyecto(Integer.parseInt(textFieldID.getText()));
            pr.setNombre(textFieldNombre.getText());
            pr.setFechaInicio(jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            pr.setDescripcion(textFieldDescripcion.getText());
            pr.setEstado(radioButtonEstado.isSelected());
            pd.modificarProyecto(pr);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        
    }//GEN-LAST:event_buttonModificarActionPerformed


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
    private com.toedter.calendar.JDateChooser jdcFechaCreacion;
    private javax.swing.JRadioButton radioButtonCrear;
    private javax.swing.JRadioButton radioButtonEstado;
    private javax.swing.JRadioButton radioButtonModificar;
    private javax.swing.JTextField textFieldDescripcion;
    private javax.swing.JTextField textFieldID;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
}
