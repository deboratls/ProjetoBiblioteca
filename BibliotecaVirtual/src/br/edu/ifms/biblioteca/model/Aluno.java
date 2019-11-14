package br.edu.ifms.biblioteca.model;

import java.time.LocalDate;

public class Aluno extends Pessoa {
	
	private int RA; // registro do aluno
	
		
	private LocalDate dtEntrada;// data inicio do curso
	private LocalDate dtSaida;// data do fim do curso
	
	
	public int getRA() {
		return RA;
	}
	public void setRA(int rA) {
		RA = rA;
	}
	public LocalDate getDtEntrada() {
		return dtEntrada;
	}
	public void setDtEntrada(LocalDate dtEntrada) {
		this.dtEntrada = dtEntrada;
	}
	public LocalDate getDtSaida() {
		return dtSaida;
	}
	public void setDtSaida(LocalDate dtSaida) {
		this.dtSaida = dtSaida;
	}

}
