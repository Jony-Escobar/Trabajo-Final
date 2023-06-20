
package AccesoADatos;

import Modelo.EquiposMiembros;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class EquipoMiembrosData {
    
    private Connection con= null;
    
    public EquipoMiembrosData(){
     con= Conexion.getConexion();
    }
    
    public void guardarEquipoMiembros(EquiposMiembros equipomiembros){
        
     String sql="INSERT INTO equipomiembros (fechaIncorporacion, idEquipo, idMiembro, rol) VALUES (?, ?, ?, ?)";
 
     try {
         
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(equipomiembros.getFechaIncorporacion()));
            ps.setInt(2, equipomiembros.getEquipo().getIdEquipo());
            ps.setInt(3, equipomiembros.getMiembro().getIdMiembro());
            ps.setString(4, equipomiembros.getRol());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                equipomiembros.setIdMiembroEq(rs.getInt("idMiembroEq"));
                JOptionPane.showMessageDialog(null, "Miembro añadido al equipo con exito.");
                
            } 
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla equipomiembros"+ex.getMessage());
        }
    }
    
    public void eliminarEquipoMiembros(int idMiembroEq){
        
        try {
            
                String sql = "DELETE FROM equipomiembros WHERE `equipomiembros`.`idMiembroEq` = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idMiembroEq);
                int fila=ps.executeUpdate();

                if(fila==1){
                    JOptionPane.showMessageDialog(null, " Se elimino el miembro del equipo.");
                }
                  ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, " Error al acceder a la tabla equipomiembros");
            }
    }
    
    public EquiposMiembros buscarEquipoMiembros(int idMiembroEq){
        
        String sql= "SELECT * FROM equipomiembros WHERE idMiembroEq= ?";
        PreparedStatement ps= null;
        EquiposMiembros equiposmiembros= null;
        
        try {
                ps = con.prepareStatement(sql);
                ps.setInt(1,idMiembroEq);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    
                    equiposmiembros = new EquiposMiembros();
                    equiposmiembros.setIdMiembroEq(rs.getInt("idMiembroEq"));
                    equiposmiembros.setFechaIncorporacion(rs.getDate("fechaIncorporacion").toLocalDate());
                    equiposmiembros.setIdEquipo(rs.getInt("idEquipo"));
                    equiposmiembros.setIdMiembro(rs.getInt("idMiembro"));
                    equiposmiembros.setRol(rs.getString("rol"));
                     
                }else {
                    JOptionPane.showMessageDialog(null, "No existe ese miembro en el equipo");
                }
                ps.close();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla equipomiembros "+ex.getMessage());
            }

        return equiposmiembros;
                
    }
    
    public List<EquiposMiembros> listarEquipoMiembros(int idEquipo) {

        List<EquiposMiembros> equiposmiembros = new ArrayList<>();
        PreparedStatement ps= null;
        
        try {
           
            String sql = "SELECT * FROM equipoMiembros WHERE idEquipo = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idEquipo);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                EquiposMiembros EM = new EquiposMiembros();

                EM.setIdMiembroEq(rs.getInt("idMiembroEq"));
                EM.setFechaIncorporacion(rs.getDate("fechaIncorporacion").toLocalDate());
                EM.setIdEquipo(rs.getInt("idEquipo"));
                EM.setIdMiembro(rs.getInt("idMiembro"));
                EM.setRol(rs.getString("rol"));
                equiposmiembros.add(EM);
                
            }
            ps.close();
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla equipoMiembros "+ex.getMessage());
        }
        return equiposmiembros;
    
    }
}    
