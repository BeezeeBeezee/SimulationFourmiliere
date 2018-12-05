package fourmiliere;

import java.util.ArrayList;
import java.util.List;


public class Terrain {
	
	private List<Pheromone> lesPheromones;
	private int pourcentageGauche;
	private int pourcentageDroite;
	private int pourcentageHaut;
	private int pourcentageBas;
	
	public Terrain() {
		lesPheromones = new ArrayList<Pheromone>();
		this.pourcentageGauche = 25;
		this.pourcentageDroite = 25;
		this.pourcentageHaut = 25;
		this.pourcentageBas = 25;
	}
	
	/**
	 * Méthode qui ajoute un Pheromone dans la collection de Pheromone
	 **/
	public void ajouterPheromone(Pheromone pheromone) {
		lesPheromones.add(pheromone);
	}
	
	/**
	 * Méthode qui supprime un Pheromone présent dans la collection de Pheromone
	 **/
	public void supprimerPheromone(Pheromone pheromone) {
		lesPheromones.remove(pheromone);	
	}
	
	/**
	 * Méthode qui vérifie les Pheromones afin d'ajuster les pourcentages de direction
	 **/
	public void verifierPheromones(Fourmi fourmi) {
		
		for (int i = 0; i < lesPheromones.size(); i++) {
			
		}
	}
	
	/**
	 * Méthode qui permet à la fourmi de se mouvoir
	 **/
	public void seDeplacer(Fourmi fourmi) {
		int probaDeplacement =  (int) (Math.random() * 99 + 1);
		int nouvPos;
		
		verifierPheromones(fourmi);
		
		if ((probaDeplacement > 0) && (probaDeplacement < this.pourcentageGauche)) { //Deplacement à gauche		
			nouvPos = fourmi.getX() - 1;
			if (nouvPos < 0) {
				nouvPos = 0;
			}
			fourmi.setX(nouvPos);
		}
		
		else if ((probaDeplacement > this.pourcentageGauche - 1 ) && (probaDeplacement < this.pourcentageGauche + this.pourcentageDroite)) { //Deplacement à droite
			nouvPos = fourmi.getX() + 1;
			if (nouvPos > 600) {
				nouvPos = 600;
			}
			fourmi.setX(nouvPos);
		}
		
		else if ((probaDeplacement > this.pourcentageGauche + this.pourcentageDroite -1 ) && (probaDeplacement < this.pourcentageGauche + this.pourcentageDroite + this.pourcentageBas)) { //Deplacement vers le bas
			nouvPos = fourmi.getY() + 1;
			if (nouvPos > 600) {
				nouvPos = 600;
			}
			fourmi.setY(nouvPos);
		}		
		else { //Deplacement vers le haut
			nouvPos = fourmi.getY() - 1;
			if (nouvPos < 0) {
				nouvPos = 0;
			}
			fourmi.setY(nouvPos);
		}
	}
	
}
