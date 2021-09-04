package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	// Nome do usu�rio do banco
	private static final String USERNAME = "postgres";

	// Senha do banco
	private static final String PASSWORD = "123456";

	// Caminho do banco de dados
	private static final String DATABASE_URL = "jdbc:postgresql:apostas";

	public static Connection criarConexao() throws Exception{

		Class.forName("org.postgresql.Driver");

		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		return connection;

	}

	public static void main(String[] args) throws Exception {

		//Recuperar conex�o com banco de dados.
		Connection conn = criarConexao();
		
		//Testar se a conex�o � nula.
		if(conn!=null) {
			System.out.println("Conex�o obtida com sucesso!!");
		}
		conn.close();
	}

}
