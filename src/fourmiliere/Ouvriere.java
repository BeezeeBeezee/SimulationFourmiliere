package fourmiliere;

public class Ouvriere extends Role{
	
	
	public Ouvriere(Adulte adulte) {
		super(adulte);
	}
	
	
	public void travaille() {
		
		int leRandom=(int) (Math.random()*100 + 1);
		
		if(leRandom<80) {
			// chasser();
		}
		
		else {
			//reste
		}
	
	}
	

	

	public String toString() {
		
		return "ouvriere";
		
	}
	
	
	
	
}
