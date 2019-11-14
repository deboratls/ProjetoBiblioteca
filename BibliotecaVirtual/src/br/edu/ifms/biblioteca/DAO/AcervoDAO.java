package br.edu.ifms.biblioteca.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifms.biblioteca.model.Acervo;
import br.edu.ifms.biblioteca.util.Conexao;

public class AcervoDAO {
	
	private Connection con = null;

	public AcervoDAO() {
		Conexao conexao = new Conexao();
		con = conexao.openConnection();
	}

	
	public void inserir(Acervo acervo) {
		String inserir = "insert into Acervo (id,codigo, titulo, editora, quantidade) values (?,?,?,?,?)";
		
		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(inserir);
			
			stmt.setInt(1, acervo.getId());
			stmt.setInt(2, acervo.getCodigo());
			stmt.setString(3, acervo.getTitulo());
			stmt.setString(4, acervo.getEditora());
			stmt.setInt(5, acervo.getQuantidade());
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //

	}
	

	public void deletar(Acervo id) {
		String deletar = "delete from acervo where id= ? ";
		
		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(deletar);
			
			stmt.setInt(1, id.getId());
			stmt.setInt(2, id.getCodigo());
			stmt.setString(3, id.getTitulo() );
			stmt.setString(4, id.getEditora());
			stmt.setInt(5, id.getQuantidade());
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //

	
	}

	public void update(Acervo acervo) {
		String update = "update acervo set codigo =?, titulo = ?, editora=?, quantidade =? where id= ? ";
		
		
			try {// desenvolver essa mesma estrutura para insert, deletar, update
				PreparedStatement stmt = con.prepareStatement(update);
				
				stmt.setInt(1, acervo.getId());
				stmt.setInt(2, acervo.getCodigo());
				stmt.setString(3, acervo.getEditora());
				stmt.setString(4, acervo.getTitulo() );
				stmt.setInt(5, acervo.getQuantidade());
				stmt.execute();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //


	}

}
