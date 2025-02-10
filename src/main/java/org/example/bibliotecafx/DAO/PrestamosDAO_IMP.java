package org.example.bibliotecafx.DAO;

import org.example.bibliotecafx.entities.Libro;
import org.example.bibliotecafx.entities.Prestamos;
import org.example.bibliotecafx.entities.Socio;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface PrestamosDAO_IMP {

    void RegistrarPrestamo(int IDSocio, int IDLibro, LocalDate FechaInicio, LocalDate FechaDevolucion);
    List<Prestamos> ListarPrestamos();
    List<Prestamos> ListarPrestamosPorSocio(int IDSocio);

}
