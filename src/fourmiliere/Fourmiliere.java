package fourmiliere;

import java.util.ArrayList;

public class Fourmiliere {
	
	
	private double quantiteNourriture;
	int age;
	String nomFourmiliere;
	Fourmi laReine;
	Adulte adulteReine;
	Reine roleReine;
	public ArrayList<Fourmi> listeFourmis;
	static int idFourmi = 0;

	
	
	public Fourmiliere(){
		
		quantiteNourriture=0;
		age=0;
		listeFourmis = new ArrayList<Fourmi>();

		laReine= new Fourmi();

		adulteReine=(Adulte)laReine.getEtape();
		roleReine= new Reine();
		adulteReine.setRole(roleReine);
		
		
	}
	
	public Role getRoleReine() {
		return roleReine;
	}
	
	public Adulte getAdulteReine() {
		return adulteReine;
	}
	
	public Fourmi getlaReine() {
		return laReine;
	}
	
	public void pond() {
		this.roleReine.pond(this);
	}
	
	
	public double getQuantiteNourrirture() {
		return this.quantiteNourriture;
	}
	
	public void setQuantiteNourriture(double nouvelleQuantite) {
		
		this.quantiteNourriture=nouvelleQuantite;
		
	}
	
}
