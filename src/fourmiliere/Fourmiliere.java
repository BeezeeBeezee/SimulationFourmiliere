package fourmiliere;

import java.util.ArrayList;

public class Fourmiliere {
	
	
	private double quantiteNourriture;
	String nomFourmiliere;
	ArrayList<Fourmi> listeFourmis = new ArrayList<Fourmi>();

	
	
	double getQuantiteNourrirture() {
		return this.quantiteNourriture;
	}
	
	void setQuantiteNourriture(double nouvelleQuantite) {
		
		this.quantiteNourriture=nouvelleQuantite;
		
	}
	
	
}
