package it.polito.tdp.bar.model;

public class Tavolo {
	private int dimensione;
	private boolean libero;
	
	public Tavolo(int dimensione, boolean libero) {
		super();
		this.dimensione = dimensione;
		this.libero = libero;
	}

	public int getDimensione() {
		return dimensione;
	}

	public void setDimensione(int dimensione) {
		this.dimensione = dimensione;
	}

	public boolean isLibero() {
		return libero;
	}

	public void setLibero(boolean libero) {
		this.libero = libero;
	}
	
	

}
