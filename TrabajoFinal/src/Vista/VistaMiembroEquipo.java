/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import AccesoADatos.EquipoData;
import AccesoADatos.EquipoMiembrosData;
import AccesoADatos.MiembroData;
import Modelo.Equipo;
import Modelo.EquiposMiembros;
import Modelo.Miembro;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ItemEvent;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class VistaMiembroEquipo extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaMiembroEquipo
     */
    
    Equipo equipo= new Equipo();
    EquipoData equiData= new EquipoData();
    Miembro miembro= new Miembro();
    MiembroData miData= new MiembroData();
    EquipoMiembrosData equiMiembrosData= new EquipoMiembrosData();
    
    public void limpiar(){
      jdcFechaIncorporacion.setDate(null);
      jtfRol.setText(null);
      jcbEquipo.setSelectedIndex(-1);
      jcbMiembro.removeAllItems();
      jcbNoMiembros.removeAllItems();
      //jcbMiembro.setSelectedIndex(-1);
      
    }
    
    public VistaMiembroEquipo() {
        initComponents();
        
//        jbAyuda.setFocusable(false);
        //jbAyuda.setContentAreaFilled(false);
        jlEquipo.setVisible(false);
        jlMiembro.setVisible(false);
        jlFecha.setVisible(false);
        jlRol.setVisible(false);
        
        //Llenamos el jcbEquipo con los equipos
        List<Equipo> listaEquipos= equiData.recuperarEquipos();
        if(listaEquipos.size()>0){
         for(Equipo e: listaEquipos){
          jcbEquipo.addItem(e);
         }
        }
        jcbEquipo.setSelectedIndex(-1);
        jcbMiembro.setSelectedIndex(-1);
        jcbNoMiembros.setSelectedIndex(-1);
        
//        jcbMiembro.setSelectedIndex(-1);
        
        //Llenamos el jcbMiembro con los miembros
//        List<Miembro> listaMiembro= miData.recuperarMiembros();
//        if(listaMiembro.size()>0){
//         for(Miembro m: listaMiembro){
//          jcbMiembro.addItem(m);
//         }
//        }
//        jcbMiembro.setSelectedIndex(-1);

    } //VistaMiembroEquipo

   /* public void llenarComboMiembros(int idEquipo){
      List<Miembro> listaMiembro= equiMiembrosData.noPerteneceAEquipo(idEquipo);
      if(listaMiembro.size()>0){
       for(Miembro lm: listaMiembro){
         jcbMiembro.addItem(lm);
       }
      }
      
      
    }*/
    
    /*public void cargarComboNoMiembros(){
    jcbNoMiembros.removeAllItems(); 
    equipo = (Equipo) jcbEquipo.getSelectedItem();
    List<Miembro> lista = equiMiembrosData.noPerteneceAEquipo(equipo.getIdEquipo());
    
    if (lista.size() > 0) {
        for (Miembro m : lista) {
            jcbNoMiembros.addItem(m); // Agrega los miembros que no pertenecen al equipo
        }
    }
    }*/
    
    public boolean validar(){
     boolean validacion= false;
     if(jcbEquipo.getSelectedItem()!= null){
         jlEquipo.setVisible(false);
         if(jcbMiembro.getSelectedItem()!=null){
             jlMiembro.setVisible(false);
           if(jdcFechaIncorporacion.getDate()!=null){
             jlFecha.setVisible(false);
             if(!jtfRol.getText().isEmpty()){
                jlRol.setVisible(false);
                validacion= true;
                return validacion;
             }
             else{
              jlRol.setVisible(true);
              jtfRol.requestFocus();
             }
                                 
           }
           else{
           jlFecha.setVisible(true);
           jdcFechaIncorporacion.requestFocus();
           }
         }
         else{
          jlMiembro.setVisible(true);
          jcbMiembro.requestFocus();
         }
        }
     else{
       jlEquipo.setVisible(true);
       jcbEquipo.requestFocus();
     }
     return validacion;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbEquipo = new javax.swing.JComboBox<>();
        jcbMiembro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jbAgregarMiembroEquipo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jdcFechaIncorporacion = new com.toedter.calendar.JDateChooser();
        jtfRol = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbEquipo1 = new javax.swing.JComboBox<>();
        jcbMiembro1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jbAgregarMiembroEquipo1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jdcFechaIncorporacion1 = new com.toedter.calendar.JDateChooser();
        jtfRol1 = new javax.swing.JTextField();
        jbLimpiar1 = new javax.swing.JButton();
        jlEquipo = new javax.swing.JLabel();
        jlMiembro = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jlRol = new javax.swing.JLabel();
        jcbNoMiembros = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(650, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Miembros - Equipos");

        jLabel2.setText("Equipo");

        jcbEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEquipoActionPerformed(evt);
            }
        });

        jLabel3.setText("+ Agregar");

        jbAgregarMiembroEquipo.setText("Agregar al Equipo");
        jbAgregarMiembroEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarMiembroEquipoActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Incorporacion");

        jLabel5.setText("Rol");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Miembros - Equipos");

        jLabel7.setText("Equipo");

        jLabel8.setText("Miembro");

        jbAgregarMiembroEquipo1.setText("Agregar al Equipo");
        jbAgregarMiembroEquipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarMiembroEquipo1ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Fecha Incorporacion");

        jLabel10.setText("Rol");

        jbLimpiar1.setText("Limpiar");
        jbLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jbLimpiar1)
                .addGap(39, 39, 39)
                .addComponent(jbAgregarMiembroEquipo1)
                .addGap(35, 35, 35)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbMiembro1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdcFechaIncorporacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfRol1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jcbEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jcbMiembro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9))
                    .addComponent(jdcFechaIncorporacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfRol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregarMiembroEquipo1)
                    .addComponent(jButton3)
                    .addComponent(jbLimpiar1))
                .addGap(43, 43, 43))
        );

        jlEquipo.setText("Elija un equipo");

        jlMiembro.setText("Seleccione un miembro");

        jlFecha.setBackground(new java.awt.Color(255, 255, 255));
        jlFecha.setForeground(new java.awt.Color(204, 0, 0));
        jlFecha.setText("Ingrese una fecha");

        jlRol.setForeground(new java.awt.Color(204, 0, 0));
        jlRol.setText("Ingrese un Rol");

        jLabel11.setText("Miembros del Equipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 429, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jcbMiembro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(114, 114, 114)
                                            .addComponent(jlEquipo))
                                        .addComponent(jcbEquipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(95, 95, 95)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(80, 80, 80)
                                            .addComponent(jlMiembro))
                                        .addComponent(jcbNoMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jdcFechaIncorporacion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlFecha)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jlRol)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfRol, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jbAgregarMiembroEquipo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 429, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 430, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEquipo)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jlMiembro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbNoMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlFecha)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jdcFechaIncorporacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jlRol))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAgregarMiembroEquipo)
                            .addComponent(jbLimpiar)
                            .addComponent(jbSalir))
                        .addGap(26, 26, 26))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 218, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 193, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarMiembroEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarMiembroEquipoActionPerformed
        // TODO add your handling code here:
        boolean flag= false;
        if(validar()){
            
        equipo= (Equipo) jcbEquipo.getSelectedItem();
        miembro= (Miembro) jcbNoMiembros.getSelectedItem();
        EquiposMiembros em= new EquiposMiembros();
        EquipoMiembrosData emd= new EquipoMiembrosData();
        em.setEquipo(equipo);
        em.setMiembro(miembro);
        Date fechaActual= new Date(); //fecha actual de la pc
        Date fechaIngresada= jdcFechaIncorporacion.getDate();
        //if(jdcFechaIncorporacion.getDate()!= null){
        if(fechaIngresada.after(fechaActual)){
         //JOptionPane.showMessageDialog(null, "Ingrese una Fecha válida");
         JOptionPane.showMessageDialog(null, "La fecha ingresada no puede ser posterior a la actual",
  "Fecha inválida", JOptionPane.ERROR_MESSAGE);
         jdcFechaIncorporacion.setDate(null);
         jdcFechaIncorporacion.requestFocus();
            
        }
        else{
        em.setFechaIncorporacion(jdcFechaIncorporacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }
        if(jtfRol.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "Ingrese un Rol");
         jtfRol.requestFocus();
        }
        else{        
        em.setRol(jtfRol.getText());
        }
        emd.guardarEquipoMiembros(em);
        limpiar();
        }
        
        
    }//GEN-LAST:event_jbAgregarMiembroEquipoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        jdcFechaIncorporacion.setDate(null);
        jtfRol.setText(null);
        jcbEquipo.setSelectedIndex(-1);
        jcbMiembro.setSelectedIndex(-1);
    }//GEN-LAST:event_jbLimpiarActionPerformed
