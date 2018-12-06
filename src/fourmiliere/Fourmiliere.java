package fourmiliere;

import java.util.ArrayList;

public class Fourmiliere {
	
	
	private double quantiteNourriture;
	private Fourmi laReine;
	private Reine roleReine;
	private ArrayList<Fourmi> listeFourmis;
	private Depot depot;

	
	
	public Fourmiliere(){
		quantiteNourriture=0;
		listeFourmis = new ArrayList<Fourmi>();

		laReine= new Fourmi(this);
		Adulte adulteReine=new Adulte(laReine);
		laReine.setEtape(adulteReine);
		roleReine= new Reine(adulteReine);
		adulteReine.setRole(roleReine);
		this.depot = new Depot();
	}
	
	public Role getRoleReine() {
		return roleReine;
	}
	
	public Depot getDepot() {
		return depot;
	}

	public Fourmi getlaReine() {
		return laReine;
	}
	
	public void step() {
		laReine.step();
		
		for(int i=0;i<=listeFourmis.size()-1;i++) {		
			listeFourmis.get(i).setIn(true);
			if(listeFourmis.get(i).getVivant()) {
				listeFourmis.get(i).step();
			}
		}
		
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
	
	
	public int getSize() {
		return listeFourmis.size();
	}
	
	public Fourmi getElement(int index) {
		return listeFourmis.get(index);
	}
	
	public int indexOfListe(Fourmi f) {
		return listeFourmis.indexOf(f);
	}
	
	
	
	public double pourcentageDeMort() {
		
		int nbMort=0;
		
		for(int i=0;i<=listeFourmis.size()-1;i++) {
			if (listeFourmis.get(i).isIn()==true && listeFourmis.get(i).getVivant()==false)
				nbMort++;
		}
		
		if (listeFourmis.size() !=0)
			return (double)nbMort/listeFourmis.size();
		
		else return -1;
	}
	
/*	public double pourcentageDeMort() {
		int nbMort = 0;
		
		if(listeFourmis.isEmpty()) return 0;
		for(Fourmi fourmi :listeFourmis) {
			if(fourmi.isIn() && fourmi.getVivant()) {
				nbMort++;
			}
		}
		if( listeFourmis.size() != 0 ) {
			return nbMort/listeFourmis.size();
		}
		return 0;
	}
	*/
	
	public void isGonnaDie() {
		for(int i=0;i<=this.listeFourmis.size()-1;i++) {
			listeFourmis.get(i).isGonnaDie();
		}
	}
	
	
	public void incrementAge() {
		for(int i=0;i<=this.listeFourmis.size()-1;i++) {
			listeFourmis.get(i).incrementAge();
		}
	}

	@Override
	public String toString() {
		return "FOURMILIERE: "
				+ "\nQuantite Nourriture: " + quantiteNourriture 
				+ "\nLa Reine: [" + laReine
				+ "\n\nFourmis: " + listeFourmis 
				+ "\n\nDepot : " + depot;
	}
}
