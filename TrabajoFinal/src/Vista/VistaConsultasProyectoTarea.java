package Vista;

//Consultar proyectos y tareas: Los usuarios podrán ver la lista de proyectos y sus respectivas tareas, así como filtrar las

import AccesoADatos.ProyectoData;
import Modelo.Proyecto;
import java.util.List;
import javax.swing.JOptionPane;

//tareas por estado y miembro del equipo.

public class VistaConsultasProyectoTarea extends javax.swing.JInternalFrame {

    public VistaConsultasProyectoTarea() {
        initComponents();
        comboBoxProyectos.setEnabled(false);     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFiltroProyectos = new javax.swing.ButtonGroup();
        buttonGroupFiltroTareas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        comboBoxProyectos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioButtonActivo = new javax.swing.JRadioButton();
        radioButtonComPau = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTareas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        radioButtonCompletadas = new javax.swing.JRadioButton();
        radioButtonProgreso = new javax.swing.JRadioButton();
        radioButtonPendiente = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        textFieldFiltroDni = new javax.swing.JTextField();
        buttonSalir = new javax.swing.JButton();
        buttonFiltrar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CONSULTAR PROYECTOS Y TAREAS");

        jLabel2.setText("Proyectos:");

        jLabel3.setText("Filtrar proyectos por estado:");

        buttonGroupFiltroProyectos.add(radioButtonActivo);
        radioButtonActivo.setText("Activo");
        radioButtonActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonActivoActionPerformed(evt);
            }
        });

        buttonGroupFiltroProyectos.add(radioButtonComPau);
        radioButtonComPau.setText("Completado/pausado");
        radioButtonComPau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonComPauActionPerformed(evt);
            }
        });

        tableTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Fecha de creación", "Fecha de cierre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

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

        jLabel5.setText("Filtrar tareas por miembro de equipo[DNI]:");

        buttonSalir.setText("Salir");

        buttonFiltrar.setText("Filtrar");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(32, 32, 32)
                                    .addComponent(comboBoxProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(radioButtonCompletadas))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(radioButtonActivo)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(radioButtonComPau)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(radioButtonProgreso)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(radioButtonPendiente)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldFiltroDni, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonFiltrar)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radioButtonActivo)
                    .addComponent(radioButtonComPau))
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
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldFiltroDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(buttonSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioButtonActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonActivoActionPerformed
        
        comboBoxProyectos.setEnabled(true);
        llenarCB(true);
        
        
    }//GEN-LAST:event_radioButtonActivoActionPerformed

    private void radioButtonComPauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonComPauActionPerformed
        
        comboBoxProyectos.setEnabled(true);
        llenarCB(false);
        
    }//GEN-LAST:event_radioButtonComPauActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFiltrar;
    private javax.swing.ButtonGroup buttonGroupFiltroProyectos;
    private javax.swing.ButtonGroup buttonGroupFiltroTareas;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JComboBox<String> comboBoxProyectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioButtonActivo;
    private javax.swing.JRadioButton radioButtonComPau;
    private javax.swing.JRadioButton radioButtonCompletadas;
    private javax.swing.JRadioButton radioButtonPendiente;
    private javax.swing.JRadioButton radioButtonProgreso;
    private javax.swing.JTable tableTareas;
    private javax.swing.JTextField textFieldFiltroDni;
    // End of variables declaration//GEN-END:variables

    private void llenarCB(boolean estado){

        ProyectoData pd = new ProyectoData();
        List<Proyecto> proyectos = pd.listarProyectos();
        comboBoxProyectos.removeAllItems();
        
        for(Proyecto p: proyectos){
            //comboBoxProyectos.addItem(p.toString());
            if(p.getEstado() == estado){
                
                comboBoxProyectos.addItem(p.toString());
//                JOptionPane.showMessageDialog(this, p.getNombre() + ", " + p.getEstado());
                
            }
//            else{
//                
//                JOptionPane.showMessageDialog(this, p.getNombre() + ", " + p.getEstado());
//                
//            }
            
        }

    }

}




