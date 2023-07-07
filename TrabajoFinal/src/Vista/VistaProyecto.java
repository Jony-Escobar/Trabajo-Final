package Vista;

import AccesoADatos.EquipoData;
import AccesoADatos.EquipoMiembrosData;
import AccesoADatos.ProyectoData;
import AccesoADatos.TareaData;
import Modelo.Equipo;
import Modelo.EquiposMiembros;
import Modelo.Proyecto;
import Modelo.Tarea;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

public class VistaProyecto extends javax.swing.JInternalFrame {

    public VistaProyecto() {
        initComponents();
        //Seteo como fecha maxima, la fecha de hoy
        jdcFechaCreacion.setMaxSelectableDate(Calendar.getInstance().getTime());
        //Desactivamos todo
        desactivar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGroupCrearProyecto = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        radioButtonCrear = new javax.swing.JRadioButton();
        radioButtonModificar = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        buttonSalir = new javax.swing.JButton();
        buttonCrear = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        textFieldDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textFieldID = new javax.swing.JTextField();
        jdcFechaCreacion = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();
        comboBoxEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PROYECTO");

        bGroupCrearProyecto.add(radioButtonCrear);
        radioButtonCrear.setText("CREAR PROYECTO");
        radioButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCrearActionPerformed(evt);
            }
        });

        bGroupCrearProyecto.add(radioButtonModificar);
        radioButtonModificar.setText("MODIFICAR PROYECTO");
        radioButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonModificarActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("DESCRIPCIÓN:");

        jLabel4.setText("FECHA DE INICIO:");

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        buttonCrear.setText("Crear");
        buttonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearActionPerformed(evt);
            }
        });

        buttonModificar.setText("Modificar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        buttonLimpiar.setText("Limpiar campos");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        jLabel5.setText("ESTADO:");

        jLabel6.setText("ID PROYECTO:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(radioButtonCrear)))
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(buttonLimpiar)
                        .addGap(32, 32, 32)
                        .addComponent(buttonModificar)
                        .addGap(45, 45, 45)
                        .addComponent(buttonCrear))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBoxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(130, 130, 130)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioButtonCrear)
                                    .addComponent(radioButtonModificar))
                                .addGap(44, 44, 44))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(btnBuscar)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonModificar)
                    .addComponent(buttonLimpiar)
                    .addComponent(buttonCrear)
                    .addComponent(buttonSalir))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        dispose();        
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void radioButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCrearActionPerformed
        desactivar();
        textFieldNombre.setEnabled(true);
        jdcFechaCreacion.setEnabled(true);
        textFieldDescripcion.setEnabled(true);
        buttonCrear.setEnabled(true);
        limpiar();
    }//GEN-LAST:event_radioButtonCrearActionPerformed

    private void radioButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonModificarActionPerformed
        desactivar();
        textFieldID.setEnabled(true);
        btnBuscar.setEnabled(true);
        limpiar();
    }//GEN-LAST:event_radioButtonModificarActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        limpiar();        
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void buttonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearActionPerformed
        
        Proyecto pr = new Proyecto();
        ProyectoData pd = new ProyectoData();
        
        try {            
            
            if(textFieldNombre.getText().equals("") || textFieldID.getText().matches("[0-9]+")){
                textFieldNombre.requestFocus();
                throw new Exception("Por favor, ingrese un nombre.");
            }
            
            if(jdcFechaCreacion.getDate() == null){
                jdcFechaCreacion.requestFocus();
                throw new Exception("Por favor, ingrese una fecha.");
            }
            
            if(textFieldDescripcion.getText().equals("")){
                textFieldDescripcion.requestFocus();
                throw new Exception("Por favor, ingrese una descripción.");
            } 
            
            pr.setNombre(textFieldNombre.getText());
            pr.setDescripcion(textFieldDescripcion.getText());
            pr.setFechaInicio(jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());//SETEAR FECHA
            pr.setEstado(2);
            pd.guardarProyecto(pr);
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_buttonCrearActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        
        Proyecto pr = new Proyecto();
        ProyectoData pd = new ProyectoData();
        
        try {
           
            if(textFieldID.getText().equals("") || validar(textFieldID.getText())){
                textFieldID.requestFocus();
                throw new Exception("Por favor, ingrese un ID valido.");
            }
            
            if(textFieldNombre.getText().equals("")){
                textFieldNombre.requestFocus();
                throw new Exception("Por favor, ingrese un nombre.");
            }
            
            if(jdcFechaCreacion.getDate() == null){
                jdcFechaCreacion.requestFocus();
                throw new Exception("Por favor, ingrese una fecha.");
            }
            
            if(textFieldDescripcion.getText().equals("")){
                textFieldDescripcion.requestFocus();
                throw new Exception("Por favor, ingrese una descripción.");
            }
            
            pr.setIdProyecto(Integer.parseInt(textFieldID.getText()));
            pr.setNombre(textFieldNombre.getText());
            pr.setFechaInicio(jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            pr.setDescripcion(textFieldDescripcion.getText());
            
            EquipoData ed = new EquipoData();
            
            if(!ed.buscarEquipoProyecto(Integer.parseInt(textFieldID.getText())).isEmpty()){
               pr.setEstado(comboBoxEstado.getSelectedIndex()); 
            }else{
                
                if(comboBoxEstado.getSelectedIndex() == 0){
                    pr.setEstado(2);
                }else{
                    pr.setEstado(3);
                }
            }
            pd.modificarProyecto(pr);
            
            if(pr.getEstado() == 0){
                
                List<Equipo> equipos = ed.buscarEquipoProyecto(pr.getIdProyecto());
                List<EquiposMiembros> emFiltrados = new ArrayList();
                List<Tarea> tareas = new ArrayList();
                EquipoMiembrosData emd = new EquipoMiembrosData();
                TareaData td = new TareaData();
                
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
                    Tarea auxTarea = t;
                    auxTarea.setEstado(0);
                    td.modificarTarea(auxTarea);
                }
                
            }
            
            desactivar();
            textFieldID.setEnabled(true);
            btnBuscar.setEnabled(true);
            limpiar();
            textFieldID.requestFocus();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ProyectoData pd = new ProyectoData();

        try {
            
           if(textFieldID.getText().equals("") || validar(textFieldID.getText())){
               throw new Exception("Por favor, ingrese un id valido");
           }
            
            Proyecto proyecto = pd.buscarProyecto(Integer.parseInt(textFieldID.getText()));
            
            if (proyecto != null) {
                desactivar();
                textFieldNombre.setEnabled(true);
                jdcFechaCreacion.setEnabled(true);
                textFieldDescripcion.setEnabled(true);
                comboBoxEstado.setEnabled(true);
                buttonModificar.setEnabled(true);

                textFieldNombre.setText(proyecto.getNombre());
                jdcFechaCreacion.setDate(Date.from(proyecto.getFechaInicio().atStartOfDay(ZoneId.systemDefault()).toInstant()));
                textFieldDescripcion.setText(proyecto.getDescripcion());

                EquipoData ed = new EquipoData();
                List<Equipo> lista = ed.buscarEquipoProyecto(Integer.parseInt(textFieldID.getText()));

                if(lista.isEmpty()){
                    llenarComboBox(true);
                    if(proyecto.getEstado() == 2){
                        comboBoxEstado.setSelectedIndex(0);
                    }else{
                        comboBoxEstado.setSelectedIndex(1);
                    }

                }else{
                    llenarComboBox(false);
                   comboBoxEstado.setSelectedIndex(proyecto.getEstado()); 
                }
            
            
            }else{
                textFieldID.requestFocus();
                textFieldID.setText("");
            }
            
        } catch (Exception e) {
            System.out.println("catch");
            JOptionPane.showMessageDialog(this, e.getMessage());
            limpiar();
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private void limpiar (){
        textFieldID.setText("");
        textFieldNombre.setText("");
        textFieldDescripcion.setText("");
        comboBoxEstado.removeAllItems();
        jdcFechaCreacion.setCalendar(null);
    }
    
    private void desactivar (){
        textFieldID.setEnabled(false);
        textFieldNombre.setEnabled(false);
        jdcFechaCreacion.setEnabled(false);
        textFieldDescripcion.setEnabled(false);
        comboBoxEstado.setEnabled(false);
        btnBuscar.setEnabled(false);
        buttonCrear.setEnabled(false);
        buttonModificar.setEnabled(false);
    }
    
    private void llenarComboBox(boolean nulo){
        
        comboBoxEstado.removeAllItems();
        
        if(radioButtonModificar.isSelected() && nulo == false){
            
            comboBoxEstado.addItem("Completado");
            comboBoxEstado.addItem("En progreso");
            comboBoxEstado.addItem("Pausado");
            comboBoxEstado.addItem("Eliminado");
            
        }else if(radioButtonModificar.isSelected() && nulo == true){
            comboBoxEstado.addItem("Pausado");
            comboBoxEstado.addItem("Eliminado");
        }
    }
    
    private boolean validar(String texto){
        char prueba[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        boolean check;
        for(int i = 0; i < texto.length(); i++){
            
            check = true;
            
            for(char a: prueba){
                
                if(texto.charAt(i) == a){
                    check = false;
                }
                    
            }
            
            if(check){
                
                return true;
                
            }
            
        }
        
        return false;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGroupCrearProyecto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton buttonCrear;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JDateChooser jdcFechaCreacion;
    private javax.swing.JRadioButton radioButtonCrear;
    private javax.swing.JRadioButton radioButtonModificar;
    private javax.swing.JTextField textFieldDescripcion;
    private javax.swing.JTextField textFieldID;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
}
