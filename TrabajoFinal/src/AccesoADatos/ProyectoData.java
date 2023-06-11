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
                proyecto.setIdProyecto(rs.getInt("idProyecto"));
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
                } 
            else {
                JOptionPane.showMessageDialog(null, "No existe ese proyecto");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proyecto "+ex.getMessage());
        }

        return proyecto;
                
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
  
  
}

/*
Alumno alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM alumno WHERE dni=? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,dni );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno=new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getInt("estado"));
            
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }

        return alumno;
    }
*/
