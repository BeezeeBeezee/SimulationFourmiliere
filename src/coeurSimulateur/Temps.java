package coeurSimulateur;

import java.util.Scanner;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;
import fourmiliere.Reine;

public class Temps {
	
	int leTemps; // le temps est definit en jour
	
	Temps() {
		leTemps=0;
		
	}
	
	int lireLeTemps() {
		
		Scanner leScan = new Scanner(System.in);
		int leTime= leScan.nextInt();
		this.leTemps=this.leTemps+leTime;
		
		return leTime;
		
	}
	
	
	
	void stepFourmiliere(Fourmiliere laFour) {
	
		Reine ponte=(Reine)laFour.getRoleReine();
		
		while(true) {
		
			int ancienTemps= leTemps;
			lireLeTemps();
			
			for(int i=0;i<=laFour.listeFourmis.size()-1;i++) {
				
				stepFourmi(laFour.listeFourmis.get(i)  ,  this.leTemps-ancienTemps);
				
			}
			
			for(int i=0;i<=this.leTemps-ancienTemps-1;i++) {
			
			
				ponte.pond(laFour);
			
			}
		}
		
	}
	
	void stepFourmi(Fourmi f, int time) {
		
		
			f.ajoutAge(time);
		
			System.out.println(f.toString());
		
	}
	
	
	

}
