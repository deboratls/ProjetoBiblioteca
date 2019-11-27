package br.edu.ifms.biblioteca.controller;

import br.edu.ifms.biblioteca.DAO.EmprestimoDAO;
import br.edu.ifms.biblioteca.DAO.FuncionarioDAO;
import br.edu.ifms.biblioteca.model.Acervo;
import br.edu.ifms.biblioteca.model.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FuncionarioController {

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtMat;

    @FXML
    private TextField txtSalario;

    @FXML
    private TextField txtCargo;

    @FXML
    void salvar(ActionEvent event) {
    	
    	Funcionario func = new Funcionario();
    	func.setMatricula(String.format(txtMat.getText()));
    	func.setSalario(Double.parseDouble(txtSalario.getText()));
    	func.setCargo(String.format(txtCargo.getText()));
    	
    	FuncionarioDAO daofunc = new FuncionarioDAO(); 
    	daofunc.inserir(func);
    	daofunc.deletar(func);
    	daofunc.update(func);

    }

}
