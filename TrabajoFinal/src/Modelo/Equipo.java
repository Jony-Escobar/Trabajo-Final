package Modelo;

import java.time.LocalDate;


public class Equipo {
    
    private int idEquipo;
    private int idProyecto;
    private String nombre;
    private LocalDate fechaCreacion;
    private int estado;
    
    public Equipo(){}

    public Equipo(int idEquipo, int idProyecto, String nombre, LocalDate fechaCreacion, int estado) {
        this.idEquipo = idEquipo;
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Equipo{" + "idEquipo=" + idEquipo + ", idProyecto=" + idProyecto + ", nombre=" + nombre + ", fechaCreacion=" + fechaCreacion + ", estado=" + estado + '}';
    }
    
    
    
    
}
