package Fourmiliere;

import java.util.Random;

public class Fourmi {
	private int incrementId = 0;
	
	public int id;
	private int age;
	private boolean sexe;
	private Boolean vivant;
	private Etape etape;
	
	/*
	 * Creation d'une fourmi
	 */
	public Fourmi(){
		id = incrementId;
		id++;                                                                                                                                                                                                                      
		age = 0;
		vivant = true;
		this.setSexeRandom();
	}
	
	
	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	/*
	 * Vieillissement d'une fourmi d'un jour
	 */
	public void incrementAge() {
		this.age++;
	}

	public boolean getSexe() {
		return sexe;
	}

	public boolean getVivant() {
		return vivant;
	}
	
	private void setVivant(Boolean vivant) {
		this.vivant = vivant;
	}

	public Etape getEtape() {
		return etape;
	}

	public void setEtape(Etape etape) {
		this.etape = etape;
	}

	private void setSexeRandom() {
		Random random = new Random();
		this.sexe = random.nextBoolean();
	}
	
	public double getResteAManger() {
		return etape.getResteAManger();
	}
	
	/*
	 * 
	 */
	public boolean mange(double aEteMange) {
		return etape.mange(aEteMange); 
	}

	//TODO
	public void evolution() {
		
	}
	
	//TODO
	public void isGonnaDie() {
		
	}
}
