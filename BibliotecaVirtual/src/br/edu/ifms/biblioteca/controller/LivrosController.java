package br.edu.ifms.biblioteca.controller;

import br.edu.ifms.biblioteca.DAO.LivrosDAO;
import br.edu.ifms.biblioteca.model.Acervo;
import br.edu.ifms.biblioteca.model.Livros;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LivrosController {

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtAut;

    @FXML
    private TextField txtAnoPL;

    @FXML
    private TextField txtVol;

    @FXML
    private TextField txtISBN;

    @FXML
    private TextField txtIdLivros;

    @FXML
    void Salvar(ActionEvent event) {
    	
    	Livros livros = new Livros();
    	livros.setAutores(String.format(txtAut.getText()));
    	livros.setAnoPublicacao(Integer.parseInt(txtAnoPL.getText()));
    	livros.setISBN(Integer.parseInt(txtISBN.getText()));
    	livros.setVolume(Integer.parseInt(txtVol.getText()));
    	
    	LivrosDAO daolivros = new LivrosDAO();
    	daolivros.inserir(livros);
   
    
    	

    }

}

