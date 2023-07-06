
package AccesoADatos;

import Modelo.Equipo;
import Modelo.EquiposMiembros;
import Modelo.Miembro;
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
                
                //equipomiembros.setIdMiembroEq(rs.getInt("idMiembroEq"));
                JOptionPane.showMessageDialog(null, "Miembro añadido al equipo con exito.");
                
            } 
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla equipomiembros"+ex.getMessage());
        }
    }
    
    public void actualizarEquipoMiembro(EquiposMiembros equipomiembros){
     String sql= "UPDATE `equipomiembros` SET `rol`=? WHERE idMiembroEq=?";
     try{
       PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
       ps.setString(1, equipomiembros.getRol());
       ps.setInt(2, equipomiembros.getIdMiembroEq());
       ps.executeUpdate();
       ResultSet rs= ps.getGeneratedKeys();
       if(rs.next()){
        JOptionPane.showMessageDialog(null, "Miembro de equipo modificado con exito.");
       }
       ps.close();
     }
     catch (SQLException ex) {
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
                    //equiposmiembros.setIdEquipo(rs.getInt("idEquipo"));
                    //equiposmiembros.setIdMiembro(rs.getInt("idMiembro"));
                    EquipoData ed = new EquipoData();
                    MiembroData md = new MiembroData();
                    equiposmiembros.setEquipo(ed.buscarEquipo(rs.getInt("idMiembroEq")));
                    equiposmiembros.setMiembro(md.buscarMiembro(rs.getInt("idMiembro")));
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
    
    public List<Miembro> miembrosDelEquipo(int idEquipo){
    List<Miembro> pertenecenAlEquipo= new ArrayList();
    Equipo equipo= new Equipo();
    PreparedStatement ps= null;
    
      try{
          //String sql="SELECT miembro.idMiembro, miembro.dni, miembro.apellido, miembro.nombre FROM `equipomiembros` JOIN miembro ON(miembro.idMiembro=equipomiembros.idMiembro) WHERE equipomiembros.idEquipo=?";
          String sql="SELECT miembro.* FROM `equipomiembros` JOIN miembro ON(miembro.idMiembro=equipomiembros.idMiembro) WHERE equipomiembros.idEquipo=?";
          ps= con.prepareStatement(sql);
                ps.setInt(1, idEquipo);
                ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Miembro miembro= new Miembro();
                miembro.setIdMiembro(rs.getInt("idMiembro"));
                miembro.setDni(rs.getInt("dni"));
                miembro.setApellido(rs.getString("apellido"));
                miembro.setNombre(rs.getString("nombre"));
                pertenecenAlEquipo.add(miembro);
            }
            ps.close();
      }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla equipoMiembros "+ex.getMessage());
        }
     return pertenecenAlEquipo;
    }
    
    public List<Miembro> noPerteneceAEquipo(int idEquipo){
        List<Miembro> listaMiembros= new ArrayList();
        
        Equipo equipo= new Equipo();
        PreparedStatement ps= null;
        
            try{
                String sql="SELECT * FROM miembro WHERE idMiembro NOT IN( SELECT equipomiembros.idMiembro FROM `equipomiembros` JOIN miembro ON equipomiembros.idMiembro=miembro.idMiembro WHERE equipomiembros.idEquipo=? AND miembro.estado=1)";
                ps = con.prepareStatement(sql);
                ps.setInt(1, idEquipo);
                ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Miembro miembro= new Miembro();
                miembro.setIdMiembro(rs.getInt("idMiembro"));
                miembro.setDni(rs.getInt("dni"));
                miembro.setApellido(rs.getString("apellido"));
                miembro.setNombre(rs.getString("nombre"));
                listaMiembros.add(miembro);
                
                //EquiposMiembros EM = new EquiposMiembros();
                //EM.setIdMiembroEq(rs.getInt("idMiembroEq"));
                //EM.setFechaIncorporacion(rs.getDate("fechaIncorporacion").toLocalDate());
                //EM.setIdEquipo(rs.getInt("idEquipo"));
                //EM.setIdMiembro(rs.getInt("idMiembro"));
                //EquipoData ed = new EquipoData();
                //MiembroData md = new MiembroData();
                //EM.setEquipo(ed.buscarEquipo(rs.getInt("idMiembroEq")));
                //EM.setMiembro(md.buscarMiembro(rs.getInt("idMiembro")));
                //EM.setRol(rs.getString("rol"));
                //equiposmiembros.add(EM);
                
            }
            ps.close();
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla equipoMiembros "+ex.getMessage());
        }
        return listaMiembros;
          
    }
    
    public EquiposMiembros EquipoMiembro(int idEquipo, int idMiembro) {

        EquiposMiembros equipomiembro = new EquiposMiembros();
        PreparedStatement ps= null;
        EquiposMiembros EM = new EquiposMiembros();
        try {
           
            String sql = "SELECT * FROM equipoMiembros WHERE idEquipo = ? AND idMiembro=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idEquipo);
            ps.setInt(2, idMiembro);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {  //while
                EM.setIdMiembroEq(rs.getInt("idMiembroEq"));
                EM.setFechaIncorporacion(rs.getDate("fechaIncorporacion").toLocalDate());
                //EM.setIdEquipo(rs.getInt("idEquipo"));
                //EM.setIdMiembro(rs.getInt("idMiembro"));
                EquipoData ed = new EquipoData();
                MiembroData md = new MiembroData();
                EM.setEquipo(ed.buscarEquipo(rs.getInt("idEquipo"))); //("idMiembroEq")
                EM.setMiembro(md.buscarMiembro(rs.getInt("idMiembro")));
                EM.setRol(rs.getString("rol"));
                //equiposmiembros.add(EM);
                
            }
            ps.close();
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla equipoMiembros "+ex.getMessage());
        }
        return EM;
    
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
                //EM.setIdEquipo(rs.getInt("idEquipo"));
                //EM.setIdMiembro(rs.getInt("idMiembro"));
                EquipoData ed = new EquipoData();
                MiembroData md = new MiembroData();
                EM.setEquipo(ed.buscarEquipo(rs.getInt("idMiembroEq")));
                EM.setMiembro(md.buscarMiembro(rs.getInt("idMiembro")));
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
