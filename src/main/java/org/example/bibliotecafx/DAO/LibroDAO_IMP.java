package org.example.bibliotecafx.DAO;

public interface LibroDAO_IMP {

    void AnyadirLibro(String titulo, String ISBN, int IDAutor, String editorial,int anyoPublicacion);
    void ModificarLibro(int IDLibro);
    void EliminarLibro(int IDLibro);
    void BuscarLibroPorTitulo(String Titulo);
    void BuscarLibroPorAutor(int IDAutor);
    void BuscarLibroPorISBN(String ISBN);
    void ListarLibrosNoPrestados();

}
