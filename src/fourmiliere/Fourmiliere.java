package fourmiliere;

import java.util.ArrayList;

public class Fourmiliere {
	
	
	private double quantiteNourriture;
	String nomFourmiliere;
	public ArrayList<Fourmi> listeFourmis = new ArrayList<Fourmi>();

	
	
	public double getQuantiteNourrirture() {
		return this.quantiteNourriture;
	}
	
	void setQuantiteNourriture(double nouvelleQuantite) {
		
		this.quantiteNourriture=nouvelleQuantite;
		
	}
	
	
}
