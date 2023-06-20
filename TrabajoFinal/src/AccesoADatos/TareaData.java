package AccesoADatos;

import Modelo.Tarea;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TareaData {



    private Connection con = null;

    public TareaData() {
      con = Conexion.getConexion();
    }
    
    
public void guardarTarea(Tarea tarea){
    
   String sql = "INSERT INTO tarea (id, nombre, fechaCreacion, fechaCierre, estado, idMiembroEq) VALUES (?, ?, ?, ?, ?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tarea.getIdTarea());
            ps.setString(2, tarea.getNombre());
            ps.setDate(3, Date.valueOf(tarea.getFechaCreacion()));//localDate a Date
            ps.setDate(4,  Date.valueOf(tarea.getFechaCierre()));
            ps.setInt(5, tarea.getEstado());
            ps.setInt(6, tarea.getMiembroEq().getIdMiembroEq());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                tarea.setIdTarea(rs.getInt("idTarea"));
                JOptionPane.showMessageDialog(null, "Tarea añadida exitosamente.");
            } 
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tarea "+ex.getMessage());
        }
}
    
}

