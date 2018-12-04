package fourmiliere;

public class Ouvriere extends Role{
	
	
	public Ouvriere() {
		
	}
	
	
	public boolean nourrir(Fourmi f, Fourmiliere laFourmiliere) {
		boolean resultat = false;
		
		double quantite=laFourmiliere.getQuantiteNourrirture();	
		if(!(f.getVivant())) {
			resultat = false;
		}
		
		if (quantite>0 && f.getResteAManger()>0) {
			if(quantite<=f.getResteAManger()) {
				f.mange(quantite);
				quantite=0;
				resultat = true;
			} else {
				f.mange(f.getResteAManger());
				quantite=quantite-f.getResteAManger();
				resultat = true;			
			}
		}
		return resultat;	
	}
	
	public void nourrir(Fourmiliere laFourmiliere){
				
		for(int i=0;i<=laFourmiliere.listeFourmis.size()-1;i++) {
			
			nourrir(laFourmiliere.listeFourmis.get(i), laFourmiliere);
		}
				
	}
	

}
