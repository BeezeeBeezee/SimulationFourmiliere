package fourmiliere;

import java.util.ArrayList;

import coeurSimulateur.Temps;
import coeurSimulateur.TempsMinutes;

public class Fourmiliere {
	
	
	private double quantiteNourriture;
	private Fourmi laReine;
	private Reine roleReine;
	private Adulte adulteReine;
	private ArrayList<Fourmi> listeFourmis;
	private Depot depot;
	public Temps temps;
	public TempsMinutes minutes;
	

	
	
	public Fourmiliere(){
		quantiteNourriture=0;
		listeFourmis = new ArrayList<Fourmi>();
		laReine= new Fourmi(this);
		adulteReine= new Adulte(laReine);
		roleReine= new Reine(adulteReine);
		laReine.setEtape(adulteReine);
		adulteReine.setRole(roleReine);
		this.depot = new Depot();
		this.temps = new Temps();
		this.minutes = new TempsMinutes();
	}
	

	
	public Depot getDepot() {
		return depot;
	}

	public Fourmi getlaReine() {
		return laReine;
	}

	/**
	 * Fait appel à la methode step de chaque fourmi.
	 * Condition: la fourmi doit être vivante
	 **/
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
	
	/**
	 * La méthode permet de nourrir un fourmi :
	 * - si elle est encore vivante
	 * - si elle doit encore mangé
	 * - si il reste de la nourriture dans la fourmiliere
	 * @param f la fourmi à nourrir
	 * @return true si elle a mange, false sinon
	 */
	private boolean nourrir(Fourmi f) {

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
	
	/**
	 * Appel de la fonction nourrir pour chaque fourmis présent dans la liste
	 */
	public void nourrir(){
		for(int i=0;i<=this.listeFourmis.size()-1;i++) {
			nourrir(this.listeFourmis.get(i));
		}
	} 
	
	/**
	 * Ajout d'une fourmi dans la liste.
	 * @param f la fourmi a ajoutée
	 * @return true si ajouté, false sinon
	 */
	public boolean addListe(Fourmi f) {
		return listeFourmis.add(f);
	}
	
	/**
	 * Suppresion d'une fourmi dans la liste.
	 * @param f la fourmi à supprimer
	 * @return true si supprimer, false sinon
	 */
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
	
	
	/**
	 * Calcul du pourcentage totale de fourmi mort présent dans la fourmiliere
	 * @return -1 si le calcul n'est pas possible, le pourcentage calculée sinon
	 */
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
	
	/**
	 * Parcourt de la liste fourmi, 
	 * puis appel de la fonction isGonnaDie() pour chaque fourmi.
	 */
	public void isGonnaDie() {
		for(int i=0;i<=this.listeFourmis.size()-1;i++) {
			listeFourmis.get(i).isGonnaDie();
		}
	}
	
	/**
	 * Appel de la fonction incrementAge() pour chaque fourmi
	 * présent dans la liste.
	 */
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
