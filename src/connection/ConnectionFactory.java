package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	// Nome do usuário do banco
	private static final String USERNAME = "postgres";

	// Senha do banco
	private static final String PASSWORD = "123456";

	// Caminho do banco de dados
	private static final String DATABASE_URL = "jdbc:postgresql:agenda";

	public static Connection CriarConexao() throws Exception{

		Class.forName("org.postgresql.Driver");

		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		return connection;

	}

	public static void main(String[] args) throws Exception {

		//Recuperar conexão com banco de dados.
		Connection conn = CriarConexao();
		
		//Testar se a conexão é nula.
		if(conn!=null) {
			System.out.println("Conexão obtida com sucesso!!");
		}
		conn.close();
	}

}
