package coeurSimulateur;

import java.util.concurrent.TimeUnit;

import fourmiliere.Fourmiliere;

public class main {

	public static void main(String[] args) {
	
		Fourmiliere f = new Fourmiliere();
		TempsMinutes leTemps= new TempsMinutes();
		f.setQuantiteNourriture(2000);

		
		while(true) {
			
			leTemps.incrementeMinute(f);
			
			//System.out.println(f.toString());
			String s=leTemps.incrementeMinute(f);
		
				if(s!=null) {
				
				System.out.println("\n\n----------Jour "+f.temps.lireLeTemps()+"---------------");
				System.out.println(s);
				
				try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
				}
		}	
	}
}
