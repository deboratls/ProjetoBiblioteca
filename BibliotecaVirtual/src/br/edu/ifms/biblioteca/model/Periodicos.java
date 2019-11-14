package br.edu.ifms.biblioteca.model;

public class Periodicos extends Acervo {
	
	//private int id;
	private String autores;
	private int ISSN;
	
	
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	
	public int getISSN() {
		return ISSN;
	}
	public void setISSN(int iSSN) {
		ISSN = iSSN;
	}

	
	
}
