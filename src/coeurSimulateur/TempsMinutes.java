package coeurSimulateur;

import fourmiliere.Fourmiliere;

public class TempsMinutes {
	
	int minutes;
	
	
	TempsMinutes(){
		
		int minutes=0;
		
	}
	
	int getMinutes() {
		
		return minutes;
	}
	
	
	void incrementeMinute(Fourmiliere f){
		
		minutes++;
		if(minutes>=1440)
			f.temps.stepFourmiliere(f);
		
		minutes=0;
		
		
	}
	

}
