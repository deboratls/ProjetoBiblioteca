package br.edu.ifms.biblioteca.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifms.biblioteca.model.Multa;
import br.edu.ifms.biblioteca.util.Conexao;

public class MultaDAO {
	private Connection con = null;

	public MultaDAO() {
		Conexao conexao = new Conexao();
		con = conexao.openConnection();
	}
	
	
	public void inserir(Multa multa) {
		String inserir = "insert into Multa(dtDevolucao, valor) values (?,?)";
		try {	// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(inserir);
			
			//stmt.setInt(1, multa.getIdEmprestimo());
			stmt.setDate(2, java.sql.Date.valueOf(multa.getDtDevolucao()));
			stmt.setDouble(3, multa.getValor());
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //	
		
	}

	public void deletar(Multa id) {
		String deletar = "delete from Multa where id= ? ";
		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(deletar);
			
			stmt.setInt(1, id.getIdEmprestimo());
			stmt.setDate(2, java.sql.Date.valueOf(id.getDtDevolucao()));
			stmt.setDouble(3, id.getValor());
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //	
		
		
	}

	public void update(Multa multa) {
		String update = "update aluno set idEmprestimo = ?, dtDevolucao = ?, valor = ? where id= ? ";
		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(update);
			
			stmt.setInt(1, multa.getIdEmprestimo());
			stmt.setDate(2, java.sql.Date.valueOf(multa.getDtDevolucao()));
			stmt.setDouble(3, multa.getValor());
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //	
		
	}

}
