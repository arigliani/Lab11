package it.polito.tdp.bar.model;

public class Gruppo {
	private int numerosita;
	private float tolleranza;
	private int permanenza;
	
	public Gruppo(int numerosita, float tolleranza) {
		super();
		this.numerosita = numerosita;
		this.tolleranza = tolleranza;
	}
	/**
	 * true se 
	 * @return
	 */
	public float isBancone() {
		return tolleranza;
	}
	
	public void setBancone(float tolleranza) {
		this.tolleranza = tolleranza;
	}
	
	public int getNumerosita() {
		return numerosita;
	}
	
	

}
