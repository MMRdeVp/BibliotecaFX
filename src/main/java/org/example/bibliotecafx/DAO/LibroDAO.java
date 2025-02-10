package org.example.bibliotecafx.DAO;

import org.example.bibliotecafx.Util.HibernateUtil;
import org.example.bibliotecafx.entities.Autor;
import org.example.bibliotecafx.entities.Libro;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class LibroDAO implements LibroDAO_IMP{

    @Override
    public void AnyadirLibro(String titulo, int ISBN, int IDAutor, String editorial, int anyoPublicacion) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Libro libro = new Libro(titulo, ISBN, IDAutor, editorial, anyoPublicacion);

        try {

            session.save(libro);
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
    public void ModificarLibro(Libro libro, Libro libroMod) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {


            if (libro != null) {

                libro.setISBN(libroMod.getISBN());
                libro.setAutor(libroMod.getAutor());
                libro.setEditorial(libroMod.getEditorial());
                libro.setTitulo(libroMod.getTitulo());
                libro.setAnyoPublicacion(libroMod.getAnyoPublicacion());
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
    public void EliminarLibro(Libro libro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {


            if (libro != null) {

                session.remove(libro);
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
    public List<Libro> BuscarLibroPorTitulo(String Titulo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Libro> libros =  session.createQuery( "from Libro where titulo='"+Titulo+"'", Libro.class).list();

        session.close();
        return libros;
    }

    @Override
    public List<Libro> BuscarLibroPorAutor(int IDAutor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Libro> libros =  session.createQuery( "from Libro where idautor='"+IDAutor+"'", Libro.class).list();

        session.close();
        return libros;

    }

    @Override
    public List<Libro> BuscarLibroPorISBN(String ISBN) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Libro> libros =  session.createQuery( "from Libro where ISBN='"+ISBN+"'", Libro.class).list();

        session.close();
        return libros;

    }

    @Override
    public List<Libro> ListarLibrosNoPrestados() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Libro> libros =  session.createQuery( "from Libro", Libro.class).list();

        session.close();
        return libros;
    }
}
