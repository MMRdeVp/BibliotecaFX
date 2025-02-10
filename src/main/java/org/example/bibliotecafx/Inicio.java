package org.example.bibliotecafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.bibliotecafx.DAO.AutorDAO;
import org.example.bibliotecafx.DAO.AutorDAO_IMP;
import org.example.bibliotecafx.entities.Autor;

import java.io.IOException;

public class Inicio extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Inicio.class.getResource("Inicio-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setResizable(false);
        stage.setTitle("Biblioteca en JavaFX");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {


        AutorDAO autorDAO = new AutorDAO();
        autorDAO.AnyadirAutor("MIgue", "madrs");

        launch();


    }
}