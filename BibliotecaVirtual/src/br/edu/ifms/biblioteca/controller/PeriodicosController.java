package br.edu.ifms.biblioteca.controller;

import br.edu.ifms.biblioteca.DAO.PeriodicosDAO;
import br.edu.ifms.biblioteca.model.Periodicos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PeriodicosController {

    @FXML
    private Label ContMenuAutores;

    @FXML
    private TextField txtIssn;

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtAutores;

 

    @FXML
    void Salvar(ActionEvent event) {
    	
    	Periodicos per = new Periodicos();
    	per.setAutores(String.format(txtAutores.getText()));
    	per.setISSN(Integer.parseInt(txtIssn.getText()));
    	
    	PeriodicosDAO daoper = new PeriodicosDAO();
    	daoper.inserir(per);
    	daoper.deletar(per);
    	daoper.update(per);
    	
    	
    	

    }

}
