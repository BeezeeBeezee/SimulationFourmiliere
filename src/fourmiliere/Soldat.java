package fourmiliere;

public class Soldat extends Role{

	Soldat(Adulte adulte){
		super(adulte);
		this.identificateur = 5;
	}
	
	
	public void travaille() {
		
		this.adulte.fourmi.setIn(false);
		
		
	}
	
	public String toString() {
		return "[ Soldat ]";
	}
	
}
