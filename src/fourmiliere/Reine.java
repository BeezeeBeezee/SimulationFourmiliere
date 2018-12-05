package fourmiliere;

public class Reine extends Role{
	
	public Reine(){
		super();
	}
	
	
	
	public void travaille(Fourmiliere f) {
		nourrir(f);
	}
	
	public void pond(Fourmiliere f) {
		
		Fourmi laFourmi= new Fourmi();
		f.addListe(laFourmi);
		laFourmi.setId(f.indexOfListe(laFourmi));	

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
	

	

}
