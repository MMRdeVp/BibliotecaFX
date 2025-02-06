package org.example.bibliotecafx.DAO;

public interface AutorDAO_IMP {

    void AnyadirAutor(String nombre, String nacionalidad);
    void ModificarAutor(int IDAutor);
    void EliminarAutor(int IDAutor);
    void BuscarAutorPorNombre(String Nombre);
    void ListarAutores();

}
