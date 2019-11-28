package br.edu.ifms.biblioteca.controller;

import java.time.LocalDate;

import br.edu.ifms.biblioteca.DAO.AcervoDAO;
import br.edu.ifms.biblioteca.DAO.AlunoDAO;
import br.edu.ifms.biblioteca.model.Acervo;

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
    	Acervo acervo = new Acervo();
    	acervo.setCodigo(Integer.parseInt(txtCodigo.getText()));
    	acervo.setTitulo(String.format(txtTitulo.getText()));
    	acervo.setEditora(String.format(txtEditora.getText()));
    	acervo.setQuantidade(Integer.parseInt(txtQnt.getText()));
    	
    	AcervoDAO daoAcervo = new AcervoDAO(); 
    	daoAcervo.inserir(acervo);
    	

    }

}


