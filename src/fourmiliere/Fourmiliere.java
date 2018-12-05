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
	
	
	public boolean nourrir(Fourmi f) {

		
		if(!(f.getVivant())) 
			return false;
		
		if (quantiteNourriture>0 && f.getResteAManger()>0) {
				
			if(quantiteNourriture<=f.getResteAManger()) {
					f.mange(quantiteNourriture);
					this.setQuantiteNourriture(0);
					return true;
			} else {
					
				this.setQuantiteNourriture(quantiteNourriture-f.getResteAManger());
				f.mange(f.getResteAManger());
	
				return true;			
			}
							
		}
		
		return false;
	}
	
	
	public void nourrir(){
		
		for(int i=0;i<=this.listeFourmis.size()-1;i++) {
			
			nourrir(this.listeFourmis.get(i));
		}
				
	} 
	
	
	public boolean addListe(Fourmi f) {
		return listeFourmis.add(f);
	}
	
	public boolean remove(Fourmi f) {
		return listeFourmis.remove(f);
	}
	
	public boolean contains(Fourmi f) {
		return listeFourmis.contains(f);
	}
	
	public ArrayList<Fourmi> getListe() {
		
		return listeFourmis;
	}
	
}
