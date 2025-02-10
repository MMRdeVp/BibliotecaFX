package org.example.bibliotecafx.DAO;

import org.example.bibliotecafx.Util.HibernateUtil;
import org.example.bibliotecafx.entities.Autor;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AutorDAO implements AutorDAO_IMP{

    @Override
    public void AnyadirAutor(String nombre, String nacionalidad) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Autor aux = new Autor(nombre, nacionalidad);

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
    public void ModificarAutor(Autor autor, Autor autorMod) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {


            if (autor != null) {

                autor.setNacionalidad(autorMod.getNacionalidad());
                autor.setNombre(autorMod.getNombre());
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
    public void EliminarAutor(Autor autor) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {


            if (autor != null) {

                session.remove(autor);

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
    public List<Autor> BuscarAutorPorNombre(String Nombre) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Autor> autores =  session.createQuery( "from Autor where nombre='"+Nombre+"'", Autor.class).list();

        session.close();
        return autores;
    }

    @Override
    public List<Autor> ListarAutores() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Autor> autores =  session.createQuery( "from Autor", Autor.class).list();

        session.close();
        return autores;
    }


}


