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
	
		laFour.step();
		laFour.nourrir();			
		laFour.isGonnaDie();				
		laFour.incrementAge();		
		leTemps++;
			
	}


		

}
