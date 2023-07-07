
package Vista;

import AccesoADatos.EquipoData;
import AccesoADatos.EquipoMiembrosData;
import AccesoADatos.TareaData;
import Modelo.Equipo;
import Modelo.EquiposMiembros;
import Modelo.Miembro;
import Modelo.Proyecto;
import Modelo.Tarea;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


public class VistaModificarTarea extends javax.swing.JInternalFrame {

 
    public VistaModificarTarea() {
        initComponents();
        llenarComboEquipo();
        jdcFechaCreacion.setMaxSelectableDate(Calendar.getInstance().getTime());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jdcFechaCreacion = new com.toedter.calendar.JDateChooser();
        jcbEstado = new javax.swing.JComboBox<>();
        jcbEquipo = new javax.swing.JComboBox<>();
        jtfProyecto = new javax.swing.JTextField();
        jcbMiembro = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcbTarea = new javax.swing.JComboBox<>();
        bGuardar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtfFechaCierre = new javax.swing.JTextField();

        jLabel1.setText("Tarea");

        jLabel2.setText("Nombre");

        jLabel3.setText("Fecha creación");

        jLabel4.setText("Equipo");

        jLabel5.setText("Proyecto");

        jLabel6.setText("Miembro");

        jLabel7.setText("Estado");

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Completada", "Pendiente", "En Progreso", "" }));

        jcbEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEquipoActionPerformed(evt);
            }
        });

        jcbMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMiembroActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha cierre");

        jcbTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTareaActionPerformed(evt);
            }
        });

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Modificar Tarea");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(105, 105, 105)
                                        .addComponent(bGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(bSalir))
                                    .addComponent(jtfFechaCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfNombre)
                                    .addComponent(jcbTarea, 0, 202, Short.MAX_VALUE))))
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jcbTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfFechaCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardar)
                    .addComponent(bSalir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEquipoActionPerformed
       
        jcbMiembro.removeAllItems();
        if(jcbEquipo.getSelectedItem()!=null){
          Equipo equipo= (Equipo) jcbEquipo.getSelectedItem();
          EquipoData equiData= new EquipoData();
          EquipoMiembrosData emd= new EquipoMiembrosData();
          List<Miembro> lm= emd.miembrosDelEquipo(equipo.getIdEquipo());
          
          for(Miembro m: lm){
             jcbMiembro.addItem(m);
           }
        }
    }//GEN-LAST:event_jcbEquipoActionPerformed

    private void jcbMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMiembroActionPerformed

        if(jcbMiembro.getSelectedItem()!=null){
         EquipoMiembrosData emd= new EquipoMiembrosData();
         Equipo equipo= (Equipo) jcbEquipo.getSelectedItem();
         Miembro miembro= (Miembro) jcbMiembro.getSelectedItem();
         EquiposMiembros em= emd.EquipoMiembro(equipo.getIdEquipo(), miembro.getIdMiembro());
         Proyecto proyecto= equipo.getProyecto();
         jtfProyecto.setText(proyecto.getNombre());
         jcbTarea.removeAllItems();
         TareaData td= new TareaData();
         List<Tarea> t= td.listarTareasPorMiembroEquipo(em.getIdMiembroEq());
         /*if(t.size()>0){
           for(Tarea tarea: t){
            jcbTarea.addItem(tarea);
           }
         }*/
         for(Tarea tarea: t){
            jcbTarea.addItem(tarea);
           }
        }
    }//GEN-LAST:event_jcbMiembroActionPerformed

    private void jcbTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTareaActionPerformed
        // TODO add your handling code here:
        if(jcbTarea.getSelectedItem()!=null){
         Tarea tarea= (Tarea) jcbTarea.getSelectedItem();
         jtfNombre.setText(tarea.getNombre());
         LocalDate ld= tarea.getFechaCreacion();
         Date date = (Date) Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
         jdcFechaCreacion.setDate(date);
         jtfFechaCierre.setText(tarea.getFechaCierre().toString());
         switch(tarea.getEstado()){
             case 0:  jcbEstado.setSelectedIndex(0); break;
             case 1: jcbEstado.setSelectedIndex(1); break;
             case 2: jcbEstado.setSelectedIndex(2); break;
         }
         
         //jdcFechaCreacion.setDate(tarea.getFechaCreacion());
        }
    }//GEN-LAST:event_jcbTareaActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        try {
            
            if(jtfNombre.getText().equals("")){
                jtfNombre.requestFocus();
                throw new Exception("Por favor, ingrese un nombre");
            }
            
            if(jdcFechaCreacion.getDate() == null){
                jdcFechaCreacion.requestFocus();
                throw new Exception("Por favor, ingrese una fecha.");
            }
            
            Tarea t = (Tarea) jcbTarea.getSelectedItem();
            TareaData td = new TareaData();
            
            if(jcbEstado.getSelectedIndex() == 0){
                t.setNombre(jtfNombre.getText());
                t.setFechaCreacion(jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                t.setEstado(0);
                t.setFechaCierre(LocalDate.now());
                System.out.println(t.getIdTarea() + " " + t.getNombre() + " " + t.getFechaCierre().toString() + " " + t.getFechaCreacion().toString() + " " + t.getEstado() + " " + t.getMiembroEq());
                td.guardarTarea(t);
            }else{
                t.setNombre(jtfNombre.getText());
                t.setFechaCreacion(jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                t.setEstado(jcbEstado.getSelectedIndex());
                
                td.guardarTarea(t);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("entro");
        }
    }//GEN-LAST:event_bGuardarActionPerformed

    public void llenarComboEquipo(){
        EquipoData equiData= new EquipoData();
        List<Equipo> equipos= equiData.recuperarEquipos();
        for(Equipo e: equipos){
           jcbEquipo.addItem(e);
         }
    }
    
    public void limpiar(){
     
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<Equipo> jcbEquipo;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<Miembro> jcbMiembro;
    private javax.swing.JComboBox<Tarea> jcbTarea;
    private com.toedter.calendar.JDateChooser jdcFechaCreacion;
    private javax.swing.JTextField jtfFechaCierre;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfProyecto;
    // End of variables declaration//GEN-END:variables
}
