package AccesoADatos;

import Modelo.Equipo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EquipoData {
    private Connection con = null;

    public EquipoData() {
      con = Conexion.getConexion();
    }
    
    
public void guardarEquipo(Equipo equipo){
    
   String sql = "INSERT INTO equipo (idProyecto, nombre, fechaCreacion, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, equipo.getIdProyecto());
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
    
}