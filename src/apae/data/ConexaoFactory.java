package apae.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	private static String conString = "";
	private static Connection conexao = null;
	
	public static Connection getConexao() throws SQLException {
		if(conexao == null){
			conexao = DriverManager.getConnection(conString);
		}
		return conexao;
	}

}
