package br.edu.ifms.biblioteca.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifms.biblioteca.model.Livros;
import br.edu.ifms.biblioteca.util.Conexao;

public class LivrosDAO {
	
	private Connection con = null;

	public LivrosDAO() {
		Conexao conexao = new Conexao();
		con = conexao.openConnection();
	}
	
	
	public void inserir(Livros livros) {
		String inserir = "insert into Livros(AnoPublic, autores, ISBN, volume) values (?,?,?,? )";
		
		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(inserir);
			
			//stmt.setInt(1, livros.getId());
			stmt.setInt(1, livros.getAnoPublicacao());
			stmt.setString(2, livros.getAutores());
			stmt.setInt(3, livros.getISBN());
			stmt.setInt(4, livros.getVolume());
							
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //	
		
	}

	public void deletar(Livros id) {
		String deletar = "delete from livros where id= ? ";
		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(deletar);
			
			stmt.setInt(1, id.getId());
			stmt.setInt(2, id.getAnoPublicacao());
			stmt.setString(3, id.getAutores());
			stmt.setInt(4, id.getISBN());
			stmt.setInt(5, id.getVolume());
			
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //	
		
	}

	public void update(Livros livros) {
		String update = "update livros set Id= ?, AnoPublic= ?, autores ='?', ISBN = ?, volume= ? where id= ? ";
		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(update);
			
			stmt.setInt(1, livros.getId());
			stmt.setInt(2, livros.getAnoPublicacao());
			stmt.setString(3, livros.getAutores());
			stmt.setInt(4, livros.getISBN());
			stmt.setInt(5, livros.getVolume());
									
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //	
		
		
	}

}
