package fourmiliere;

import java.util.HashMap;
import java.util.Map;

public class Terrain {

	private Case[][] lesCases;
	
	private Map<Integer, Integer> lesPheromones;
	
	public Terrain() {
		lesPheromones = new HashMap<Integer, Integer>();
	}
	
	public boolean ajouterPheromone() {
		return false;
	}
	
	public void seDeplacer(Fourmi fourmi) {
		int probaDeplacement =  (int) (Math.random() * 99 + 1);
		int nouvPos;
		
		if ((probaDeplacement > 0) && (probaDeplacement < 25)) { //Deplacement à gauche
			nouvPos = fourmi.getX() - 1;
			if (nouvPos < 0) {
				nouvPos = 0;
			}
			fourmi.setX(nouvPos);
		}
		
		if ((probaDeplacement > 24) && (probaDeplacement < 50)) { //Deplacement à droite
			nouvPos = fourmi.getX() + 1;
			if (nouvPos > 600) {
				nouvPos = 600;
			}
			fourmi.setX(nouvPos);
		}
		
		if ((probaDeplacement > 49) && (probaDeplacement < 75)) { //Deplacement vers le bas
			nouvPos = fourmi.getY() + 1;
			if (nouvPos > 600) {
				nouvPos = 600;
			}
			fourmi.setY(nouvPos);
		}
		
		if ((probaDeplacement > 74) && (probaDeplacement < 100)) { //Deplacement vers le haut
			nouvPos = fourmi.getY() - 1;
			if (nouvPos < 0) {
				nouvPos = 0;
			}
			fourmi.setY(nouvPos);
		}
	}
	
}
