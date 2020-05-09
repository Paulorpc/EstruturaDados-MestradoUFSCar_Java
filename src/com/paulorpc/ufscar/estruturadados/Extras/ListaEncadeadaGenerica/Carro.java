package com.paulorpc.ufscar.estruturadados.Extras.ListaEncadeadaGenerica;


public class Carro implements Veiculos {

	private boolean rodaReserva;
	private int portas;
	private String motor;
	private String modelo;
	private String combustivel;
	private boolean paraDeficienteFisico;

	public Carro() {
		this.rodaReserva = true;
	}

	public Carro(String modelo, int portas) {
		this.modelo = modelo;
		this.portas = portas;
		this.rodaReserva = true;
	}

	public boolean isRodaReserva() {
		return rodaReserva;
	}

	public void setRodaReserva(boolean rodaReserva) {
		this.rodaReserva = rodaReserva;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public boolean isParaDeficienteFisico() {
		return paraDeficienteFisico;
	}

	@Override
	public String getModelo() {
		return modelo;
	}

	@Override
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String getMotor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMotor(String motor) {
		this.motor = motor;
	}

	@Override
	public String getCombustivel() {
		return combustivel;
	}

	@Override
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public boolean paraDeficienteFisico() {
		return paraDeficienteFisico;
	}

	@Override
	public void setParaDeficienteFisico(boolean deficienteFisico) {
		this.paraDeficienteFisico = deficienteFisico;
	}

	@Override
	public String toString() {
		return "Carro [rodaReserva=" + rodaReserva + ", portas=" + portas + ", "
				+ (motor != null ? "motor=" + motor + ", " : "") + (modelo != null ? "modelo=" + modelo + ", " : "")
				+ (combustivel != null ? "combustivel=" + combustivel + ", " : "") + "paraDeficienteFisico="
				+ paraDeficienteFisico + "]";
	}

	

}
