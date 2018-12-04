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
		Adulte adulteReine=new Adulte();
		laReine.setEtape(adulteReine);
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
	
	
	public boolean nourrir(Fourmi f, Fourmiliere laFourmiliere) {
		boolean resultat = false;
		
		double quantite=laFourmiliere.getQuantiteNourrirture();	
		if(!(f.getVivant())) {
			resultat = false;
		}
		
		if (quantite>0 && f.getResteAManger()>0) {
			if(quantite<=f.getResteAManger()) {
				f.mange(quantite);
				laFourmiliere.setQuantiteNourriture(0);
				resultat = true;
			} else {
				
				laFourmiliere.setQuantiteNourriture(quantite-f.getResteAManger());
				f.mange(f.getResteAManger());

				resultat = true;			
			}
		}
		return resultat;	
	}
	
	public void nourrir(Fourmiliere laFourmiliere){
		
		for(int i=0;i<=laFourmiliere.listeFourmis.size()-1;i++) {
			
			nourrir(laFourmiliere.listeFourmis.get(i), laFourmiliere);
		}
				
	} 
	
	
	
}
