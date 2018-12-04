package coeurSimulateur;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class main {

	public static void main(String[] args) {
		
		Temps test = new Temps();	
		
		Fourmiliere f= new Fourmiliere();
		
		test.stepFourmiliere(f);
		
		
	}

}
