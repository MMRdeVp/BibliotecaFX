package org.example.bibliotecafx.DAO;

import org.example.bibliotecafx.entities.Autor;

import java.util.List;

public interface AutorDAO_IMP {

    void AnyadirAutor(String nombre, String nacionalidad);
    void ModificarAutor(Autor autor, Autor autorMod);
    void EliminarAutor(Autor Autor);
    List<Autor> BuscarAutorPorNombre(String Nombre);
    List<Autor> ListarAutores();

}
