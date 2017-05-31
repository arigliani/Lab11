package it.polito.tdp.bar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import it.polito.tdp.bar.model.Event.EventType;

public class Simulator {
     //parametri di simulazione
	private int NT=15;
	

	private int TRAVEL_MIN_TIME = 60 ; // 1 ora
	private int TRAVEL_MAX_NUM = 2 ; 
	
	//stato del modello
	private ArrayList<Tavolo> tavoliLiberi;
	
	//variabili di interesse
	private int numero_totale_clienti=0;
	private int numero_clienti_soddisfatti=0;
	private int numero_clienti_insoddisfatti=0;
	
	
	//lista degli eventi
	PriorityQueue<Event> queue ;
	
	public Simulator(){
		super();
		tavoliLiberi=this.inizializzaLiata();
		this.queue = new PriorityQueue<>();
		
	}
	
	
	private ArrayList<Tavolo> inizializzaLiata() {
		int i=0;
		while(i<2){
			Tavolo temp= new Tavolo(10, false);
			this.tavoliLiberi.add(temp);
			i++;
			
		}
		i=0;
		while(i<4){
			Tavolo temp= new Tavolo(8, false);
			this.tavoliLiberi.add(temp);
			Tavolo temp1= new Tavolo(6, false);
			this.tavoliLiberi.add(temp1);
			i++;
			
		}
		while(i<5){
			Tavolo temp= new Tavolo(4, false);
			this.tavoliLiberi.add(temp);
			i++;
			
		}
		return this.tavoliLiberi;
	}


	public void addGruppo(){
		for(int i=0; i<2000; i++){
			int time=9*(int)(Math.random())+1;
			
			queue.add(new Event(time, EventType.ARRIVO_GRUPPO_CLIENTI));
		}
		this.run();
	}
	
	public void run(){
		while(!queue.isEmpty()){
			Event e = queue.poll() ;
			switch(e.getType()){
			case ARRIVO_GRUPPO_CLIENTI:
			 //creare il gruppo con la funzione random per la tolleranza
				
				// modificare costruttore gruppo
				// scrivere attesa del gruppo
				// verificare tavolo libero
				//verificare se bancone
				// verificare se bancone o meno
				
			
			
					break ;
			}
		}
	}


	public int getTRAVEL_MIN_TIME() {
		return TRAVEL_MIN_TIME;
	}


	public void setTRAVEL_MIN_TIME(int tRAVEL_MIN_TIME) {
		TRAVEL_MIN_TIME = tRAVEL_MIN_TIME;
	}


	public int getTRAVEL_MAX_NUM() {
		return TRAVEL_MAX_NUM;
	}


	public void setTRAVEL_MAX_NUM(int tRAVEL_MAX_NUM) {
		TRAVEL_MAX_NUM = tRAVEL_MAX_NUM;
	}


	public int getNumero_totale_clienti() {
		return numero_totale_clienti;
	}


	public void setNumero_totale_clienti(int numero_totale_clienti) {
		this.numero_totale_clienti = numero_totale_clienti;
	}


	public List<Tavolo> getTavoliLiberi() {
		return tavoliLiberi;
	}


	public int getNumero_clienti_soddisfatti() {
		return numero_clienti_soddisfatti;
	}


	public int getNumero_clienti_insoddisfatti() {
		return numero_clienti_insoddisfatti;
	}
	
}
	
	
