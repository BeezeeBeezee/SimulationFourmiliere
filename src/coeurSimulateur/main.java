package coeurSimulateur;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class main {

	public static void main(String[] args) {
	
	
		
		int nbJours=0;
		
		Temps test = new Temps();	
		
		Fourmiliere f= new Fourmiliere();
		
		f.setQuantiteNourriture(150);
		double laBouffe=f.getQuantiteNourrirture();
		
		while(true) {
			
			test.stepFourmiliere(f);
			
			
			System.out.println("----------jour"+nbJours+"---------------");
			System.out.println("quantite bouffe:"+laBouffe);
			
			for(int i=0;i<=f.listeFourmis.size()-1;i++) {
				
				
				System.out.println(f.listeFourmis.get(i));
				

			}
			
			System.out.println();
			
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			nbJours++;
		}
		
		
	}

}
