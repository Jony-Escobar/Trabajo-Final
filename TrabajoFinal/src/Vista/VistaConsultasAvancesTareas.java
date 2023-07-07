package Vista;

import AccesoADatos.ComentariosData;
import AccesoADatos.EquipoData;
import AccesoADatos.EquipoMiembrosData;
import AccesoADatos.MiembroData;
import AccesoADatos.TareaData;
import Modelo.Comentarios;
import Modelo.Equipo;
import Modelo.EquiposMiembros;
import Modelo.Miembro;
import Modelo.Tarea;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class VistaConsultasAvancesTareas extends javax.swing.JInternalFrame {

    private EquipoData ed = new EquipoData();
    private EquipoMiembrosData emd = new EquipoMiembrosData();
    private TareaData td = new TareaData();
    private ComentariosData cd = new ComentariosData();
   
    public VistaConsultasAvancesTareas() {
        initComponents();
        llenarEquipos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbEquipos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbMiembros = new javax.swing.JComboBox<>();
        bBuscarMiembros = new javax.swing.JButton();
        bBuscarTareas = new javax.swing.JButton();
        cbTareas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        bCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tTabla = new javax.swing.JTable();
        bSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Consultar Avances de tareas");

        jLabel2.setText("Equipos:");

        jLabel3.setText("Miembros:");

        bBuscarMiembros.setText("Buscar Miembros");
        bBuscarMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarMiembrosActionPerformed(evt);
            }
        });

        bBuscarTareas.setText("Buscar Tareas");
        bBuscarTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarTareasActionPerformed(evt);
            }
        });

        jLabel4.setText("Tareas:");

        bCargar.setText("Cargar");
        bCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCargarActionPerformed(evt);
            }
        });

        tTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Comentario", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tTabla);

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(165, 165, 165))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bSalir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbEquipos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbMiembros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbTareas, 0, 155, Short.MAX_VALUE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bBuscarMiembros)
                                .addComponent(bBuscarTareas)
                                .addComponent(bCargar)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscarMiembros))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscarTareas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(bCargar))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarMiembrosActionPerformed
        vaciarTabla();
        llenarMiembros();
    }//GEN-LAST:event_bBuscarMiembrosActionPerformed

    private void bBuscarTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarTareasActionPerformed
        vaciarTabla();
        llenarTareas();
    }//GEN-LAST:event_bBuscarTareasActionPerformed

    private void bCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCargarActionPerformed
        vaciarTabla();
        llenarTabla();
    }//GEN-LAST:event_bCargarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    
    
    private void llenarEquipos(){
        cbEquipos.removeAllItems();
        List<Equipo> equipos = ed.recuperarEquipos();
        for(Equipo e: equipos){
            cbEquipos.addItem(e);
        }
    }
    
    private void llenarMiembros(){
        cbMiembros.removeAllItems();
        Equipo e = (Equipo)cbEquipos.getSelectedItem();
        List<EquiposMiembros> equipomiembros = emd.listarEquipoMiembros(e.getIdEquipo());
        for(EquiposMiembros em: equipomiembros){
            cbMiembros.addItem(em);
        }
    }
    
    private void llenarTareas(){
        cbTareas.removeAllItems();
        EquiposMiembros em = (EquiposMiembros) cbMiembros.getSelectedItem();
        List<Tarea> tareas = td.listarTareasPorMiembroEquipo(em.getIdMiembroEq());
        for(Tarea t: tareas){
            cbTareas.addItem(t);
        }
    }
    
    private void llenarTabla(){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) tTabla.getModel();
        tTabla.setModel(modelo);
        modelo.setRowCount(0);
        Tarea t = (Tarea) cbTareas.getSelectedItem();
        List<Comentarios> comentarios = cd.listarComentarios(t.getIdTarea());
        
        for(Comentarios c: comentarios){
            modelo.addRow(new Object[]{c.getComentario(),c.getFechaAvance().toString()});
            
        }
    }
    
    private void vaciarTabla(){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) tTabla.getModel();
        tTabla.setModel(modelo);
        modelo.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscarMiembros;
    private javax.swing.JButton bBuscarTareas;
    private javax.swing.JButton bCargar;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<Equipo> cbEquipos;
    private javax.swing.JComboBox<EquiposMiembros> cbMiembros;
    private javax.swing.JComboBox<Tarea> cbTareas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tTabla;
    // End of variables declaration//GEN-END:variables
}
