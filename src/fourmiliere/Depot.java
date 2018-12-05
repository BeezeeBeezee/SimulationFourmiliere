package fourmiliere;

import java.util.ArrayList;
import java.util.List;

public class Depot {

	private List<Animal> lesCadavres;
	
	public Depot() {	
		lesCadavres = new ArrayList<Animal>();
	}
	
	public boolean ajouterCadavre(Animal unAnimal) {
		return lesCadavres.add(unAnimal);
	}
	
	public boolean supprimerCadavre(Animal unAnimal) {
		for (int i = 0; i < lesCadavres.size(); i++) {
			if(lesCadavres.get(i).equals(unAnimal)) {
				return lesCadavres.remove(unAnimal);
			}
		}
		return false;
	}

	public List<Animal> getLesCadavres() {
		return lesCadavres;
	}	
}
