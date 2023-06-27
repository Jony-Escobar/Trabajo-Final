package AccesoADatos;

import Modelo.Tarea;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TareaData {

    private Connection con = null;

    public TareaData() {
      con = Conexion.getConexion();
    }    
    
public void guardarTarea(Tarea tarea){
    
   String sql = "INSERT INTO tarea (nombre, fechaCreacion, fechaCierre, estado, idMiembroEq) VALUES (?, ?, ?, ?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, tarea.getNombre());
            ps.setDate(2, Date.valueOf(tarea.getFechaCreacion()));//localDate a Date
            ps.setDate(3,  Date.valueOf(tarea.getFechaCierre()));
            ps.setInt(4, tarea.getEstado());
            ps.setInt(5, tarea.getMiembroEq().getIdMiembroEq());
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
    
public List<Tarea> listarTareasPorMiembroEquipo(int idMiembroEq) {
    List<Tarea> tareas = new ArrayList<>();

    String sql = "SELECT * FROM tarea WHERE idMiembroEq = ?";
    try (
        PreparedStatement statement = con.prepareStatement(sql)) {
        statement.setInt(1, idMiembroEq);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            Tarea tarea = new Tarea();
            tarea.setIdTarea(resultSet.getInt("idTarea"));
            tarea.setNombre(resultSet.getString("nombre"));
            tarea.setFechaCreacion(resultSet.getDate("fechaCreacion").toLocalDate());
            tarea.setFechaCierre(resultSet.getDate("fechaCierre").toLocalDate());
            tarea.setEstado(resultSet.getInt("estado"));

            tareas.add(tarea);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return tareas;
}

}