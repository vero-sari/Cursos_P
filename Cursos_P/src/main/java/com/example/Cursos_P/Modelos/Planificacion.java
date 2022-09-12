package com.example.Cursos_P.Modelos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "planificacion")
public class Planificacion {
    @Id
    @Column(length = 50, nullable = false, unique = true)
    private String id;
    private String nombre_curso;
    private String docente;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String horario;
    private String estado;
    private String documento;

    
    public Planificacion(String id) {
        this.id = id;
    }
    public Planificacion(String id, String nombre_curso, String docente, Date fecha_inicio, Date fecha_fin,
            String horario, String estado, String documento) {
        this.id = id;
        this.nombre_curso = nombre_curso;
        this.docente = docente;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.horario = horario;
        this.estado = estado;
        this.documento = documento;
    }
    public Planificacion() {
    }
    public String getId() {
        return id;
    }
    public void setId(String  id) {
        this.id = id;
    }
    public String getNombre_curso() {
        return nombre_curso;
    }
    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }
    public String getDocente() {
        return docente;
    }
    public void setDocente(String docente) {
        this.docente = docente;
    }
    public Date getFecha_inicio() {
        return fecha_inicio;
    }
    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    public Date getFecha_fin() {
        return fecha_fin;
    }
    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }  

    
}
