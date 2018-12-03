package Fourmiliere;

public class Fourmi {
	private int id = 0;
	int idFourmi;
	int age; //Jour
	double poids; 
	double quantiteNourritureMange;
	
	Sexe sexe;
	Etat etat; //Vivant ou Mort
	Etape etape;	
	
	public Fourmi(){
		idFourmi = id;
		id++;                                                                                                                                                                                                                      
		age = 0;
		poids = 0.1; //mg
		quantiteNourritureMange = Math.random() * (0 - 1);
		sexe = sexe.FEMELLE;
	}
	
	public void evolution() {
		
	}
	
	public void isGonnaDie() {
		
	}
	
	
}
