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
import javax.swing.JOptionPane;
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
        buttonGroupFiltroProyectos = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
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
        comboBoxMiembros = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();
        radioButtonTodos = new javax.swing.JRadioButton();
        jbFiltroMiembro = new javax.swing.JButton();
        rbCompletado = new javax.swing.JRadioButton();
        rbProgreso = new javax.swing.JRadioButton();
        rbPausado = new javax.swing.JRadioButton();
        rbEliminado = new javax.swing.JRadioButton();
        rbTodos = new javax.swing.JRadioButton();

        jTextField1.setText("jTextField1");

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
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        radioButtonCompletadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCompletadasActionPerformed(evt);
            }
        });

        buttonGroupFiltroTareas.add(radioButtonProgreso);
        radioButtonProgreso.setText("Progreso");
        radioButtonProgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonProgresoActionPerformed(evt);
            }
        });

        buttonGroupFiltroTareas.add(radioButtonPendiente);
        radioButtonPendiente.setText("Pendiente");
        radioButtonPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonPendienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Filtrar tareas por miembro:");

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        buttonGroupFiltroTareas.add(radioButtonTodos);
        radioButtonTodos.setText("Todos");
        radioButtonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonTodosActionPerformed(evt);
            }
        });

        jbFiltroMiembro.setText("Aplicar");
        jbFiltroMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFiltroMiembroActionPerformed(evt);
            }
        });

        buttonGroupFiltroProyectos.add(rbCompletado);
        rbCompletado.setText("Completado");
        rbCompletado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCompletadoActionPerformed(evt);
            }
        });

        buttonGroupFiltroProyectos.add(rbProgreso);
        rbProgreso.setText("En progreso");
        rbProgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProgresoActionPerformed(evt);
            }
        });

        buttonGroupFiltroProyectos.add(rbPausado);
        rbPausado.setText("Pausado");
        rbPausado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPausadoActionPerformed(evt);
            }
        });

        buttonGroupFiltroProyectos.add(rbEliminado);
        rbEliminado.setText("Eliminado");
        rbEliminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEliminadoActionPerformed(evt);
            }
        });

        buttonGroupFiltroProyectos.add(rbTodos);
        rbTodos.setText("Todos");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
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
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jbBuscar))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbFiltroMiembro))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(radioButtonCompletadas)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButtonPendiente)))
                                .addGap(12, 12, 12)
                                .addComponent(radioButtonProgreso)
                                .addGap(24, 24, 24)
                                .addComponent(radioButtonTodos))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(rbCompletado)
                        .addGap(18, 18, 18)
                        .addComponent(rbProgreso)
                        .addGap(18, 18, 18)
                        .addComponent(rbPausado)
                        .addGap(19, 19, 19)
                        .addComponent(rbEliminado)
                        .addGap(18, 18, 18)
                        .addComponent(rbTodos)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(rbCompletado))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPausado)
                            .addComponent(rbEliminado)
                            .addComponent(rbTodos)
                            .addComponent(rbProgreso))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonCompletadas)
                    .addComponent(radioButtonProgreso)
                    .addComponent(radioButtonTodos)
                    .addComponent(radioButtonPendiente))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboBoxMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFiltroMiembro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(buttonSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void comboBoxProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProyectosActionPerformed

    }//GEN-LAST:event_comboBoxProyectosActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        llenarCBMiembros();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbFiltroMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFiltroMiembroActionPerformed
        
        llenarTabla(4);
        
    }//GEN-LAST:event_jbFiltroMiembroActionPerformed

    private void rbCompletadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCompletadoActionPerformed
        llenarCBProyectos(0);
    }//GEN-LAST:event_rbCompletadoActionPerformed

    private void rbPausadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPausadoActionPerformed
        llenarCBProyectos(2);
    }//GEN-LAST:event_rbPausadoActionPerformed

    private void rbProgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProgresoActionPerformed
        llenarCBProyectos(1);
    }//GEN-LAST:event_rbProgresoActionPerformed

    private void rbEliminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEliminadoActionPerformed
        llenarCBProyectos(3);
    }//GEN-LAST:event_rbEliminadoActionPerformed

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
        llenarCBProyectos(4);
    }//GEN-LAST:event_rbTodosActionPerformed

    private void radioButtonCompletadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCompletadasActionPerformed
        llenarTabla(0);
    }//GEN-LAST:event_radioButtonCompletadasActionPerformed

    private void radioButtonPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonPendienteActionPerformed
        llenarTabla(1);
    }//GEN-LAST:event_radioButtonPendienteActionPerformed

    private void radioButtonProgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonProgresoActionPerformed
        llenarTabla(2);
    }//GEN-LAST:event_radioButtonProgresoActionPerformed

    private void radioButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonTodosActionPerformed
        llenarTabla(3);
    }//GEN-LAST:event_radioButtonTodosActionPerformed

    private void llenarCBProyectos(int estado){

        comboBoxProyectos.removeAllItems();
        comboBoxMiembros.removeAllItems();
        
        
        if(rbTodos.isSelected() && estado == 4){
            
            for(Proyecto p: pd.listarProyectos()){
                comboBoxProyectos.addItem(p);
            }
            
        }else{
            
            for(Proyecto p: pd.listarProyectosEstado(estado)){
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
    
    private void llenarTabla(int control){
    
        EquiposMiembros em = (EquiposMiembros) comboBoxMiembros.getSelectedItem();
        
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) tableTareas.getModel();
        tableTareas.setModel(modelo);
        modelo.setRowCount(0);
        
        if(control == 4){
            
            
            List<Tarea> tareas = td.listarTareasPorMiembroEquipo(em.getIdMiembroEq());

            for(Tarea t: tareas){
                switch (t.getEstado()) {
                    case 0:
                        modelo.addRow(new Object[]{t.getNombre(), t.getFechaCreacion().toString(),"Completado",t.getFechaCierre().toString()});
                        break;
                    case 1:
                        modelo.addRow(new Object[]{t.getNombre(), t.getFechaCreacion().toString(),"Pendiente",t.getFechaCierre().toString()});
                        break;
                    case 2:
                        modelo.addRow(new Object[]{t.getNombre(), t.getFechaCreacion().toString(),"En progreso",t.getFechaCierre().toString()});
                        break;
                    default: System.out.println("No existe otro estado");
                        
                }

            }    
            
        }else{
            
            int idProyecto = em.getEquipo().getProyecto().getIdProyecto();
            List<Equipo> equipos = ed.buscarEquipoProyecto(idProyecto);
            List<EquiposMiembros> emFiltrados = new ArrayList();
            List<Tarea> tareas = new ArrayList();
            
            for(Equipo e: equipos){
                
                List<EquiposMiembros> emSinFiltro = emd.listarEquipoMiembros(e.getIdEquipo());
                for(EquiposMiembros emAux: emSinFiltro){
                    emFiltrados.add(emAux);
                }
            }
            
            for(EquiposMiembros emAux: emFiltrados){
                
                List<Tarea> tareasAux = td.listarTareasPorMiembroEquipo(emAux.getIdMiembroEq());
                for(Tarea tareaAux: tareasAux){
                    tareas.add(tareaAux);
                }
            }
            
            for(Tarea t: tareas){
                if(control != 3){
                    
                    if(t.getEstado() == control){
                    
                        switch (t.getEstado()) {
                            case 0:
                                modelo.addRow(new Object[]{t.getNombre(), t.getFechaCreacion().toString(),"Completado",t.getFechaCierre().toString()});
                                break;
                            case 1:
                                modelo.addRow(new Object[]{t.getNombre(), t.getFechaCreacion().toString(),"Pendiente",t.getFechaCierre().toString()});
                                break;
                            case 2:
                                modelo.addRow(new Object[]{t.getNombre(), t.getFechaCreacion().toString(),"En progreso",t.getFechaCierre().toString()});
                                break;
                            default: System.out.println("No existe otro estado");

                        }
                    
                    }
                    
                }else{
                    switch (t.getEstado()) {
                        case 0:
                            modelo.addRow(new Object[]{t.getNombre(), t.getFechaCreacion().toString(),"Completado",t.getFechaCierre().toString()});
                            break;
                        case 1:
                            modelo.addRow(new Object[]{t.getNombre(), t.getFechaCreacion().toString(),"Pendiente",t.getFechaCierre().toString()});
                            break;
                        case 2:
                            modelo.addRow(new Object[]{t.getNombre(), t.getFechaCreacion().toString(),"En progreso",t.getFechaCierre().toString()});
                            break;
                        default: System.out.println("No existe otro estado");

                    }
                }
                
            }
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFiltroProyectos;
    private javax.swing.ButtonGroup buttonGroupFiltroTareas;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JComboBox<EquiposMiembros> comboBoxMiembros;
    private javax.swing.JComboBox<Proyecto> comboBoxProyectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbFiltroMiembro;
    private javax.swing.JRadioButton radioButtonCompletadas;
    private javax.swing.JRadioButton radioButtonPendiente;
    private javax.swing.JRadioButton radioButtonProgreso;
    private javax.swing.JRadioButton radioButtonTodos;
    private javax.swing.JRadioButton rbCompletado;
    private javax.swing.JRadioButton rbEliminado;
    private javax.swing.JRadioButton rbPausado;
    private javax.swing.JRadioButton rbProgreso;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTable tableTareas;
    // End of variables declaration//GEN-END:variables

}




