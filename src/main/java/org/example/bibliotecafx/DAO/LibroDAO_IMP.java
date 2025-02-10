package org.example.bibliotecafx.DAO;

import org.example.bibliotecafx.entities.Autor;
import org.example.bibliotecafx.entities.Libro;

import java.util.List;

public interface LibroDAO_IMP {

    void AnyadirLibro(String titulo, int ISBN, int IDAutor, String editorial,int anyoPublicacion);
    void ModificarLibro(Libro Libro, Libro libro);
    void EliminarLibro(Libro Libro);
    List<Libro> BuscarLibroPorTitulo(String Titulo);
    List<Libro> BuscarLibroPorAutor(int IDautor);
    List<Libro> BuscarLibroPorISBN(String ISBN);
    List<Libro> ListarLibrosNoPrestados();

}
