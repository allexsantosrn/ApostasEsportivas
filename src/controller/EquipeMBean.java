package controller;

import java.util.Scanner;

import model.Equipe;

public class EquipeMBean {
	
	Scanner input = new Scanner(System.in);


	public void cadastrarClube() {
		
		Equipe equipe = new Equipe();
		
		System.out.print("Informe o nome da equipe: ");
		String nome = input.nextLine();
		
		System.out.println("Informe o nome do país da equipe: ");
		String pais = input.nextLine();
			
		equipe.setNome(nome);
		equipe.setPais(pais);
		
		
	}
	
	

}
