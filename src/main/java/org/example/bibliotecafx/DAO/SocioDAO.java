package org.example.bibliotecafx.DAO;

import org.example.bibliotecafx.Util.HibernateUtil;
import org.example.bibliotecafx.entities.Autor;
import org.example.bibliotecafx.entities.Libro;
import org.example.bibliotecafx.entities.Socio;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SocioDAO implements SocioDAO_IMP{
    @Override
    public void AnyadirSocio(String nombre, String direccion, int telefono) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Socio aux = new Socio(nombre, direccion, telefono);

        try {

            session.save(aux);
            tx.commit();

        } catch (Exception e) {

            if (tx != null) {
                tx.rollback();
            }

            e.printStackTrace();

        } finally {

            session.close();

        }
    }

    @Override
    public void ModificarSocio(Socio socio, Socio socioMod) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {


            if (socio != null) {

                socio.setNombre(socioMod.getNombre());
                socio.setDireccion(socioMod.getDireccion());
                socio.setTelefono(socioMod.getTelefono());
            }

            transaction.commit();

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();

        } finally {
            session.close();
        }

    }

    @Override
    public void EliminarSocio(Socio socio) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {


            if (socio != null) {

                session.remove(socio);

            }

            transaction.commit();

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();

        } finally {
            session.close();
        }

    }


    @Override
    public List<Socio> BuscarSocioPorNombre(String Nombre) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Socio> socios =  session.createQuery( "from Socios where Nombre='"+Nombre+"'", Socio.class).list();

        session.close();
        return socios;
    }

    @Override
    public List<Socio> BuscarSocioPorTelefono(int telefono) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Socio> socios =  session.createQuery( "from Socios where telefono='"+telefono+"'", Socio.class).list();

        session.close();
        return socios;
    }

    @Override
    public List<Socio> ListarSocios() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Socio> socios =  session.createQuery( "from Socios", Socio.class).list();

        session.close();
        return socios;
    }
}
