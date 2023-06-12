package AccesoADatos;

import Modelo.Comentarios;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ComentariosData {
    
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
            ps.setInt(3, comentarios.getIdTarea());

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
    
}