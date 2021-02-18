package br.com.gabrielle.gui.controller;

import br.com.gabrielle.entities.Pessoa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ViewController implements Initializable {


    @FXML
    private ComboBox<Pessoa> pessoaComboBox;
    public ComboBox<Pessoa> a;


    private ObservableList<Pessoa> observableList;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<Pessoa> list = new ArrayList<>();
        list.add(new Pessoa(1, "Gabrielle", "Av. Planalto", "62994935234"));
        list.add(new Pessoa(2, "Eduardo", "Av. Planalto", "629466892"));
        list.add(new Pessoa(3, "Isabela", "Rua Dr° Aquiles", "6299584554"));
        observableList = FXCollections.observableArrayList(list);
        pessoaComboBox.setItems(observableList);
    }
}
