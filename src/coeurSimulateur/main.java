package coeurSimulateur;

import java.util.concurrent.TimeUnit;

import fourmiliere.Fourmiliere;

public class main {

	public static void main(String[] args) {
	
		Temps temps = new Temps();
		Fourmiliere f = new Fourmiliere();
		f.setQuantiteNourriture(1000);

		
		while(true) {
			
			System.out.println("\n\n----------Jour "+temps.lireLeTemps()+"---------------");
			temps.stepFourmiliere(f);
			
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
