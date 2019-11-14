package br.edu.ifms.biblioteca.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifms.biblioteca.model.Funcionario;
import br.edu.ifms.biblioteca.util.Conexao;

public class FuncionarioDAO {
	
	private Connection con = null;

	public FuncionarioDAO() {
		Conexao conexao = new Conexao();
		con = conexao.openConnection();
	}

	
	public void inserir(Funcionario funcionario) {
		String inserir = "insert into Funcionario(matricula, salario, cargo) values ( ?,?,? )";
		
		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(inserir);
			
			stmt.setString(1, funcionario.getMatricula());
			stmt.setDouble(2, funcionario.getSalario());
			stmt.setString(3, funcionario.getCargo());
					
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //
	}

	public void deletar(Funcionario id) {
		String deletar = "delete from funcionario where matricula= ? ";
		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(deletar);
			
			stmt.setString(1, id.getMatricula());
			stmt.setDouble(2, id.getSalario());
			stmt.setString(3, id.getCargo());
					
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //
		
	}

	public void update(Funcionario funcionario) {
		String update = "update funcionario set matricula= ?, salario = ?, cargo = '?' where matricula= ? ";

		try {// desenvolver essa mesma estrutura para insert, deletar, update
			PreparedStatement stmt = con.prepareStatement(update);
			
			stmt.setString(1, funcionario.getMatricula());
			stmt.setDouble(2, funcionario.getSalario());
			stmt.setString(3, funcionario.getCargo());
					
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //
		
		
	}

}
