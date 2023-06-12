package AccesoADatos;

import Modelo.Miembro;
import Modelo.Proyecto;
import Modelo.Equipo;

import java.sql.Connection;
import java.time.LocalDate;
import Modelo.Proyecto;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;

public class Prueba {

    public static void main(String[] args) {
        Connection c = null;
        c= Conexion.getConexion();
        LocalDate fecha= LocalDate.of(2022,10,30);
        
        EquipoData equiData= new EquipoData();
        //Equipo equipo= new Equipo(1,"Testing",fecha,1);
        //equiData.guardarEquipo(equipo);
        List<Equipo> listaEquipos= equiData.recuperarEquipos();
        for(Equipo e: listaEquipos){
            System.out.println(e.toString());
        }
        
        
        //LocalDate fecha= LocalDate.of(2023,06,10);
        Proyecto proyecto= new Proyecto("Sistema Alumnos","SIU Guarani",fecha,1);
        ProyectoData proyData = new ProyectoData();
        proyData.guardarProyecto(proyecto);
        //Proyecto buscado= proyData.buscarProyecto(1);
        //buscado.toString();
        //Component cmpnt = null;
        //JOptionPane.showMessageDialog(cmpnt, buscado.toString());
        Miembro a= new Miembro(33500400,"Dominguez","Nicolas",1);
        MiembroData mdata= new MiembroData();
        mdata.guardarMiembro(a);
        JOptionPane.showMessageDialog(cmpnt, a.toString());
    }
    
}
