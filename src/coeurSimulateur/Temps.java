package coeurSimulateur;

import java.util.Scanner;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;
import fourmiliere.Reine;

public class Temps {

	int leTemps; // le temps est definit en jour

	Temps() {
		leTemps = 0;

	}

	int lireLeTemps() {

		Scanner leScan = new Scanner(System.in);
		int leTime = leScan.nextInt();

		return leTemps+leTime;

		
	}

	/**
	 * permet de demander de combien de jours faire avancer la simulation et de
	 * faire grandir les fourmis ainsi que de faire pondre un oeuf par jour
	 * 
	 * @param laFour
	 */
	void stepFourmiliere(Fourmiliere laFour) {

		
		int tempsFixe=leTemps;
		
		Reine ponte = (Reine) laFour.getRoleReine();


				ponte.pond(laFour);
		
				for (int j = 0; j <= laFour.listeFourmis.size() - 1; j++) {
					
					laFour.nourrir();
					
					laFour.listeFourmis.get(j).isGonnaDie();
					
					stepFourmi(laFour.listeFourmis.get(j),1);
				}			
			
			leTemps++;
			
		}

	/**
	 * fait grandir une fourmi de x jours
	 * 
	 * @param f
	 * @param time
	 */
	void stepFourmi(Fourmi f, int time) {

		f.ajoutAge(time);
		
	}
	
	
	
	

}
