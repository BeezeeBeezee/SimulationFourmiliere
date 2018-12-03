package coeurSimulateur;

import java.util.Scanner;

public class Temps {
	
	int leTemps;
	
	Temps() {
		leTemps=0;
		
	}
	
	int lireLeTemps() {
		
		Scanner leScan = new Scanner(System.in);
		int leTime= leScan.nextInt();
		this.leTemps=this.leTemps+leTime;
		
		return leTime;
		
	}
	
	
	
	
	
	

}
