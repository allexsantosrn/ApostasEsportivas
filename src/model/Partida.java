package model;

import java.util.Date;

public class Partida {

	Date data;
	String campeonato;
	String casa;
	String fora;
	int golCasaFT;
	int golForaFT;
	int golCasaHT;
	int golForaHT;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(String campeonato) {
		this.campeonato = campeonato;
	}

	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

	public String getFora() {
		return fora;
	}

	public void setFora(String fora) {
		this.fora = fora;
	}

	public int getGolCasaFT() {
		return golCasaFT;
	}

	public void setGolCasaFT(int golCasaFT) {
		this.golCasaFT = golCasaFT;
	}

	public int getGolForaFT() {
		return golForaFT;
	}

	public void setGolForaFT(int golForaFT) {
		this.golForaFT = golForaFT;
	}

	public int getGolCasaHT() {
		return golCasaHT;
	}

	public void setGolCasaHT(int golCasaHT) {
		this.golCasaHT = golCasaHT;
	}

	public int getGolForaHT() {
		return golForaHT;
	}

	public void setGolForaHT(int golForaHT) {
		this.golForaHT = golForaHT;
	}

}
