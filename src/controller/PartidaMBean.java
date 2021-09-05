package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import dao.PartidaDAO;
import model.Partida;

public class PartidaMBean {

	Scanner input = new Scanner(System.in);

	public void cadastrarPartida() throws ParseException {

		Partida partida = new Partida();

		PartidaDAO partidaDao = new PartidaDAO();

		System.out.print("Informe a data da partida: ");
		String dataPartida = input.next();

		System.out.print("Informe o nome do campeonato: ");
		String nomeCampeonato = input.next();

		System.out.print("Informe a nome da equipe da casa: ");
		String nomeCasa = input.next();

		System.out.print("Informe a nome da equipe visitante: ");
		String nomeVisitante = input.next();

		System.out.print("Informe o placar final:");
		String placarFinalFT = input.next();

		System.out.print("Informe o número de gols finais do time da casa: ");
		int golsFtCasa = input.nextInt();

		System.out.print("Informe o número de gols finais do time visitante: ");
		int golsFtFora = input.nextInt();

		System.out.print("Informe o placar final HT: ");
		String placarFinalHT = input.next();

		System.out.print("Informe o número de gols HT do time da casa: ");
		int golsHtCasa = input.nextInt();

		System.out.print("Informe o número de gols HT do time visitante: ");
		int golsHtFora = input.nextInt();

		System.out.print("Informe a odd do time da casa: ");
		float oddCasa = input.nextFloat();

		System.out.print("Informe a odd do empate: ");
		float oddEmpate = input.nextFloat();

		System.out.print("Informe a odd do time visitante: ");
		float oddFora = input.nextFloat();

		// Convertendo a data de String para Date
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = formato.parse(dataPartida);

		partida.setData(dataFormatada);
		partida.setCampeonato(nomeCampeonato);
		partida.setCasa(nomeCasa);
		partida.setFora(nomeVisitante);
		partida.setPlacarFT(placarFinalFT);
		partida.setGolCasaFT(golsFtCasa);
		partida.setGolForaHT(golsFtFora);
		partida.setPlacarHT(placarFinalHT);
		partida.setGolCasaHT(golsHtCasa);
		partida.setGolForaHT(golsHtFora);
		partida.setOddCasa(oddCasa);
		partida.setEmpate(oddEmpate);
		partida.setOddFora(oddFora);

		partidaDao.inserirPartida(partida);

	}

	public void importarPartidas() throws ParseException {

		String path = "c:\\Temp\\inengland.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			line = br.readLine();

			while (line != null) {

				Partida partida = new Partida();

				PartidaDAO partidaDao = new PartidaDAO();

				String[] vect = line.split(",");
				String dataPartida = vect[0];
				String nomeCampeonato = vect[1];
				String nomeCasa = vect[2];
				String nomeVisitante = vect[3];
				String placarFinalFT = vect[4];
				String FTCasa = vect[5];
				String FTFora = vect[6];
				String placarFinalHT = vect[7];
				String HTCasa = vect[8];
				String HTFora = vect[9];
				String OC = vect[10];
				String OE = vect[11];
				String OF = vect[12];

				int golsFtCasa = Integer.parseInt(FTCasa);
				int golsFtFora = Integer.parseInt(FTFora);

				int golsHtCasa = Integer.parseInt(HTCasa);
				int golsHtFora = Integer.parseInt(HTFora);

				float oddCasa = Float.parseFloat(OC);
				float oddEmpate = Float.parseFloat(OE);
				float oddFora = Float.parseFloat(OF);

				// Convertendo a data de String para Date
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				Date dataFormatada = formato.parse(dataPartida);

				partida.setData(dataFormatada);
				partida.setCampeonato(nomeCampeonato);
				partida.setCasa(nomeCasa);
				partida.setFora(nomeVisitante);
				partida.setPlacarFT(placarFinalFT);
				partida.setGolCasaFT(golsFtCasa);
				partida.setGolForaHT(golsFtFora);
				partida.setPlacarHT(placarFinalHT);
				partida.setGolCasaHT(golsHtCasa);
				partida.setGolForaHT(golsHtFora);
				partida.setOddCasa(oddCasa);
				partida.setEmpate(oddEmpate);
				partida.setOddFora(oddFora);

				partidaDao.inserirPartida(partida);

				line = br.readLine();
			}
		}

		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
			// e.printStackTrace();
		}

	}

}
