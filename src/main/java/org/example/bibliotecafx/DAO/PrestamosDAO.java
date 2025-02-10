package org.example.bibliotecafx.DAO;

import jakarta.persistence.Id;
import org.example.bibliotecafx.Util.HibernateUtil;
import org.example.bibliotecafx.entities.Libro;
import org.example.bibliotecafx.entities.Prestamos;
import org.example.bibliotecafx.entities.Socio;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.List;
import java.util.TreeSet;

public class PrestamosDAO implements PrestamosDAO_IMP{
    @Override
    public void RegistrarPrestamo(int IDSocio, int IDLibro, LocalDate FechaInicio, LocalDate FechaDevolucion) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Prestamos aux = new Prestamos(IDSocio,IDLibro,FechaInicio,FechaDevolucion);

        try {

            session.save(aux);
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
    public List<Prestamos> ListarPrestamos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Prestamos> prestamos =  session.createQuery( "from prestamos", Prestamos.class).list();

        session.close();
        return prestamos;
    }

    @Override
    public List<Prestamos> ListarPrestamosPorSocio(int IDSocio) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Prestamos> prestamos =  session.createQuery( "from Libro where idsocio='"+IDSocio +"'", Prestamos.class).list();

        session.close();
        return prestamos;
    }
}
