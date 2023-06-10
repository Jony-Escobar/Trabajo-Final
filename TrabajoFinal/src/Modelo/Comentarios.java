/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

public class Comentarios {
  
private int idComentario;
private String comentario;
private LocalDate fechaAvance;
private int idTarea;

    public Comentarios() {
    }

    public Comentarios(int idComentario, String comentario, LocalDate fechaAvance, int idTarea) {
        this.idComentario = idComentario;
        this.comentario = comentario;
        this.fechaAvance = fechaAvance;
        this.idTarea = idTarea;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFechaAvance() {
        return fechaAvance;
    }

    public void setFechaAvance(LocalDate fechaAvance) {
        this.fechaAvance = fechaAvance;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    @Override
    public String toString() {
        return "Comentarios{" + "idComentario=" + idComentario + ", comentario=" + comentario + ", fechaAvance=" + fechaAvance + ", idTarea=" + idTarea + '}';
    }
    
    
}
