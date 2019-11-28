package br.edu.ifms.biblioteca.controller;

import java.time.LocalDate;

import br.edu.ifms.biblioteca.DAO.AcervoDAO;
import br.edu.ifms.biblioteca.DAO.EmprestimoDAO;
import br.edu.ifms.biblioteca.model.Emprestimo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EmprestimoController {

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtPrazo;

    @FXML
    private DatePicker DataRet;

    @FXML
    private TextField txtPessoa;

    @FXML
    private Button btnSalvar;

   

    @FXML
    void Salvar(ActionEvent event) {
    	Emprestimo emp = new Emprestimo();
    	emp.setPrazo(Integer.parseInt(txtPrazo.getText()));
    	emp.setIdPessoa(Integer.parseInt(txtPessoa.getText()));
    	emp.setDtRetirada(DataRet.getValue());
    	
    	EmprestimoDAO daoEmp = new EmprestimoDAO(); 
    	daoEmp.inserir(emp);
    	
    	
    }

}
