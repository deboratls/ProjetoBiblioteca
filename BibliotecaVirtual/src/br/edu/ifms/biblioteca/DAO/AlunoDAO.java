package br.edu.ifms.biblioteca.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifms.biblioteca.model.Aluno;
import br.edu.ifms.biblioteca.util.Conexao;

public class AlunoDAO {

	private Connection con = null;

	public AlunoDAO() {
		Conexao conexao = new Conexao();
		con = conexao.openConnection();
	}

	public void inserir(Aluno aluno) {
		String inserir = "insert into Aluno(ra, dtEntrada, dtSaida) values (?,?,?)";

		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(inserir);
			
			stmt.setInt(1, aluno.getRA());
			stmt.setDate(2, java.sql.Date.valueOf(aluno.getDtEntrada()));
			stmt.setDate(3, java.sql.Date.valueOf(aluno.getDtSaida()));
			stmt.execute();
			System.out.println("Aluno inserido com sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //

	}

	public void deletar(Aluno id) {
		String deletar = "delete from aluno where ra= ? ";

		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(deletar);
			stmt.setInt(1, id.getRA());

			stmt.setDate(2, java.sql.Date.valueOf(id.getDtEntrada()));

			stmt.setDate(3, java.sql.Date.valueOf(id.getDtSaida()));
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //

	}

	public void update(Aluno aluno) {
		String update = "update aluno set ra= ?, dtEntrada =?, dtSaida = ? where ra= ? ";

		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(update);
			stmt.setInt(1, aluno.getRA());

			stmt.setDate(2, java.sql.Date.valueOf(aluno.getDtEntrada()));

			stmt.setDate(3, java.sql.Date.valueOf(aluno.getDtSaida()));
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //

	}

}
