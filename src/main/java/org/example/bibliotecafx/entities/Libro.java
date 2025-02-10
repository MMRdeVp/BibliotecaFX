package org.example.bibliotecafx.entities;

import com.mysql.cj.conf.IntegerProperty;
import com.mysql.cj.conf.StringProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

@Entity

public class Libro {
/*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;
    private int ISBN;
    private int IDautor;
    private String editorial;
    private int anyoPublicacion;

    public Libro(String titulo, int ISBN, int autor, String editorial, int anyoPublicacion) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.IDautor = autor;
        this.editorial = editorial;
        this.anyoPublicacion = anyoPublicacion;
    }

    public Libro(){}

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getAutor() {
        return IDautor;
    }

    public void setAutor(int autor) {
        this.IDautor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

 */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private SimpleStringProperty titulo;
    private SimpleIntegerProperty ISBN;
    private SimpleIntegerProperty IDautor;
    private SimpleStringProperty editorial;
    private SimpleIntegerProperty anyoPublicacion;

    public Libro(String titulo, int ISBN, int autor, String editorial, int anyoPublicacion) {
        this.titulo = new SimpleStringProperty(titulo);
        this.ISBN = new SimpleIntegerProperty(ISBN);
        this.IDautor = new SimpleIntegerProperty(autor);
        this.editorial = new SimpleStringProperty(editorial);
        this.anyoPublicacion = new SimpleIntegerProperty(anyoPublicacion);
    }

    public Libro() {
        // Constructor sin argumentos
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo.getValue();
    }

    public void setTitulo(String titulo) {
        this.titulo.setValue(titulo);
    }

    public SimpleStringProperty tituloProperty() {
        return titulo;
    }

    public int getISBN() {
        return ISBN.getValue();
    }

    public void setISBN(int ISBN) {
        this.ISBN.setValue(ISBN);
    }

    public SimpleIntegerProperty ISBNProperty() {
        return ISBN;
    }

    public int getAutor() {
        return IDautor.getValue();
    }

    public void setAutor(int autor) {
        this.IDautor.setValue(autor);
    }

    public SimpleIntegerProperty autorProperty() {
        return IDautor;
    }

    public String getEditorial() {
        return editorial.getValue();
    }

    public void setEditorial(String editorial) {
        this.editorial.setValue(editorial);
    }

    public StringProperty editorialProperty() {
        return editorial;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion.getValue();
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion.setValue(anyoPublicacion);
    }

    public IntegerProperty anyoPublicacionProperty() {
        return anyoPublicacion;
    }


    
}
