package coeurSimulateur;

import java.util.ArrayList;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class main {

	public static void main(String[] args) {
	
	
		

		
		Temps test = new Temps();	
		
		Fourmiliere f= new Fourmiliere();
		
		while(true) {
			
			test.stepFourmiliere(f);
			
			for(int i=0;i<=f.listeFourmis.size()-1;i++) {
				
				System.out.println(f.listeFourmis.get(i));
				
			}
			
		}
		
		
	}

}