/*
    private void jcbEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEquipoActionPerformed
        // TODO add your handling code here:
      // jcbMiembro.removeAllItems();
      //  Equipo equipo= (Equipo) jcbEquipo.getSelectedItem();
      //  llenarComboMiembros(equipo.getIdEquipo());

         jcbMiembro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jcbMiembro.removeAllItems(); // si elije otro equipo, borra los ìtem para mostrar los miembros de otro equipo
                Equipo equipo= (Equipo) jcbEquipo.getSelectedItem();
                List<Miembro> lista= equiMiembrosData.noPerteneceAEquipo(equipo.getIdEquipo());
                if(lista.size()>0){
                 for(Miembro m: lista){
                  jcbMiembro.addItem(m); // agrego los miembros que no pertenecen al equipo
                 }
                }
                
                //String elementoSeleccionado = (String) jcbMiembro.getSelectedItem();
                //System.out.println("Elemento seleccionado: " + elementoSeleccionado);
                // Realizar la acción deseada aquí
            } 
         });
    }//GEN-LAST:event_jcbEquipoActionPerformed
     
    */
    
        
    // agregado
    private void jcbEquipoActionPerformed(java.awt.event.ActionEvent evt) {                                          
    if(jcbEquipo.getSelectedIndex()!=-1){
       jcbNoMiembros.removeAllItems(); 
       equipo = (Equipo) jcbEquipo.getSelectedItem();
       List<Miembro> lista = equiMiembrosData.noPerteneceAEquipo(equipo.getIdEquipo());
    
    //Llenamos el jcbNoMiembros   
    if (lista.size() > 0) {
      for (Miembro m : lista) {
         jcbNoMiembros.addItem(m); // Agrega los miembros que no pertenecen al equipo
      }
    }
       
    //Llenamos el jcbMiembros de los que pertenecen a ese equipo
    jcbMiembro.removeAllItems();
    List<Miembro> listaMiembros= equiMiembrosData.miembrosDelEquipo(equipo.getIdEquipo());
    
    if(listaMiembros.size()>0){
     for(Miembro lm: listaMiembros){
       jcbMiembro.addItem(lm);
     }
    }
    }
    }
    
    /*
    private void jcbEquipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbEquipoItemStateChanged
        // TODO add your handling code here:
        
//        jcbEquipo.addItemListener(new ItemListener() {
//    public void itemStateChanged(ItemEvent event) {
//        if (event.getStateChange() == ItemEvent.SELECTED) {
//            Object item = event.getItem();
//            // Realice la acción deseada aquí
//        }
//    }
        
//        jcbMiembro.removeAllItems();
//        Equipo equipo= (Equipo) jcbEquipo.getSelectedItem();
//        llenarComboMiembros(equipo.getIdEquipo());
    }//GEN-LAST:event_jcbEquipoItemStateChanged
*/
    private void jbAgregarMiembroEquipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarMiembroEquipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAgregarMiembroEquipo1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLimpiar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbAgregarMiembroEquipo;
    private javax.swing.JButton jbAgregarMiembroEquipo1;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbLimpiar1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Equipo> jcbEquipo;
    private javax.swing.JComboBox<Equipo> jcbEquipo1;
    private javax.swing.JComboBox<Miembro> jcbMiembro;
    private javax.swing.JComboBox<Miembro> jcbMiembro1;
    private javax.swing.JComboBox<Miembro> jcbNoMiembros;
    private com.toedter.calendar.JDateChooser jdcFechaIncorporacion;
    private com.toedter.calendar.JDateChooser jdcFechaIncorporacion1;
    private javax.swing.JLabel jlEquipo;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlMiembro;
    private javax.swing.JLabel jlRol;
    private javax.swing.JTextField jtfRol;
    private javax.swing.JTextField jtfRol1;
    // End of variables declaration//GEN-END:variables
}
