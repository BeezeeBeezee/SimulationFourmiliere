package fourmiliere;

import java.util.ArrayList;
import java.util.List;


public class Terrain {
	
	private List<Pheromone> lesPheromones;
	private int pourcentageGauche;
	private int pourcentageDroite;
	private int pourcentageHaut;
	private int pourcentageBas;
	private int nombrePheromonesCote;
	
	public Terrain() {
		lesPheromones = new ArrayList<Pheromone>(); // Liste de tous les phéromones présents sur le Terrain
		this.pourcentageGauche = 25;
		this.pourcentageDroite = 25;
		this.pourcentageHaut = 25;
		this.pourcentageBas = 25;	
		this.nombrePheromonesCote = 0;
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
		boolean pheromoneAGauche = false;
		boolean pheromoneADroite = false;
		boolean pheromoneEnHaut = false;
		boolean pheromoneEnBas = false;
		
		nombrePheromonesCote = 0;
		
		for(int i = 0; i < lesPheromones.size(); i++) {
			if((fourmi.getX() < this.lesPheromones.get(i).getX()) && (fourmi.getY() < this.lesPheromones.get(i).getY())){
				// Fourmi en haut à gauche du pheromone
				if(fourmi.getX() - this.lesPheromones.get(i).getX() > fourmi.getY() - this.lesPheromones.get(i).getY()) {
					pheromoneAGauche = true;
					nombrePheromonesCote++;
				} else {
					pheromoneEnHaut = true;
					nombrePheromonesCote++;
				}		
			}
			else if((fourmi.getX() < this.lesPheromones.get(i).getX()) && (fourmi.getY() > this.lesPheromones.get(i).getY())){
				// Fourmi en bas à gauche du pheromone
				if(fourmi.getX() - this.lesPheromones.get(i).getX() > this.lesPheromones.get(i).getY() - fourmi.getY()) {
					pheromoneAGauche = true;
					nombrePheromonesCote++;
				} else {
					pheromoneEnBas = true;
					nombrePheromonesCote++;
				}
			}
			else if((fourmi.getX() > this.lesPheromones.get(i).getX()) && (fourmi.getY() < this.lesPheromones.get(i).getY())){
				// Fourmi en haut à droite du pheromone
				if(this.lesPheromones.get(i).getX() - fourmi.getX() > fourmi.getY() - this.lesPheromones.get(i).getY()) {
					pheromoneADroite = true;
					nombrePheromonesCote++;
				} else {
					pheromoneEnHaut = true;
					nombrePheromonesCote++;
				}
			}
			else if((fourmi.getX() > this.lesPheromones.get(i).getX()) && (fourmi.getY() > this.lesPheromones.get(i).getY())){
				// Fourmi en bas à droite du pheromone
				if(this.lesPheromones.get(i).getX() - fourmi.getX() > this.lesPheromones.get(i).getY() - fourmi.getY()) {
					pheromoneADroite = true;
					nombrePheromonesCote++;
				} else {
					pheromoneEnBas = true;
					nombrePheromonesCote++;
				}
			}				
		}
		
		// S'il n'y a qu'un seul Pheromone présent dans la collection
		if(nombrePheromonesCote == 1) {
			this.pourcentageGauche = 20;
			this.pourcentageDroite = 20;
			this.pourcentageHaut = 20;
			this.pourcentageBas = 20;
		
			if (pheromoneADroite == true) {
				this.pourcentageDroite = 40;	
			}
			if (pheromoneAGauche == true) {
				this.pourcentageGauche = 40;	
			}
			if (pheromoneEnHaut == true) {
				this.pourcentageHaut = 40;
			}
			if (pheromoneEnBas == true) {
				this.pourcentageBas = 40;
			}
		}
		
		// S'il n'y a que deux phéromones ou que les deux indiquent la même direction
		else if(nombrePheromonesCote == 2) {
			this.pourcentageGauche = 15;
			this.pourcentageDroite = 15;
			this.pourcentageHaut = 15;
			this.pourcentageBas = 15;
			
			if (pheromoneAGauche == true) {
				this.pourcentageGauche = 35;			
			}
			if (pheromoneADroite == true) {
				this.pourcentageDroite = 35;
			}
			if (pheromoneEnHaut == true) {
				this.pourcentageHaut = 35;
			}
			if (pheromoneEnBas == true) {
				this.pourcentageBas = 35;
			}
		}
		
		// S'il y  a trois Pheromones pointant vers trois directions différentes
		else if(nombrePheromonesCote == 3) {
			this.pourcentageGauche = 10;
			this.pourcentageDroite = 10;
			this.pourcentageHaut = 10;
			this.pourcentageBas = 10;
			
			if (pheromoneAGauche == true) {
				this.pourcentageGauche = 30;			
			}
			if (pheromoneADroite == true) {
				this.pourcentageDroite = 30;
			}
			if (pheromoneEnHaut == true) {
				this.pourcentageHaut = 30;
			}
			if (pheromoneEnBas == true) {
				this.pourcentageBas = 30;
			}
		}
		// Si il y a 4 Pheromones qui pointent vers les 4 directions différentes, les pourcentages ne sont pas modifiés
	}

	
	/**
	 * Méthode qui permet à la fourmi de se mouvoir
	 **/
	public void seDeplacer(Fourmi fourmi) {
		this.pourcentageGauche = 25;
		this.pourcentageDroite = 25;
		this.pourcentageHaut = 25;
		this.pourcentageBas = 25;
		
		int probaDeplacement =  (int) (Math.random() * 99 + 1);
		int nouvPos;
		
		verifierPheromones(fourmi);
		
		if ((probaDeplacement > 0) && (probaDeplacement < this.pourcentageGauche)) { //Deplacement à gauche		
			nouvPos = fourmi.getX() - 10;
			if (nouvPos < 0) {
				nouvPos = 0;
			}
			fourmi.setX(nouvPos);
		}
		
		else if ((probaDeplacement > this.pourcentageGauche - 1 ) && (probaDeplacement < this.pourcentageGauche + this.pourcentageDroite)) { //Deplacement à droite
			nouvPos = fourmi.getX() + 10;
			if (nouvPos > 600) {
				nouvPos = 600;
			}
			fourmi.setX(nouvPos);
		}
		
		else if ((probaDeplacement > this.pourcentageGauche + this.pourcentageDroite -1 ) && (probaDeplacement < this.pourcentageGauche + this.pourcentageDroite + this.pourcentageBas)) { //Deplacement vers le bas
			nouvPos = fourmi.getY() + 10;
			if (nouvPos > 600) {
				nouvPos = 600;
			}
			fourmi.setY(nouvPos);
		}		
		else { //Deplacement vers le haut
			nouvPos = fourmi.getY() - 10;
			if (nouvPos < 0) {
				nouvPos = 0;
			}
			fourmi.setY(nouvPos);
		}
	}

	public List<Pheromone> getLesPheromones() {
		return lesPheromones;
	}

	public int getPourcentageGauche() {
		return pourcentageGauche;
	}

	public int getPourcentageDroite() {
		return pourcentageDroite;
	}

	public int getPourcentageHaut() {
		return pourcentageHaut;
	}

	public int getPourcentageBas() {
		return pourcentageBas;
	}

	public int getNombrePheromonesCote() {
		return nombrePheromonesCote;
	}
	
	
	
}
