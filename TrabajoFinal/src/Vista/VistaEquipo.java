package Vista;
import javax.swing.JOptionPane;
import AccesoADatos.ProyectoData;
import AccesoADatos.EquipoData;
import Modelo.Proyecto;
import Modelo.Equipo;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VistaEquipo extends javax.swing.JInternalFrame {

     DefaultTableModel modelo;
     LocalDate localDate;
     ProyectoData proyData= new ProyectoData();
     EquipoData equiData= new EquipoData();

    public VistaEquipo() {
        initComponents();
        jcbProyectos.setEnabled(false);
        jcbEquipos.setEnabled(false);
        jtfNombre.setEnabled(false);
        jdcFechaCreacion.setEnabled(false);
        jrbActivo.setEnabled(false);
        jrbInactivo.setEnabled(false);
        jbBuscar.setEnabled(false);
        jbGuardar.setEnabled(false);
        jbLimpiar.setEnabled(false);
        jbModificarEquipo.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        altaModificar = new javax.swing.ButtonGroup();
        activoInactivo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jcbProyectos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jdcFechaCreacion = new com.toedter.calendar.JDateChooser();
        jbCancelar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jrbModificar = new javax.swing.JRadioButton();
        jrbAlta = new javax.swing.JRadioButton();
        jrbActivo = new javax.swing.JRadioButton();
        jrbInactivo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jbModificarEquipo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jcbEquipos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("EQUIPO");

        jcbProyectos.setToolTipText("");

        jLabel2.setText("Proyecto");

        jLabel3.setText("Nombre");

        jLabel4.setText("Fecha creación");

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        altaModificar.add(jrbModificar);
        jrbModificar.setText("Modificar");
        jrbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbModificarActionPerformed(evt);
            }
        });

        altaModificar.add(jrbAlta);
        jrbAlta.setText("Dar de Alta");
        jrbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAltaActionPerformed(evt);
            }
        });

        activoInactivo.add(jrbActivo);
        jrbActivo.setText("Activo");

        activoInactivo.add(jrbInactivo);
        jrbInactivo.setText("Inactivo");

        jLabel5.setText("Estado");

        jbBuscar.setText("Buscar Equipo/s");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbModificarEquipo.setText("Modificar Equipo");
        jbModificarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarEquipoActionPerformed(evt);
            }
        });

        jLabel6.setText("Equipos");

        jcbEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEquiposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jrbAlta)
                            .addComponent(jbLimpiar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jrbActivo)
                                            .addGap(30, 30, 30)
                                            .addComponent(jrbInactivo))
                                        .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jrbModificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbModificarEquipo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jbGuardar)
                                        .addGap(69, 69, 69)
                                        .addComponent(jbCancelar))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAlta)
                    .addComponent(jrbModificar)
                    .addComponent(jbBuscar)
                    .addComponent(jbModificarEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrbActivo)
                    .addComponent(jrbInactivo))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbGuardar)
                    .addComponent(jbCancelar))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        try {
 
            Equipo equipo= new Equipo();
 
            if(verificar()){
                throw new Exception("Por favor, complete todos los campos.");
            }
            
            equipo.setProyecto((Proyecto) jcbProyectos.getSelectedItem());
            equipo.setNombre(jtfNombre.getText());
            equipo.setFechaCreacion(jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
              
            if(jrbActivo.isSelected()){
                equipo.setEstado(1);
            }
            else{
                equipo.setEstado(0);
            }
                
            equiData.guardarEquipo(equipo);
  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
       
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jrbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAltaActionPerformed
        jcbProyectos.setEnabled(true);
        jbBuscar.setEnabled(false);
        jbModificarEquipo.setEnabled(false);
        jcbEquipos.setEnabled(false);
        jtfNombre.setEnabled(true);
        jdcFechaCreacion.setEnabled(true);
        jrbActivo.setEnabled(true);
        jrbInactivo.setEnabled(true);
        jbGuardar.setEnabled(true);
        jbLimpiar.setEnabled(true);
        limpiar();
        jrbActivo.setSelected(true);
        llenarCombo();
    }//GEN-LAST:event_jrbAltaActionPerformed

    private void jrbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbModificarActionPerformed
        jcbProyectos.setEnabled(true);
        jbLimpiar.setEnabled(true);
        jbBuscar.setEnabled(true);
        jtfNombre.setEnabled(false);
        jdcFechaCreacion.setEnabled(false);
        jrbActivo.setEnabled(false);
        jrbInactivo.setEnabled(false);
        jbModificarEquipo.setEnabled(false);
        jbGuardar.setEnabled(false);
        limpiar();
        llenarCombo();
    }//GEN-LAST:event_jrbModificarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
      
        jcbEquipos.setEnabled(true);
        jtfNombre.setEnabled(true);
        jdcFechaCreacion.setEnabled(true);
        jrbActivo.setEnabled(true);
        jrbInactivo.setEnabled(true);
        jbModificarEquipo.setEnabled(true);
        
        List<Equipo> equipos= equiData.recuperarEquipos();
        
        Proyecto p = (Proyecto) jcbProyectos.getSelectedItem();
        jcbEquipos.removeAllItems();
        for(Equipo e: equipos){
            
            if(e.getProyecto().getIdProyecto() == p.getIdProyecto()){
                
                jcbEquipos.addItem(e);

            }
         
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarEquipoActionPerformed

        try {
            //JOptionPane.showMessageDialog(this, jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString().equals(""));
            if(jcbEquipos.getSelectedItem() == null){            
                throw new Exception("Por favor, seleccione un equipo"); 
            }
            
            if(jtfNombre.getText().equals("")){
                throw new Exception("Por favor, Complete el campo nombre");
            }
            
            if(jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString().equals("")){
                throw new Exception("Por favor, Complete el campo fecha de creación");
            }
            
            if(!(jrbActivo.isSelected() || jrbInactivo.isSelected())){
                throw new Exception("Por favor, Seleccione un estado");
            }
            
            Equipo equipo= (Equipo) jcbEquipos.getSelectedItem();

                equipo.setNombre(jtfNombre.getText());
                equipo.setFechaCreacion(jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                if(jrbActivo.isSelected()){
                 equipo.setEstado(1);
                }
                else{
                 equipo.setEstado(0);
                }
                if(equiData.modificarEquipo(equipo)){
                 JOptionPane.showMessageDialog(this, "Equipo modificado exitosamente");
                }
                else{
                 JOptionPane.showMessageDialog(this, "No se pudo modificar el equipo");
                }
                limpiar();
  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_jbModificarEquipoActionPerformed

    private void jcbEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEquiposActionPerformed
        Equipo e = (Equipo) jcbEquipos.getSelectedItem();
        jtfNombre.setText(e.getNombre());
        if(e.getEstado() == 1){
            jrbActivo.setSelected(true);
        }else{
            jrbInactivo.setSelected(true);
        }
    }//GEN-LAST:event_jcbEquiposActionPerformed

    private void limpiar(){
        jtfNombre.setText("");
        jcbProyectos.removeAllItems();
        jdcFechaCreacion.setCalendar (null);
        jrbActivo.setSelected(false);
        jrbInactivo.setSelected(false);
    }
    
    public void llenarCombo(){
        List<Proyecto> proyectos= proyData.listarProyectos();
        for(Proyecto p: proyectos){
            
            if(p.getEstado()){
                jcbProyectos.addItem(p);
            }
         
        }
    }
    
    public boolean verificar(){
    if((jrbActivo.isSelected() || jrbInactivo.isSelected()) && (jcbProyectos.getSelectedItem()!=null) && (!jtfNombre.getText().isEmpty()) && (!localDate.toString().isEmpty())){
        
        return true;
    }
    else{
        return false;
    }}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup activoInactivo;
    private javax.swing.ButtonGroup altaModificar;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificarEquipo;
    private javax.swing.JComboBox<Equipo> jcbEquipos;
    private javax.swing.JComboBox<Proyecto> jcbProyectos;
    private com.toedter.calendar.JDateChooser jdcFechaCreacion;
    private javax.swing.JRadioButton jrbActivo;
    private javax.swing.JRadioButton jrbAlta;
    private javax.swing.JRadioButton jrbInactivo;
    private javax.swing.JRadioButton jrbModificar;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
