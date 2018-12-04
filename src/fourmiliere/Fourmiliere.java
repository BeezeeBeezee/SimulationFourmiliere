package fourmiliere;

import java.util.ArrayList;

public class Fourmiliere {
	
	
	private double quantiteNourriture;
	int age;
	String nomFourmiliere;
	public ArrayList<Fourmi> listeFourmis;

	
	public Fourmiliere(){
		
		quantiteNourriture=0;
		age=0;
		listeFourmis = new ArrayList<Fourmi>();
		
	}
	
	
	public double getQuantiteNourrirture() {
		return this.quantiteNourriture;
	}
	
	public void setQuantiteNourriture(double nouvelleQuantite) {
		
		this.quantiteNourriture=nouvelleQuantite;
		
	}
	
	
}
