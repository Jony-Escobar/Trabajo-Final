package AccesoADatos;

import Modelo.Miembro;
import Modelo.Proyecto;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Prueba {

    public static void main(String[] args) {
        
        //Crear proyectos: Los usuarios podrán crear nuevos proyectos especificando un nombre, una descripción y una fecha de inicio.        
            Proyecto proyecto = new Proyecto("Desarrollo","Gestion de Stock",LocalDate.now(),1);
            ProyectoData proyData = new ProyectoData();
            proyData.guardarProyecto(proyecto);
            
            Miembro a= new Miembro(33500400,"Dominguez","Nicolas",1);
            MiembroData mdata= new MiembroData();
            mdata.guardarMiembro(a);
            JOptionPane.showMessageDialog(null, a.toString());
        //Asignar tareas: Los usuarios podrán asignar tareas a diferentes miembros del equipo para cada proyecto. Cada tarea debe estar asociada a un proyecto y a un miembro del equipo.
            
        //Actualizar estado de las tareas: Los usuarios podrán marcar las tareas como completadas o en progreso, así como cambiar su estado a pendiente.
            
        //Registrar avances en las tareas: Los usuarios podrán registrar el progreso de las tareas, incluyendo comentarios y fechas de avance.
            
        //Consultar proyectos y tareas: Los usuarios podrán ver la lista de proyectos y sus respectivas tareas, así como filtrar las tareas por estado y miembro del equipo.
            Proyecto buscado = proyData.buscarProyecto(1);
            buscado.toString();
            JOptionPane.showMessageDialog(null, buscado.toString());
        //Consultar información del equipo: Los usuarios podrán ver la lista de miembros del equipo y obtener información detallada de cada miembro, como su nombre y rol.
        
        
            
    }
    
}
