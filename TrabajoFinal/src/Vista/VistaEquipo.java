package Vista;
import javax.swing.JOptionPane;
import AccesoADatos.ProyectoData;
import AccesoADatos.EquipoData;
import Modelo.Proyecto;
import Modelo.Equipo;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VistaEquipo extends javax.swing.JInternalFrame {

     DefaultTableModel modelo;
     LocalDate localDate;
     ProyectoData proyData= new ProyectoData();
     EquipoData equiData= new EquipoData();

    public VistaEquipo() {
        initComponents();
        desactivar();
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
        jtfNombre = new javax.swing.JTextField();
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
        jbCargarEquipo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("EQUIPO");

        jcbProyectos.setToolTipText("");
        jcbProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProyectosActionPerformed(evt);
            }
        });

        jLabel2.setText("Proyecto");

        jLabel3.setText("Nombre");

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

        jbCargarEquipo.setText("Cargar");
        jbCargarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarEquipoActionPerformed(evt);
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
                            .addComponent(jLabel5)
                            .addComponent(jrbAlta))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jbCargarEquipo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jrbActivo)
                                .addGap(28, 28, 28)
                                .addComponent(jrbInactivo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jrbModificar)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jbLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbModificarEquipo)
                        .addGap(18, 18, 18)
                        .addComponent(jbCancelar)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAlta)
                    .addComponent(jrbModificar)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCargarEquipo))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrbActivo)
                    .addComponent(jrbInactivo))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbGuardar)
                    .addComponent(jbCancelar)
                    .addComponent(jbModificarEquipo))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        try {
 
            Equipo equipo= new Equipo();
 
            if(jcbProyectos.getSelectedItem() == null){            
                throw new Exception("Por favor, seleccione un proyecto"); 
            }
            
            if(jtfNombre.getText().equals("")){
                throw new Exception("Por favor, Complete el campo nombre");
            }
            
            if(!(jrbActivo.isSelected() || jrbInactivo.isSelected())){
                throw new Exception("Por favor, Seleccione un estado");
            }
            
            equipo.setProyecto((Proyecto) jcbProyectos.getSelectedItem());
            equipo.setNombre(jtfNombre.getText());
            equipo.setFechaCreacion(LocalDate.now());
              
            if(jrbActivo.isSelected()){
                equipo.setEstado(1);
            }
            else{
                equipo.setEstado(0);
            }
                
            equiData.guardarEquipo(equipo);
  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
       
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jrbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAltaActionPerformed
        desactivar();
        jcbProyectos.setEnabled(true);
        jtfNombre.setEnabled(true);
        jrbActivo.setEnabled(true);
        jrbInactivo.setEnabled(true);
        jbGuardar.setEnabled(true);
        limpiar();
        jcbProyectos.removeAllItems();
        jcbEquipos.removeAllItems();
        jrbActivo.setSelected(true);
        llenarComboProyecto();
    }//GEN-LAST:event_jrbAltaActionPerformed

    private void jrbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbModificarActionPerformed
        desactivar();
        jcbProyectos.setEnabled(true);
        jbBuscar.setEnabled(true);
        limpiar();
        jcbProyectos.removeAllItems();
        jcbEquipos.removeAllItems();
        llenarComboProyecto();
    }//GEN-LAST:event_jrbModificarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
      
        limpiar();
        jcbEquipos.removeAllItems();
        jcbEquipos.setEnabled(true);
        jbCargarEquipo.setEnabled(true);
        
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
            
            if(jcbProyectos.getSelectedItem() == null){
                throw new Exception("Por favor, seleccione un proyecto"); 
            }
            
            if(jcbEquipos.getSelectedItem() == null){            
                throw new Exception("Por favor, seleccione un equipo"); 
            }
            
            if(jtfNombre.getText().equals("")){
                throw new Exception("Por favor, Complete el campo nombre");
            }
            
            if(!(jrbActivo.isSelected() || jrbInactivo.isSelected())){
                throw new Exception("Por favor, Seleccione un estado");
            }
            
            Equipo equipo= (Equipo) jcbEquipos.getSelectedItem();

                equipo.setNombre(jtfNombre.getText());
                if(jrbActivo.isSelected()){
                 equipo.setEstado(1);
                }
                else{
                 equipo.setEstado(0);
                }
                
                equiData.modificarEquipo(equipo);
                
                desactivar();
                jcbProyectos.setEnabled(true);
                jbBuscar.setEnabled(true);
                limpiar();
                jcbEquipos.removeAllItems();
  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_jbModificarEquipoActionPerformed

    private void jcbEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEquiposActionPerformed
        
    }//GEN-LAST:event_jcbEquiposActionPerformed

    private void jcbProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProyectosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProyectosActionPerformed

    
    private void jbCargarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarEquipoActionPerformed
        jtfNombre.setEnabled(true);
        jrbActivo.setEnabled(true);
        jrbInactivo.setEnabled(true);
        jbModificarEquipo.setEnabled(true);
        jcbProyectos.setEnabled(false);
        
        Equipo e = (Equipo) jcbEquipos.getSelectedItem();
        jtfNombre.setText(e.getNombre());
        if(e.getEstado() == 1){
            jrbActivo.setSelected(true);
        }else{
            jrbInactivo.setSelected(true);
        }
    }//GEN-LAST:event_jbCargarEquipoActionPerformed

    private void limpiar(){
        jtfNombre.setText("");
        jrbActivo.setSelected(false);
        jrbInactivo.setSelected(false);
    }
    
    public void llenarComboProyecto(){
        List<Proyecto> proyectos= proyData.listarProyectos();
        for(Proyecto p: proyectos){
            
            if(p.getEstado() == 1 || p.getEstado() == 2){
                jcbProyectos.addItem(p);
            }
         
        }
    }
    
    public void desactivar(){
        jcbProyectos.setEnabled(false);
        jcbEquipos.setEnabled(false);
        jtfNombre.setEnabled(false);
        jrbActivo.setEnabled(false);
        jrbInactivo.setEnabled(false);
        jbBuscar.setEnabled(false);
        jbGuardar.setEnabled(false);
        jbModificarEquipo.setEnabled(false);
        jbCargarEquipo.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup activoInactivo;
    private javax.swing.ButtonGroup altaModificar;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCargarEquipo;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificarEquipo;
    private javax.swing.JComboBox<Equipo> jcbEquipos;
    private javax.swing.JComboBox<Proyecto> jcbProyectos;
    private javax.swing.JRadioButton jrbActivo;
    private javax.swing.JRadioButton jrbAlta;
    private javax.swing.JRadioButton jrbInactivo;
    private javax.swing.JRadioButton jrbModificar;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
