package fourmiliere;

public class Ouvriere extends Role{
	
	
	
	
	
	boolean nourrir(Fourmi f, Fourmiliere laFourmiliere) {
		
		double quantite=laFourmiliere.getQuantiteNourrirture();	
		if(!(f.getVivant()))
			return false;
		
		
		if (quantite>0 && f.getResteAManger()>0)
			
			
			if(quantite<=f.getResteAManger()) {
				
				f.manger(quantite);
				quantite=0;
				return true;
				
				
			} else {
				
				f.manger(f.getResteAManger());
				quantite=quantite-f.getResteAManger();
				return true;
				
									
			}
				
	}
	
	void nourrir(Fourmiliere laFourmiliere){
		
		double quantite=laFourmiliere.getQuantiteNourrirture();
		
		for(int i=0;i<=laFourmiliere.listeFourmis.size()-1;i++) {
			
			nourrir(laFourmiliere.listeFourmis.get(i), laFourmiliere);
				
	}
	

}
