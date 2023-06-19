package Modelo;

import java.time.LocalDate;

public class EquiposMiembros {
  
    private int idMiembroEq;
    private LocalDate fechaIncorporacion;
    private Equipo equipo;
    private Miembro miembro;
    private String rol;

    public EquiposMiembros() {
    }

    public EquiposMiembros(LocalDate fechaIncorporacion, Equipo equipo, Miembro miembro, String rol) {
        this.fechaIncorporacion = fechaIncorporacion;
        this.equipo = equipo;
        this.miembro = miembro;
        this.rol= rol;
    }

       
    public EquiposMiembros(int idMiembroEq, LocalDate fechaIncorporacion, Equipo equipo, Miembro miembro, String rol) {
        this.idMiembroEq = idMiembroEq;
        this.fechaIncorporacion = fechaIncorporacion;
        this.equipo = equipo;
        this.miembro = miembro;
        this.rol = rol;
    }

    public int getIdMiembroEq() {
        return idMiembroEq;
    }

    public void setIdMiembroEq(int idMiembroEq) {
        this.idMiembroEq = idMiembroEq;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }
    
    

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "EquiposMiembros{" + "idMiembroEq=" + idMiembroEq + ", fechaIncorporacion=" + fechaIncorporacion + ", equipo=" + equipo + ", miembro=" + miembro + ", rol=" + rol + '}';
    }

    
    
    
    

    
}
