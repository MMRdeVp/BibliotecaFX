package org.example.bibliotecafx.Util;

import org.example.bibliotecafx.entities.Autor;
import org.example.bibliotecafx.entities.Libro;
import org.example.bibliotecafx.entities.Prestamos;
import org.example.bibliotecafx.entities.Socio;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    public static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure();
        return configuration.buildSessionFactory();

    }

}
