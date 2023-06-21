package AccesoADatos;

import Modelo.Equipo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EquipoData {
    private Connection con = null;
    Equipo equipo= null;
    

    public EquipoData() {
      con = Conexion.getConexion();
    }
    
    
public void guardarEquipo(Equipo equipo){
    
        try {
            
            String sql = "INSERT INTO equipo (idProyecto, nombre, fechaCreacion, estado) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, equipo.getProyecto().getIdProyecto());
            ps.setString(2, equipo.getNombre());
            ps.setDate(3, Date.valueOf(equipo.getFechaCreacion()));//localDate a Date
            ps.setInt(4, equipo.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                equipo.setIdEquipo(rs.getInt("idEquipo"));
                JOptionPane.showMessageDialog(null, "Equipo añadido con exito.");
            } 
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Equipo "+ex.getMessage());
        }
}

public boolean modificarEquipo(Equipo equipo){
 String sql= "UPDATE `equipo` SET `nombre`=?,`fechaCreacion`=?,`estado`=? WHERE idEquipo=?";
 PreparedStatement ps = null;
        int exito;
        boolean modificado= false;
        try {
            ps = con.prepareStatement(sql);
            //ps.setInt(1, miembro.getIdMiembro());
            ps.setString(1, equipo.getNombre());
            ps.setDate(2, Date.valueOf(equipo.getFechaCreacion()));
            ps.setInt(3, equipo.getEstado());
            ps.setInt(4, equipo.getIdEquipo());
            //ps.setInt(5, miembro.getIdMiembro());
            exito = ps.executeUpdate();
            
            if (exito == 1) {
              // JOptionPane.showMessageDialog(null, "Equipo modificado exitosamente.");
               modificado= true;
               return modificado;
            } else {
               JOptionPane.showMessageDialog(null, "No se encontró el Equipo");
               modificado= false;
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Equipo");
        }
        return modificado;
        
    }

public Equipo buscarEquipo(int idEquipo){
  
    String sql= "SELECT * FROM equipo WHERE idEquipo=?";
    PreparedStatement ps= null;
    Equipo equipo= null;
    try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,idEquipo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                equipo= new Equipo();
                equipo.setIdEquipo(rs.getInt("idEquipo"));
                //equipo.setIdProyecto(rs.getInt("idProyecto"));
                ProyectoData pd = new ProyectoData();
                equipo.setProyecto(pd.buscarProyecto(rs.getInt("idProyecto")));
                equipo.setNombre(rs.getString("nombre"));
                equipo.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());
                equipo.setEstado(rs.getInt("estado"));
                } 
            else {
                JOptionPane.showMessageDialog(null, "No existe ese equipo");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Equipo "+ex.getMessage());
        }

        return equipo;
    
  
}

public Equipo buscarEquipoProyecto(int idProyecto){
  
    String sql= "SELECT * FROM equipo WHERE idProyecto=? && estado=1";
    PreparedStatement ps= null;
    //Equipo equipo= null;
    try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,idProyecto);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                equipo= new Equipo();
                equipo.setIdEquipo(rs.getInt("idEquipo"));
                //equipo.setIdProyecto(rs.getInt("idProyecto"));
                //ProyectoData pd = new ProyectoData();
                //equipo. //(pd.buscarProyecto(rs.getInt("idProyecto")));
                equipo.setNombre(rs.getString("nombre"));
                equipo.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());
                equipo.setEstado(rs.getInt("estado"));
                                                
                } 
            else {
                JOptionPane.showMessageDialog(null, "No existe ese equipo");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Equipo "+ex.getMessage());
        }

        return equipo;
    
  
}

public void eliminarEquipo(int idEquipo){
  try{
    String sql = "UPDATE equipo SET estado = 0 WHERE idEquipo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEquipo);
            int fila=ps.executeUpdate();
          
            if(fila==1){
                JOptionPane.showMessageDialog(null, " Se elimino el equipo.");
            }
              ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Equipo");
        }

}

public void activarEquipo(int idEquipo) {

        try {
            String sql = "UPDATE equipo SET estado = 1 WHERE idEquipo = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEquipo);
            int fila=ps.executeUpdate();
            if(fila==1){
                JOptionPane.showMessageDialog(null, " Se activo el equipo.");
            }
        ps.close();    

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Equipo");
        }
    }

public List<Equipo> recuperarEquipos(){
  List<Equipo> equipos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM equipo WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Equipo equipo = new Equipo();

                equipo.setIdEquipo(rs.getInt("idEquipo"));
                //equipo.setIdProyecto(rs.getInt("idProyecto"));
                ProyectoData pd = new ProyectoData();
                equipo.setProyecto(pd.buscarProyecto(rs.getInt("idProyecto")));
                equipo.setNombre(rs.getString("nombre"));
                equipo.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());
                equipo.setEstado(rs.getInt("estado"));
                equipos.add(equipo);
            }
            ps.close();
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Equipo "+ex.getMessage());
        }
        return equipos;
}


}