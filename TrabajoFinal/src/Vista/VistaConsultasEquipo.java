package Vista;
/*Consultar información del equipo: Los usuarios podrán ver la lista de miembros del equipo y obtener información detallada
de cada miembro, como su nombre y rol.*/
import AccesoADatos.EquipoData;
import AccesoADatos.EquipoMiembrosData;
import Modelo.Equipo;
import Modelo.EquiposMiembros;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class VistaConsultasEquipo extends javax.swing.JInternalFrame {

    private EquipoData ed = new EquipoData();
    private EquipoMiembrosData emd = new EquipoMiembrosData();
    
    public VistaConsultasEquipo() {
        initComponents();
        jtfProyecto.setEditable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        activoInactivo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jrbActivos = new javax.swing.JRadioButton();
        jrbInactivos = new javax.swing.JRadioButton();
        jcbEquipos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMiembros = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfProyecto = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Consultar equipos y miembros");

        activoInactivo.add(jrbActivos);
        jrbActivos.setText("Equipos activos");
        jrbActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivosActionPerformed(evt);
            }
        });

        activoInactivo.add(jrbInactivos);
        jrbInactivos.setText("Equipos inactivos");
        jrbInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivosActionPerformed(evt);
            }
        });

        jcbEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEquiposActionPerformed(evt);
            }
        });

        jLabel2.setText("Equipos:");

        jtMiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Apellido", "Nombre", "Rol", "Estado", "Fecha de incorporación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtMiembros);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Miembros");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Proyecto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jrbActivos)
                        .addGap(27, 27, 27)
                        .addComponent(jrbInactivos)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbSalir)
                        .addGap(31, 31, 31))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfProyecto))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar)))
                        .addGap(0, 111, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbActivos)
                    .addComponent(jrbInactivos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivosActionPerformed
        jcbEquipos.removeAllItems();
        borrarFilas();
        llenarCB(1);
    }//GEN-LAST:event_jrbActivosActionPerformed

    private void jrbInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivosActionPerformed
        jcbEquipos.removeAllItems();
        borrarFilas();
        llenarCB(0);
    }//GEN-LAST:event_jrbInactivosActionPerformed

    private void jcbEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEquiposActionPerformed
    
    }//GEN-LAST:event_jcbEquiposActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        borrarFilas();
        llenarTabla();
        
        Equipo equipo = (Equipo) jcbEquipos.getSelectedItem();
        jtfProyecto.setText(equipo.getProyecto().getNombre());
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void llenarTabla(){
    
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jtMiembros.getModel();
        jtMiembros.setModel(modelo);
        
        Equipo equipo = (Equipo) jcbEquipos.getSelectedItem();
        List<EquiposMiembros> em = emd.listarEquipoMiembros(equipo.getIdEquipo());
        
        for(EquiposMiembros aux: em){
            
            if(aux.getMiembro().getEstado() == 1){
                
               modelo.addRow(new Object[]{aux.getMiembro().getDni(),aux.getMiembro().getApellido(), aux.getMiembro().getNombre(),
                aux.getRol(),"Activo",aux.getFechaIncorporacion().toString()}); 
               
            }else{
                
                modelo.addRow(new Object[]{aux.getMiembro().getDni(),aux.getMiembro().getApellido(), aux.getMiembro().getNombre(),
                aux.getRol(),"Inactivo",aux.getFechaIncorporacion().toString()});
                
            }
            
        }
    }
    
    private void borrarFilas(){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jtMiembros.getModel();
        jtMiembros.setModel(modelo);
        
        if(modelo.getRowCount()>0){
            
            int filas= modelo.getRowCount()-1;
            
            for(int i= filas; i >= 0 ; i--){
            modelo.removeRow(i);
            }
        }
    }
    
    private void llenarCB(int estado){
        
        jcbEquipos.removeAllItems();
        List<Equipo> equipos = ed.recuperarEquipos();
        
        for(Equipo e: equipos){
            
            if(e.getEstado() == estado){
                
                jcbEquipos.addItem(e);
                
            }
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup activoInactivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Equipo> jcbEquipos;
    private javax.swing.JRadioButton jrbActivos;
    private javax.swing.JRadioButton jrbInactivos;
    private javax.swing.JTable jtMiembros;
    private javax.swing.JTextField jtfProyecto;
    // End of variables declaration//GEN-END:variables
}
