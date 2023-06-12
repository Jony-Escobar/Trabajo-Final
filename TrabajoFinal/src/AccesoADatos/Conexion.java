package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


    
public class Conexion {
  ///////////////////////////////// "jdbc:mysql://localhost:3306/"
    private static final String URL="mariadb:mysql://localhost:3306/";
    private static final String DB="empresa";
    private static final String USUARIO="root";
    private static final String PASSWORD="";

    private static Connection connection;
   
    
    //Metodo constructor
   
    public Conexion(){}
    
    
public static Connection getConexion() {
               
        if (connection == null) {
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection= DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD con el nuevo driver " + ex);
            }catch(ClassNotFoundException ex){
                
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers " + ex);
            }
        }
        return connection;
    }

    
}

    



