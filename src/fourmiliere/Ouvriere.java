package fourmiliere;

public class Ouvriere extends Role{
	
	
	public Ouvriere() {
		
		super();
		
	}
	
	
	public void travaille() {
		
		int leRandom=(int) (Math.random()*100 + 1);
		
		if(leRandom<80) {
			// chasser();
		}
		
		else {
			nourrir(f);
		}
	
	}
	
	public boolean nourrir(Fourmi f, Fourmiliere fourm) {

		double quantiteNourriture= fourm.getQuantiteNourrirture();
		
		if(!(f.getVivant())) 
			return false;
		
		if (quantiteNourriture>0 && f.getResteAManger()>0) {
				
			if(quantiteNourriture<=f.getResteAManger()) {
					f.mange(quantiteNourriture);
					fourm.setQuantiteNourriture(0);
					return true;
			} else {
					
				fourm.setQuantiteNourriture(quantiteNourriture-f.getResteAManger());
				f.mange(f.getResteAManger());
	
				return true;			
			}
							
		}
		
		return false;
	}
	
	public void nourrir(Fourmiliere fourm){
		
		for(int i=0;i<=fourm.getSize()-1;i++) {
			
			nourrir(fourm.getElement(i), fourm);
		}
				
	} 
	

	public String toString() {
		
		return "ouvriere";
		
	}
	
	
	
	
}
