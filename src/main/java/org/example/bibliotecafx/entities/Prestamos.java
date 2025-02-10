package org.example.bibliotecafx.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity

public class Prestamos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int socioPrestamo;
    private int libroPrestamo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Prestamos(int socioPrestamo, int libroPrestamo, LocalDate fechaInicio, LocalDate fechaFin) {
        this.socioPrestamo = socioPrestamo;
        this.libroPrestamo = libroPrestamo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Prestamos() {}

    public int getId() {
        return id;
    }

    public int getSocioPrestamo() {
        return socioPrestamo;
    }

    public void setSocioPrestamo(int socioPrestamo) {
        this.socioPrestamo = socioPrestamo;
    }

    public int getLibroPrestamo() {
        return libroPrestamo;
    }

    public void setLibroPrestamo(int libroPrestamo) {
        this.libroPrestamo = libroPrestamo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Prestamos{" +
                "socioPrestamo=" + socioPrestamo +
                ", libroPrestamo=" + libroPrestamo +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
