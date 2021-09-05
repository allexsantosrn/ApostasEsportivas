package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import connection.ConnectionFactory;
import model.Partida;

public class PartidaDAO {

	public void inserirPartida(Partida partida) {

		String sql = "INSERT INTO partida(dataPartida, campeonato, casa, visitante, placarFT, golsFTCasa, golsFTFora,"
				+ "placarHT, golsHTCasa,golsHTFora,oddCasa,oddEmpate,oddFora) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			// Criando conexão com o banco
			conn = ConnectionFactory.criarConexao();

			// Criando Prepared Statment
			pstm = conn.prepareStatement(sql);

			// Passando dados

			pstm.setDate(1, new Date(partida.getData().getTime()));
			pstm.setString(2, partida.getCampeonato());
			pstm.setString(3, partida.getCasa());
			pstm.setString(4, partida.getFora());
			pstm.setString(5, partida.getPlacarFT());
			pstm.setInt(6, partida.getGolCasaFT());
			pstm.setInt(7, partida.getGolForaFT());
			pstm.setString(8, partida.getPlacarHT());
			pstm.setInt(9, partida.getGolCasaHT());
			pstm.setInt(10, partida.getGolForaHT());
			pstm.setDouble(11, partida.getOddCasa());
			pstm.setDouble(12, partida.getEmpate());
			pstm.setDouble(13, partida.getOddFora());

			// Executar
			pstm.execute();

			System.out.println("Partida cadastrada com sucesso!!");

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
