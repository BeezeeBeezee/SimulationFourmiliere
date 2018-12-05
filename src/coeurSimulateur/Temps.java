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


				
				int leRandom=(int) (Math.random()*5 + 1);
				
				if(leRandom==2)
				ponte.pond(laFour);
				
				if(leRandom==3) {
					ponte.pond(laFour);
					ponte.pond(laFour);
				
				}

		
				for (int j = 0; j <= laFour.getSize() - 1; j++) {
					
					laFour.nourrir();
					
					laFour.getElement(j).isGonnaDie();
					
					stepFourmi(laFour.getElement(j));
				}			
			
			leTemps++;
			
		}

	/**
	 * fait grandir une fourmi de x jours
	 * 
	 * @param f
	 * @param time
	 */
	void stepFourmi(Fourmi f) {

		f.incrementAge();
		
		
	}
	
	
	
	

}
