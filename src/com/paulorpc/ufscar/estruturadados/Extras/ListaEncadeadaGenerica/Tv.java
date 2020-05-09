package com.paulorpc.ufscar.estruturadados.Extras.ListaEncadeadaGenerica;


public class Tv {

	String modelo;
	String fabricante;
	int tamanhoPolegadas;

	public Tv(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getTamanhoPolegadas() {
		return tamanhoPolegadas;
	}

	public void setTamanhoPolegadas(int tamanhoPolegadas) {
		this.tamanhoPolegadas = tamanhoPolegadas;
	}

	@Override
	public String toString() {
		return "Tv [" + (modelo != null ? "modelo=" + modelo + ", " : "")
				+ (fabricante != null ? "fabricante=" + fabricante + ", " : "") + "tamanhoPolegadas=" + tamanhoPolegadas
				+ "]";
	}
	
	

}
