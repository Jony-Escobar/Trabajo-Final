package Vista;

//Consultar proyectos y tareas: Los usuarios podrán ver la lista de proyectos y sus respectivas tareas, así como filtrar las
//tareas por estado y miembro del equipo.
import AccesoADatos.EquipoData;
import AccesoADatos.EquipoMiembrosData;
import AccesoADatos.ProyectoData;
import AccesoADatos.TareaData;
import Modelo.Equipo;
import Modelo.EquiposMiembros;
import Modelo.Proyecto;
import Modelo.Tarea;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;



public class VistaConsultasProyectoTarea extends javax.swing.JInternalFrame {

    private ProyectoData pd = new ProyectoData();
    private EquipoData ed = new EquipoData();
    private EquipoMiembrosData emd = new EquipoMiembrosData();
    private TareaData td = new TareaData();
    
    public VistaConsultasProyectoTarea() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFiltroTareas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        comboBoxProyectos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTareas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        radioButtonCompletadas = new javax.swing.JRadioButton();
        radioButtonProgreso = new javax.swing.JRadioButton();
        radioButtonPendiente = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        buttonSalir = new javax.swing.JButton();
        comboBoxEstadoProyecto = new javax.swing.JComboBox<>();
        comboBoxMiembros = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CONSULTAR PROYECTOS Y TAREAS");

        comboBoxProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProyectosActionPerformed(evt);
            }
        });

        jLabel2.setText("Proyectos:");

        jLabel3.setText("Filtrar proyectos por estado:");

        tableTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Fecha de creación", "Estado", "Fecha de cierre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableTareas);

        jLabel4.setText("Filtrar tareas por estado:");

        buttonGroupFiltroTareas.add(radioButtonCompletadas);
        radioButtonCompletadas.setText("Completadas");

        buttonGroupFiltroTareas.add(radioButtonProgreso);
        radioButtonProgreso.setText("Progreso");

        buttonGroupFiltroTareas.add(radioButtonPendiente);
        radioButtonPendiente.setText("Pendiente");

        jLabel5.setText("Filtrar tareas por miembro de equipo:");

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        comboBoxEstadoProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Completados", "En progreso", "Pausados", "Eliminados", "Todos" }));
        comboBoxEstadoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEstadoProyectoActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonSalir)
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(radioButtonCompletadas)
                                .addGap(22, 22, 22)
                                .addComponent(radioButtonProgreso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioButtonPendiente))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(32, 32, 32)
                                        .addComponent(comboBoxProyectos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboBoxEstadoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addComponent(jbBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxEstadoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioButtonCompletadas)
                    .addComponent(radioButtonProgreso)
                    .addComponent(radioButtonPendiente))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboBoxMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(buttonSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxEstadoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEstadoProyectoActionPerformed
        
    }//GEN-LAST:event_comboBoxEstadoProyectoActionPerformed

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void comboBoxProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProyectosActionPerformed
        llenarCBMiembros();
        llenarTabla();
    }//GEN-LAST:event_comboBoxProyectosActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        llenarCBProyectos();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void llenarCBProyectos(){

        comboBoxProyectos.removeAllItems();
        comboBoxMiembros.removeAllItems();
        
        if(comboBoxEstadoProyecto.getSelectedIndex() == 4){
            
            for(Proyecto p: pd.listarProyectos()){
                comboBoxProyectos.addItem(p);
            }
            
        }else{
            
            for(Proyecto p: pd.listarProyectosEstado(comboBoxEstadoProyecto.getSelectedIndex())){
                comboBoxProyectos.addItem(p);
            }
            
        }
        
        
    }
    
    private void llenarCBMiembros(){
        
        comboBoxMiembros.removeAllItems();
        
        List<EquiposMiembros> emLista = new ArrayList();
        Proyecto p = (Proyecto) comboBoxProyectos.getSelectedItem();
        List<Equipo> equipos = ed.buscarEquipoProyecto(p.getIdProyecto());
        
        for(Equipo e: equipos){
            
            for(EquiposMiembros em: emd.listarEquipoMiembros(e.getIdEquipo())){
                emLista.add(em);
            }
            
        }
        
        for(EquiposMiembros em: emLista){
            comboBoxMiembros.addItem(em);
        }
  
    }
    
    private void llenarTabla(){
    
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) tableTareas.getModel();
        tableTareas.setModel(modelo);
        
        EquiposMiembros em = (EquiposMiembros) comboBoxMiembros.getSelectedItem();
        List<Tarea> tareas = td.listarTareasPorMiembroEquipo(em.getIdMiembroEq());
        
        for(Tarea t: tareas){
            //deberia de poner el estado en string
            modelo.addRow(new Object[]{t.getNombre(), t.getFechaCreacion().toString(),t.getEstado(),t.getFechaCierre().toString()});
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFiltroTareas;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JComboBox<String> comboBoxEstadoProyecto;
    private javax.swing.JComboBox<EquiposMiembros> comboBoxMiembros;
    private javax.swing.JComboBox<Proyecto> comboBoxProyectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JRadioButton radioButtonCompletadas;
    private javax.swing.JRadioButton radioButtonPendiente;
    private javax.swing.JRadioButton radioButtonProgreso;
    private javax.swing.JTable tableTareas;
    // End of variables declaration//GEN-END:variables

}




