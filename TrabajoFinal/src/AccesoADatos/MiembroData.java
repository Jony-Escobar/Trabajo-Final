package AccesoADatos;

import java.sql.Connection;
import Modelo.Miembro;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Modelo.Proyecto;

public class MiembroData {
    
    private Connection con = null;
    
    public MiembroData(){
    con = Conexion.getConexion();
    }
    
    public void guardarMiembro(Miembro miembro){
     String sql="INSERT INTO miembro (dni, apellido, nombre, estado) VALUES (?, ?, ?, ?)";
 
     try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, miembro.getDni());
            ps.setString(2, miembro.getApellido());
            ps.setString(3, miembro.getNombre());
            ps.setInt(4, miembro.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                miembro.setIdMiembro(rs.getInt("idMiembro"));
                JOptionPane.showMessageDialog(null, "Nuevo miembro añadido con exito.");
            } 
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Miembro"+ex.getMessage());
        }
  } 
    
    

  public Miembro buscarMiembro(int idMiembro){
   String sql= "SELECT * FROM miembro WHERE idMiembro= ?";
   PreparedStatement ps= null;
   Miembro miembro= null;
   try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,idMiembro);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                miembro=new Miembro();
                miembro.setIdMiembro(rs.getInt("idMiembro"));
                miembro.setDni(rs.getInt("dni"));
                miembro.setApellido(rs.getString("apellido"));
                miembro.setNombre(rs.getString("nombre"));
                miembro.setEstado(rs.getInt("estado"));
                } 
            else {
                JOptionPane.showMessageDialog(null, "No existe ese miembro");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Miembro "+ex.getMessage());
        }

        return miembro;
                
  }
  
  public Miembro buscarMiembroDNI(int dni){
   String sql= "SELECT * FROM miembro WHERE dni= ?";
   PreparedStatement ps= null;
   Miembro miembro= null;
   try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                miembro=new Miembro();
                miembro.setIdMiembro(rs.getInt("idMiembro"));
                miembro.setDni(rs.getInt("dni"));
                miembro.setApellido(rs.getString("apellido"));
                miembro.setNombre(rs.getString("nombre"));
                miembro.setEstado(rs.getInt("estado"));
                } 
            else {
                JOptionPane.showMessageDialog(null, "No existe ese miembro");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Miembro "+ex.getMessage());
        }

        return miembro;
                
  }
  
  public boolean modificarMiembro(Miembro miembro) {
        //"UPDATE `miembro` SET `idMiembro`= ?, `dni`=?,`apellido`=? ,`nombre`=? ,`estado`=? WHERE idMiembro=?;";
        String sql = "UPDATE `miembro` SET `dni`=?,`apellido`=? ,`nombre`=? ,`estado`=? WHERE idMiembro=?;";
        PreparedStatement ps = null;
        int exito;
        boolean modificado= false;
        try {
            ps = con.prepareStatement(sql);
            //ps.setInt(1, miembro.getIdMiembro());
            ps.setInt(1, miembro.getDni());
            ps.setString(2, miembro.getApellido());
            ps.setString(3, miembro.getNombre());
            ps.setInt(4, miembro.getEstado());
            ps.setInt(5, miembro.getIdMiembro());
            exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Miembro modificado exitosamente.");
               modificado= true;
                return modificado;
            } else {
                JOptionPane.showMessageDialog(null, "El Miembro no existe");
               modificado= false;
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla miembro");
        }
        return modificado;
        
    }
  
  public void eliminarMiembro(int idMiembro){
    try {
            String sql = "UPDATE miembro SET estado = 0 WHERE idMiembro = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMiembro);
            int fila=ps.executeUpdate();
          
            if(fila==1){
                JOptionPane.showMessageDialog(null, " Se elimino el miembro.");
            }
              ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Miembro");
        }
  }
  
  public void activarMiembro(int idMiembro) {

        try {
            String sql = "UPDATE miembro SET estado = 1 WHERE idMiembro = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMiembro);
            int fila=ps.executeUpdate();
            if(fila==1){
                JOptionPane.showMessageDialog(null, " Se activo el miembro.");
            }
        ps.close();    

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Miembro");
        }
    }
  
  
    
    
}
