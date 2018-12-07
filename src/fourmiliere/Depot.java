package fourmiliere;

import java.util.ArrayList;
import java.util.List;

public class Depot {

	private List<Animal> lesCadavres; // Liste des fourmis et proies mortes
	
	public Depot() {	
		this.lesCadavres = new ArrayList<Animal>();
	}
	
	public boolean ajouterCadavre(Animal unAnimal) {
		return this.lesCadavres.add(unAnimal);
	}
	
	public boolean supprimerCadavre(Animal unAnimal) {
		for (int i = 0; i < this.lesCadavres.size(); i++) {
			if(this.lesCadavres.get(i).equals(unAnimal)) {
				return this.lesCadavres.remove(unAnimal);
			}
		}
		return false;
	}

	public List<Animal> getLesCadavres() {
		return this.lesCadavres;
	}

	@Override
	public String toString() {
		String res = "[ ";
		
		for(Animal a : lesCadavres) {
			res += a.toString() + " ; ";
		}
		return res + "]";
	}
	
	public int getSizeDeCadavres() {
		return this.lesCadavres.size();
	}
}
