package AccesoADatos;

import Modelo.Miembro;
import Modelo.Proyecto;
import java.sql.Connection;
import java.time.LocalDate;
import Modelo.Proyecto;
import java.awt.Component;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Connection c = null;
        c= Conexion.getConexion();
        LocalDate fecha= LocalDate.of(2023,06,10);
        //Proyecto proyecto= new Proyecto("Desarrollo","Gestion de Stock",fecha,1);
        ProyectoData proyData = new ProyectoData();
        //proyData.guardarProyecto(proyecto);
        Proyecto buscado= proyData.buscarProyecto(1);
        buscado.toString();
        Component cmpnt = null;
        JOptionPane.showMessageDialog(cmpnt, buscado.toString());
        Miembro a= new Miembro(33500400,"Dominguez","Nicolas",1);
        MiembroData mdata= new MiembroData();
        mdata.guardarMiembro(a);
        JOptionPane.showMessageDialog(cmpnt, a.toString());
    }
    
}
