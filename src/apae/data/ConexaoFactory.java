package apae.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	private static String conString = "";
	private static Connection conexao = null;
	
	public static Connection getConexao() throws Exception {
		if(conexao == null){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjetoAPAE", "root", "");
			} catch (ClassNotFoundException e) {
				System.err.println("Erro nao conexão: " + e.getLocalizedMessage());
				throw e;
			}
		}
		return conexao;
	}

}
