package br.edu.ifms.biblioteca.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifms.biblioteca.model.Periodicos;
import br.edu.ifms.biblioteca.util.Conexao;

public class PeriodicosDAO {
	private Connection con = null;

	public PeriodicosDAO() {
		Conexao conexao = new Conexao();
		con = conexao.openConnection();
	}
	public void inserir(Periodicos periodicos) {
		String inserir = "insert into periodicos (id, autores, ISSN) values (?,?,?)";
		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(inserir);
			
			stmt.setInt(1, periodicos.getId());
			stmt.setString(2, periodicos.getAutores());
			stmt.setInt(3, periodicos.getISSN());
			
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //
		
	}

	public void deletar(Periodicos id) {
		String deletar = "delete from periodicos where id= ? ";
		
		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(deletar);
			
			stmt.setInt(1, id.getId());
			stmt.setString(2, id.getAutores());
			stmt.setInt(3, id.getISSN());
			
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //
	}

	public void update(Periodicos periodicos) {
		String update = "update periodicos set id= ?, autores ='?', ISSN = '?' where id= ? ";

		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(update);
			
			stmt.setInt(1, periodicos.getId());
			stmt.setString(2, periodicos.getAutores());
			stmt.setInt(3, periodicos.getISSN());
			
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //
		
	}
	

}
