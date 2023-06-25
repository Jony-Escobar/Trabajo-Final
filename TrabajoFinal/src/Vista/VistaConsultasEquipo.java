package Vista;

import AccesoADatos.EquipoData;
import Modelo.Equipo;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class VistaConsultasEquipo extends javax.swing.JInternalFrame {

    private EquipoData ed = new EquipoData();
    
    public VistaConsultasEquipo() {
        initComponents();
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DNI", "Apellido", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtMiembros);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Miembros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jrbActivos)
                        .addGap(18, 18, 18)
                        .addComponent(jrbInactivos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jLabel2))
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivosActionPerformed
        jcbEquipos.removeAllItems();
//        llenarCB(1);
    }//GEN-LAST:event_jrbActivosActionPerformed

    private void jrbInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivosActionPerformed
        jcbEquipos.removeAllItems();
//        llenarCB(0);
    }//GEN-LAST:event_jrbInactivosActionPerformed

    private void jcbEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEquiposActionPerformed
        
        
        
    }//GEN-LAST:event_jcbEquiposActionPerformed

    private void llenarTabla(){
    
//        DefaultTableModel modelo;
//        Miembro miembro= (Miembro) jcbMateria.getSelectedItem();
//        modelo = (DefaultTableModel) jtMiembros.getModel();
//        jtAlumnos.setModel(modelo);
//        List<Alumno> alumnos= insData.obtenerAlumnosXMateria(materia.getIdMateria());
//        for(Alumno alu: alumnos){
//          modelo.addRow(new Object[]{alu.getIdAlumno(), alu.getDni(),alu.getApellido(),alu.getNombre()});
//        }
    }
    
    private void borrarFilas(){
//     modelo = (DefaultTableModel) jtAlumnos.getModel();
//          jtAlumnos.setModel(modelo);
//        // System.out.println("Cantidad de filas: "+ modelo.getRowCount());
//      if(modelo.getRowCount()>0){
//       int filas= modelo.getRowCount()-1;
//       for(int i= filas; i>=0;i--){
//         modelo.removeRow(i);
//      }
//    
//    private void llenarCB(int estado){
//        
//        List<Equipo> equipos = ed.recuperarEquipos();
//        
//        for(Equipo e: equipos){
//            
//            if(e.getEstado() == estado){
//                
//                jcbEquipos.addItem(e);
//                
//            }
//            
//        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup activoInactivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Equipo> jcbEquipos;
    private javax.swing.JRadioButton jrbActivos;
    private javax.swing.JRadioButton jrbInactivos;
    private javax.swing.JTable jtMiembros;
    // End of variables declaration//GEN-END:variables
}
