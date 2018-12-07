package coeurSimulateur;

import java.util.ArrayList;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class Statistique {
	private Fourmiliere fourmiliere;
	private int nbFourmis;
	private int nbOeufs;
	private int nbLarves;
	private int nbNymphes;
	private int nbOuvriere;
	private int nbSoldat;
	private int nbSexue;
	private int nbMort;
	
	public Statistique(Fourmiliere fourmiliere) {
		this.fourmiliere = fourmiliere;
	}
	
	public void calculDesStatistique() {
		ArrayList<Fourmi> a = this.fourmiliere.getListe();
		this.clear();
		this.calculNbFourmi(a);
		this.calculReste(a);
		this.calculNbMort(a);
	}
	
	private void clear() {
		this.nbFourmis = 0;
		this.nbOeufs = 0;
		this.nbLarves = 0;
		this.nbNymphes = 0;
		this.nbOuvriere = 0;
		this.nbSoldat = 0;
		this.nbSexue = 0;
		this.nbMort = 0;
	}
	
	private void calculNbFourmi(ArrayList<Fourmi> a) {
		this.nbFourmis = this.fourmiliere.getSize();
	}
	
	private void calculReste(ArrayList<Fourmi> a) {
		for(Fourmi fourmi : a) {
			switch(fourmi.getEtape().identificateur) {
				case 1 : this.nbOeufs ++;
					break;
				case 2 : this.nbLarves ++;
					break;
				case 3 : this.nbNymphes ++;
					break;
				case 4 : this.nbOuvriere ++;
					break;
				case 5 : this.nbSoldat ++;
					break;
				case 6 : this.nbSexue ++;
					break;
				default:
					break;
			}
				
		}
	}
	
	private void calculNbMort(ArrayList<Fourmi> a) {
		for(Fourmi fourmi : a) {
			if(fourmi.getVivant() == false) {
				this.nbMort ++;
			}
		}
	}

	public int getNbFourmis() {
		return nbFourmis;
	}

	public int getNbOeufs() {
		return nbOeufs;
	}

	public int getNbLarves() {
		return nbLarves;
	}

	public int getNbNymphes() {
		return nbNymphes;
	}

	public int getNbOuvriere() {
		return nbOuvriere;
	}

	public int getNbSoldat() {
		return nbSoldat;
	}

	public int getNbSexue() {
		return nbSexue;
	}

	public int getNbMort() {
		return nbMort;
	}
}
