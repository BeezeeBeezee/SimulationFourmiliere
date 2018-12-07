package fourmiliere;

public class Ouvriere extends Role{
	
	
	public Ouvriere(Adulte adulte) {
		super(adulte);
		this.identificateur=4;
	}
	
	
	public void travaille() {
		
		int leRandom=(int) (Math.random()*100 + 1);
		
		if(leRandom<50) {
			
			this.adulte.fourmi.setIn(false);
			double nourriture=this.adulte.fourmi.fourmiliere.getQuantiteNourrirture()+ Math.random()* 1 + 30;
			this.adulte.fourmi.fourmiliere.setQuantiteNourriture(nourriture);
			
		}
		
		else {
			this.adulte.fourmi.setIn(true);
		}
	
	}
		
	public String toString() {
		
		return "[ Ouvriere ]";
		
	}
	
	
	
	
}
