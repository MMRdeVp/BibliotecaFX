package org.example.bibliotecafx.DAO;

public interface SocioDAO_IMP {

    void AnyadirSocio(String nombre, String direccion, int telefono);
    void ModificarSocio(int IDSocio);
    void EliminarSocio(int IDSocio);
    void BuscarSocioPorNombre(String Nombre);
    void BuscarSocioPorTelefono(int telefono);
    void ListarSocios();

}
