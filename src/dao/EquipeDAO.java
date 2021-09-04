package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.ConnectionFactory;
import model.Equipe;

public class EquipeDAO {

	public void inserirEquipe(Equipe equipe) {

		String sql = "INSERT INTO equipe(nome, pais) VALUES (?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			// Criando conexão com o banco
			conn = ConnectionFactory.criarConexao();

			// Criando Prepared Statment
			pstm = conn.prepareStatement(sql);

			// Passando dados
			pstm.setString(1, equipe.getNome());
			pstm.setString(2, equipe.getPais());

			// Executar
			pstm.execute();

			System.out.println("Equipe cadastrada com sucesso!!");

		}

		catch (Exception e) {

			e.printStackTrace();

		}

		finally {

			try {
				// Fechar conexoes
				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			}

			catch (Exception e) {

				e.printStackTrace();

			}
		}

	}

}
