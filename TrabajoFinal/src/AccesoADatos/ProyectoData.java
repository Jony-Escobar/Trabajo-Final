package AccesoADatos;


import java.sql.Connection;
import Modelo.Proyecto;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Modelo.Proyecto;
import java.util.ArrayList;
import java.util.List;


public class ProyectoData {
  private Connection con = null;

  public ProyectoData() {
      con = Conexion.getConexion();
    }
   
  public void guardarProyecto(Proyecto proyecto){
     String sql="INSERT INTO proyecto (nombre, descripcion, fechaInicio, estado) VALUES (?, ?, ?, ?)";
 
     try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proyecto.getNombre());
            ps.setString(2, proyecto.getDescripcion());
            ps.setDate(3, Date.valueOf(proyecto.getFechaInicio()));//localDate a Date
            ps.setInt(4, proyecto.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                //proyecto.setIdProyecto(rs.getInt("idProyecto"));
                JOptionPane.showMessageDialog(null, "Proyecto añadido con exito.");
            } 
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proyecto"+ex.getMessage());
        }
  } 

  public Proyecto buscarProyecto(int idProyecto){
   String sql= "SELECT * FROM proyecto WHERE idProyecto= ?";
   PreparedStatement ps= null;
   Proyecto proyecto= null;
   try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,idProyecto);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                proyecto=new Proyecto();
                proyecto.setIdProyecto(rs.getInt("idProyecto"));
                proyecto.setNombre(rs.getString("nombre"));
                proyecto.setDescripcion(rs.getString("descripcion"));
                proyecto.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                proyecto.setEstado(rs.getInt("estado"));
                ps.close();
                } 
            else {
                JOptionPane.showMessageDialog(null, "No existe ese proyecto");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proyecto "+ex.getMessage());
        }

        return proyecto;
                
  }
  
  public List<Proyecto> listarProyectos() {

        List<Proyecto> proyectos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM proyecto";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proyecto proy = new Proyecto();

                proy.setIdProyecto(rs.getInt("idProyecto"));
                proy.setNombre(rs.getString("nombre"));
                proy.setDescripcion(rs.getString("descripcion"));
                proy.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                proy.setEstado(rs.getBoolean("estado"));
                proyectos.add(proy);
            }
            ps.close();
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la Tabla Proyecto "+ex.getMessage());
        }
        return proyectos;
    }
  
  public void eliminarProyecto(int idProyecto){
    try {
            String sql = "UPDATE proyecto SET estado = 0 WHERE idProyecto = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProyecto);
            int fila=ps.executeUpdate();
          
            if(fila==1){
                JOptionPane.showMessageDialog(null, " Se elimino el proyecto.");
            }
              ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Proyecto");
        }
  }
  
  public void activarProyecto(int idProyecto) {

        try {
            String sql = "UPDATE proyecto SET estado = 1 WHERE idProyecto = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProyecto);
            int fila=ps.executeUpdate();
            if(fila==1){
                JOptionPane.showMessageDialog(null, " Se activo el proyecto.");
            }
            ps.close();    
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Proyecto");
        }
    }
  
  public void modificarProyecto(Proyecto proyecto) {

        String sql = "UPDATE proyecto SET idProyecto = ? , nombre = ?, descripcion = ?, fechaInicio = ?, estado = ? WHERE  idProyecto = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, proyecto.getIdProyecto());
            ps.setString(2, proyecto.getNombre());
            ps.setString(3, proyecto.getDescripcion());
            ps.setDate(4, Date.valueOf(proyecto.getFechaInicio()));
<<<<<<< HEAD
            ps.setBoolean(5, proyecto.getEstado());
            ps.setInt(6, proyecto.getIdProyecto());
=======
            ps.setInt(5, proyecto.getEstado());
>>>>>>> parent of 633bb72 (Actualizando vistaProyecto)
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proyecto modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El proyecto no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proyecto");
        }
        
    }
  
}