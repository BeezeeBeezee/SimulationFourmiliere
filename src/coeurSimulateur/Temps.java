package coeurSimulateur;

import java.util.Scanner;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class Temps {
	
	int leTemps; // le temps est definit en jour
	
	Temps(Fourmiliere laFour) {
		leTemps=0;
		
	}
	
	int lireLeTemps() {
		
		Scanner leScan = new Scanner(System.in);
		int leTime= leScan.nextInt();
		this.leTemps=this.leTemps+leTime;
		
		return leTime;
		
	}
	
	
	
	void stepFourmiliere(Fourmiliere laFour) {
		
		
		
		
	}
	
	void stepFourmi(Fourmi f) {
		
		
		while(true) {
			int ancienTemps= leTemps;
			lireLeTemps();
			f.incrementAge();
			if(f.getAge()>3)
				f.evolution();
		}
		
	}
	
	
	

}
