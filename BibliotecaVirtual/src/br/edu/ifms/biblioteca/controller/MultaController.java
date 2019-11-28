package br.edu.ifms.biblioteca.controller;

import br.edu.ifms.biblioteca.DAO.MultaDAO;
import br.edu.ifms.biblioteca.model.Multa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MultaController {

   
    @FXML
    private DatePicker DataDev;

    @FXML
    private TextField txtValor;

    @FXML
    private Button btnSalvar;

    @FXML
    void Salvar(ActionEvent event) {

  	
    	Multa multa = new Multa();
       	multa.setDtDevolucao(DataDev.getValue());
    	multa.setValor(Double.parseDouble(txtValor.getText()));
    	
    	MultaDAO daomult = new MultaDAO();
    	daomult.inserir(multa);
    	
    	
    	
    	
    

    }

}
