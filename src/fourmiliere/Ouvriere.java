package fourmiliere;

public class Ouvriere extends Role{
	
	
	public Ouvriere(Adulte adulte) {
		super(adulte);
		this.identificateur=4;
	}
	
	
	public void travaille() {
		
		int leRandom=(int) (Math.random()*100 + 1);
		
		if(leRandom<80) {
			
			this.adulte.fourmi.setIn(false);
			this.adulte.fourmi.fourmiliere.setQuantiteNourriture(this.adulte.fourmi.fourmiliere.getQuantiteNourrirture()+ Math.random()* 1 + 13);
			//this.adulte.fourmi.fourmiliere.setQuantiteNourriture(this.adulte.fourmi.fourmiliere.getQuantiteNourrirture()+ 1000);
			
		}
		
		else {
			this.adulte.fourmi.setIn(true);
		}
	
	}
		
	public String toString() {
		
		return "[ Ouvriere ]";
		
	}
	
	
	
	
}
