package view;

import java.text.ParseException;
import java.util.Scanner;

import controller.PartidaMBean;

public class Home {

	public static void main(String[] args) throws ParseException {
		
		int option;

		Scanner input = new Scanner(System.in);

		//EquipeMBean controllerEquipe = new EquipeMBean();
		
		PartidaMBean controllerPartida = new PartidaMBean();

		do {

			System.out.println("Seja bem-vindo!!");
			System.out.println("1-Cadastrar Time");
			System.out.println("2-Consultar Time");
			System.out.println("3-Importar Times");
			System.out.println("4-Exportar Times");
			System.out.println("5-Cadastrar Partida");
			System.out.println("6-Importar Partidas");
			System.out.println("7-Exportar Partidas");
			System.out.println("8-Consultar Partidas");

			System.out.print("Escolha uma opção: ");
			option = input.nextInt();

			switch (option) {
			
			/*
			case 1:
				controllerEquipe.cadastrarEquipe();
				break;
			
			case 2:
				controllerEquipe.consultarEquipe();
				break; 
				
			case 3:
				controllerEquipe.importarEquipe();
				break;
				/*
			case 4:
				controller.exportarClubes();
				break; */

			case 5:
				controllerPartida.cadastrarPartida();
				break;
				
			case 6:
				controllerPartida.importarPartidas();
				break;
			/*	
			case 7:
				controller.exportarPartidas();
				break;
				
			case 8:
				controller.consultarPartidas();

			default:
				System.out.println("Opção inválida. Escolha uma opção entre 0 e 10!!!");
				break; */
			} 

		}

		while (option != 0);
		System.out.println("Encerrando...");
		input.close();

	}

}


