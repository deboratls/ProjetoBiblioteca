package br.edu.ifms.biblioteca.model;

import java.time.LocalDate;

public class Emprestimo {
	private int id;
	private LocalDate dtRetirada;
	private int prazo;
	private int idPessoa;// aluno ou funcionário
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int pessoa) {
		this.idPessoa = pessoa;
	}
	public LocalDate getDtRetirada() {
		return dtRetirada;
	}
	public void setDtRetirada(LocalDate dtRetirada) {
		this.dtRetirada = dtRetirada;
	}
	public int getPrazo() {
		return prazo;
	}
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	
}
