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

		return leTime;

	}

	/**
	 * permet de demander de combien de jours faire avancer la simulation et de
	 * faire grandir les fourmis ainsi que de faire pondre un oeuf par jour
	 * 
	 * @param laFour
	 */
	void stepFourmiliere(Fourmiliere laFour) {

		Reine ponte = (Reine) laFour.getRoleReine();

		while (true) {

			int ancienTemps = leTemps;
			int nvTemps=lireLeTemps();

			for (int i = 0; i <= nvTemps - ancienTemps - 1; i++) {

				ponte.pond(laFour);

			}

			for (int i = 0; i <= laFour.listeFourmis.size() - 1; i++) {

				stepFourmi(laFour.listeFourmis.get(i), this.leTemps+i);

			}

			
			leTemps=leTemps+nvTemps;
		}

	}

	/**
	 * fait grandir une fourmi de x jours
	 * 
	 * @param f
	 * @param time
	 */
	void stepFourmi(Fourmi f, int time) {

		f.ajoutAge(time);

		System.out.println(f.toString());
		
		leTemps=leTemps+time;

	}

}
