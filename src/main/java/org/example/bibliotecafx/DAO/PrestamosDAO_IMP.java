package org.example.bibliotecafx.DAO;

import java.time.LocalDate;
import java.util.Date;

public interface PrestamosDAO_IMP {

    void RegistrarPrestamo(int IDSocio, int IDLibro, LocalDate FechaInicio, LocalDate FechaDevolucion);
    void ListarPrestamos();
    void ListarPrestamosPorSocio(int IDSocio);

}
