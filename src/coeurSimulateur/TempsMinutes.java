package coeurSimulateur;

import fourmiliere.Fourmiliere;

public class TempsMinutes {
	
	int minutes;
	
	
	public TempsMinutes(){
		
		int minutes=0;
		
	}
	
	int getMinutes() {
		
		return minutes;
	}
	
	
	public String incrementeMinute(Fourmiliere f){
		
		String s=null;
		minutes++;
		if(minutes>=1440) {
			s=f.temps.stepFourmiliere(f);
			minutes=0;
		}
			
		return s;
		
	}
	
}
