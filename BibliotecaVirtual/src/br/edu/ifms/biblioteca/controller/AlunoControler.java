package br.edu.ifms.biblioteca.controller;

import java.time.LocalDate;

import br.edu.ifms.biblioteca.DAO.AlunoDAO;
import br.edu.ifms.biblioteca.model.Aluno;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AlunoControler {
	@FXML
	private TextField txtNome;


    @FXML
    private TextField txtRA;

    @FXML
    private TextField txtData;

    @FXML
    private TextField txtDataSai;

    @FXML
    private Button btnVolt;

    @FXML
    private Button btnSalvar1;

    @FXML
    void salvar(ActionEvent event) {
    	Aluno aluno = new Aluno();
    	aluno.setRA(Integer.parseInt(txtRA.getText()));
    	aluno.setNome(String.format(txtNome.getText()));
    	aluno.setDtEntrada(LocalDate.parse(txtData.getText()));
    	aluno.setDtSaida(LocalDate.parse(txtDataSai.getText()));
    	//Colocar o método inserir aluno  para cada classe
    	AlunoDAO daoAluno = new AlunoDAO(); 
    	daoAluno.inserir(aluno);
    	daoAluno.deletar(aluno);
    	daoAluno.update(aluno);
    }

    @FXML
    void volt(ActionEvent event) {

    }

}

