package Modelo;

import java.time.LocalDate;

public class Tarea {

private int idTarea;
private String nombre;
private LocalDate fechaCreacion;
private LocalDate fechaCierre;
private int estado;
private int idMiembroEq;

    public Tarea() {
    }

    public Tarea(int idTarea, String nombre, LocalDate fechaCreacion, LocalDate fechaCierre, int estado, int idMiembroEq) {
        this.idTarea = idTarea;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
        this.estado = estado;
        this.idMiembroEq = idMiembroEq;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdMiembroEq() {
        return idMiembroEq;
    }

    public void setIdMiembroEq(int idMiembroEq) {
        this.idMiembroEq = idMiembroEq;
    }

    @Override
    public String toString() {
        return "Tarea{" + "idTarea=" + idTarea + ", nombre=" + nombre + ", fechaCreacion=" + fechaCreacion + ", fechaCierre=" + fechaCierre + ", estado=" + estado + ", idMiembroEq=" + idMiembroEq + '}';
    }


    

        
    
}
