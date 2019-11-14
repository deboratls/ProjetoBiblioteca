package br.edu.ifms.biblioteca.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifms.biblioteca.model.Acervo;
import br.edu.ifms.biblioteca.model.Emprestimo;
import br.edu.ifms.biblioteca.util.Conexao;

public class EmprestimoDAO {
	
	private Connection con = null;

	public EmprestimoDAO() {
		Conexao conexao = new Conexao();
		con = conexao.openConnection();
	}

	
	public void inserir(Emprestimo emprestimo) {
		String inserir = "insert into Emprestimo(prazo,tdRetirada, pessoa) values (?,?,?)";
		
		
			try {// desenvolver essa mesma estrutura para insert, deletar, update
				PreparedStatement stmt = con.prepareStatement(inserir);
				
				//stmt.setInt(1, emprestimo.getId());
				stmt.setInt(2, emprestimo.getPrazo());
				stmt.setDate(3, java.sql.Date.valueOf(emprestimo.getDtRetirada()));
				stmt.setInt(4,emprestimo.getIdPessoa());
				
				stmt.execute();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //

		}
	

	public void deletar(Emprestimo id) {
		String deletar = "delete from Emprestimo where id= ? ";
		
		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(deletar);
			
			stmt.setInt(1, id.getId());
			stmt.setInt(2, id.getPrazo());
			stmt.setDate(3, java.sql.Date.valueOf(id.getDtRetirada()));
			stmt.setInt(4,id.getIdPessoa());
			
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //

		
	}

	public void update(Emprestimo emprestimo) {
		String update = "update aluno set id= ?, prazo =?, tdRetirada = ?, pessoa=? where id= ? ";
		
		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(update);
			
			stmt.setInt(1, emprestimo.getId());
			stmt.setInt(2, emprestimo.getPrazo());
			stmt.setDate(3, java.sql.Date.valueOf(emprestimo.getDtRetirada()));
			stmt.setInt(4,emprestimo.getIdPessoa());
			stmt.execute();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //


	}

}
