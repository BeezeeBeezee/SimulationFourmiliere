package fourmiliere;

public class Ouvriere extends Role{
	
	
	public Ouvriere(Adulte adulte) {
		super(adulte);
	}
	
	
	public void travaille() {
		
		int leRandom=(int) (Math.random()*100 + 1);
		
		if(leRandom<80) {
			
			this.adulte.fourmi.setIn(false);
			
		}
		
		else {
			this.adulte.fourmi.setIn(true);
		}
	
	}
		
	public String toString() {
		
		return "ouvriere";
		
	}
	
	
	
	
}
