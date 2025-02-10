package org.example.bibliotecafx.DAO;

import org.example.bibliotecafx.entities.Socio;

import java.util.List;

public interface SocioDAO_IMP {

    void AnyadirSocio(String nombre, String direccion, int telefono);
    void ModificarSocio(Socio Socio, Socio SocioMod);
    void EliminarSocio(Socio Socio);
    List<Socio> BuscarSocioPorNombre(String Nombre);
    List<Socio> BuscarSocioPorTelefono(int telefono);
    List<Socio> ListarSocios();

}
