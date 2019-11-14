package br.edu.ifms.biblioteca.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private Connection con = null; // conexao com banco de dados
	private String user="root";
	private String pwd="root";
	private String server = "localhost";
	private String driver = "com.mysql.jdbc.Driver";// driver a ser utilizado p/ conexao importado da lib mysql
	private String host = "jdbc:mysql://" + server + "/biblioteca"; // string da conexao responsavel p/ usar o mysql
	
	
	//Metodo responsavel por abrir conexao
	public Connection openConnection() {
		try {
			//Especificar o drive a ser utilizado
			Class.forName(driver);
			this.con = DriverManager.getConnection(host, user, pwd);
			return con;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
		
	}
	

}
