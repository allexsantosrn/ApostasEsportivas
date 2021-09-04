package controller;

import java.util.Scanner;

import dao.EquipeDAO;
import model.Equipe;

public class EquipeMBean {
	
	Scanner input = new Scanner(System.in);


	public void cadastrarEquipe() {
		
		Equipe equipe = new Equipe();
		
		EquipeDAO equipeDao = new EquipeDAO();
		
		System.out.print("Informe o nome da equipe: ");
		String nome = input.nextLine();
		
		System.out.print("Informe o nome do país da equipe: ");
		String pais = input.nextLine();
			
		equipe.setNome(nome);
		equipe.setPais(pais);
		
		equipeDao.inserirEquipe(equipe);	
		
	}
	
	

}
