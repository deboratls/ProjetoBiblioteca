package br.edu.ifms.biblioteca.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AcervoController {

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtEditora;

    @FXML
    private TextField txtQnt;

    @FXML
    private Button btnCancel;

    @FXML
    void cancel(ActionEvent event) {

    }

    @FXML
    void salvar(ActionEvent event) {
    	System.out.println("Ola debora");

    }

}


