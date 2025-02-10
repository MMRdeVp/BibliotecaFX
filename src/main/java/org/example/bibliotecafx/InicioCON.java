package org.example.bibliotecafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.example.bibliotecafx.DAO.LibroDAO;
import org.example.bibliotecafx.entities.*;

import java.util.List;


public class InicioCON {

    @FXML
    private ToggleButton TBLibros, TBAutores, TBSocios, TBPrestamos;
    @FXML
    private ToggleGroup ObjetoSeleccionado;
    @FXML
    private ChoiceBox<String> BuscarPor;
    @FXML
    private TextField BuscarInput;
    @FXML
    private TableView<Libro> tabla;

    //Libro
    @FXML
    private TableColumn<Libro, String> Titulo;
    @FXML
    private TableColumn<Libro, Integer> ISBN;

    private List<Object> listaObjetos = FXCollections.observableArrayList();
    private List<Object> listaFiltrada = FXCollections.observableArrayList();

    public void RefrescarTabla(){

        LibroDAO libroDAO = new LibroDAO();

        if(TBLibros.isSelected()){
            Titulo.setCellValueFactory(cellData -> (javafx.beans.value.ObservableValue<String>) cellData.getValue().tituloProperty());
            ISBN.setCellValueFactory(cellData -> ( cellData.getValue().ISBNProperty());

            tabla.setItems(FXCollections.observableArrayList(libroDAO.ListarLibrosNoPrestados()));

        } else if (TBAutores.isSelected()) {

        } else if (TBPrestamos.isSelected()) {

        }else if (TBSocios.isSelected()){

        }

    }

}
