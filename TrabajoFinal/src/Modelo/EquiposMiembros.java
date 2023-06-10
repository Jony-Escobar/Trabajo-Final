/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

public class EquiposMiembros {
  
    private int idMiembroEq;
    private LocalDate fechaIncorporacion;
    private int idEquipo;
    private int idMiembro;
    private String rol;

    public EquiposMiembros() {
    }

    public EquiposMiembros(int idMiembroEq, LocalDate fechaIncorporacion, int idEquipo, int idMiembro, String rol) {
        this.idMiembroEq = idMiembroEq;
        this.fechaIncorporacion = fechaIncorporacion;
        this.idEquipo = idEquipo;
        this.idMiembro = idMiembro;
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

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(int idMiembro) {
        this.idMiembro = idMiembro;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "EquiposMiembros{" + "idMiembroEq=" + idMiembroEq + ", fechaIncorporacion=" + fechaIncorporacion + ", idEquipo=" + idEquipo + ", idMiembro=" + idMiembro + ", rol=" + rol + '}';
    }
    
    
    

    
}
