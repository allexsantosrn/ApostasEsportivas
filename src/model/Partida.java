package model;

import java.util.Date;

public class Partida {

	Date data;
	String campeonato;
	String casa;
	String fora;
	String placarFT;
	int golCasaFT;
	int golForaFT;
	String placarHT;
	int golCasaHT;
	int golForaHT;
	float oddCasa;
	float empate;
	float oddFora;

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

	public String getPlacarFT() {
		return placarFT;
	}

	public void setPlacarFT(String placarFT) {
		this.placarFT = placarFT;
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

	public String getPlacarHT() {
		return placarHT;
	}

	public void setPlacarHT(String placarHT) {
		this.placarHT = placarHT;
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

	public double getOddCasa() {
		return oddCasa;
	}

	public void setOddCasa(float oddCasa) {
		this.oddCasa = oddCasa;
	}

	public double getEmpate() {
		return empate;
	}

	public void setEmpate(float empate) {
		this.empate = empate;
	}

	public double getOddFora() {
		return oddFora;
	}

	public void setOddFora(float oddFora) {
		this.oddFora = oddFora;
	}

}
