package AccesoADatos;

import Modelo.Comentarios;
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

public class ComentariosData {
    //prueba
    private Connection con = null;

    public ComentariosData() {
        
        con = Conexion.getConexion();
        
    }
    
    public void guardarComentarios(Comentarios comentarios){
     String sql="INSERT INTO comentarios (comentario, fechaAvance, idTarea) VALUES (?, ?, ?)";
 
     try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, comentarios.getComentario());
            ps.setDate(2, Date.valueOf(comentarios.getFechaAvance()));
            ps.setInt(3, comentarios.getTarea().getIdTarea());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                comentarios.setIdComentario(rs.getInt("idComentario"));
                JOptionPane.showMessageDialog(null, "Comentario añadido con exito.");
            } 
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla comentarios"+ex.getMessage());
        }
    }
    
    public void eliminarComentarios(int idComentario){
        
    try {
        String sql = "DELETE FROM comentarios WHERE `comentarios`.`idComentario` = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idComentario);
        int fila=ps.executeUpdate();
          
        if(fila==1){
            JOptionPane.showMessageDialog(null, " Se elimino el comentario.");
        }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla comentarios");
        }
    }
    
    public List<Comentarios> listarComentarios(int idTarea) {
    List<Comentarios> comentarios = new ArrayList<>();

    String sql = "SELECT * FROM comentarios WHERE idTarea = ?";
    try (
        PreparedStatement statement = con.prepareStatement(sql)) {
        statement.setInt(1, idTarea);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            Comentarios c = new Comentarios();
            c.setIdComentario(resultSet.getInt("idComentario"));
            c.setComentario(resultSet.getString("comentario"));
            c.setFechaAvance(resultSet.getDate("fechaAvance").toLocalDate());
            TareaData td = new TareaData();
            Tarea t = td.BuscarTarea(idTarea);
            c.setTarea(t);
           

            comentarios.add(c);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return comentarios;
}
    
}