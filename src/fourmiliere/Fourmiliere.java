package fourmiliere;

import java.util.ArrayList;

public class Fourmiliere {
	
	
	private double quantiteNourriture;
	int age;
	String nomFourmiliere;
	Fourmi laReine;
	public ArrayList<Fourmi> listeFourmis;

	
	public Fourmiliere(){
		
		quantiteNourriture=0;
		age=0;
		listeFourmis = new ArrayList<Fourmi>();
		laReine= new Fourmi("une reine");
		Adulte adulteReine=(Adulte)laReine.getEtape();
		Reine roleReine= new Reine();
		adulteReine.setRole(roleReine);
		
		
	}
	
	
	public double getQuantiteNourrirture() {
		return this.quantiteNourriture;
	}
	
	public void setQuantiteNourriture(double nouvelleQuantite) {
		
		this.quantiteNourriture=nouvelleQuantite;
		
	}
	
	
}
