package coeurSimulateur;

import java.util.concurrent.TimeUnit;

import fourmiliere.Fourmiliere;

public class main {

	public static void main(String[] args) {
	
		Fourmiliere f = new Fourmiliere();
		TempsMinutes leTemps= new TempsMinutes();
		f.setQuantiteNourriture(2000);

		
		for(int i=1; i<=29;i++) {
			f.temps.stepFourmiliere(f);
		}
		
		
		while(true) {
			
		
			//System.out.println(f.toString());
			String s=leTemps.incrementeMinute(f);
		
				if(s!=null) {
				
				System.out.println("\n\n----------Jour "+f.temps.lireLeTemps()+"---------------"+ leTemps.getMinutes());
				System.out.println(s);
				
				try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
				}
		}	
	}
}
