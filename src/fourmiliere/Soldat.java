package fourmiliere;

public class Soldat extends Role{

	Soldat(Adulte adulte){
		super(adulte);
	}
	
	
	public void travaille() {}
	
	public String toString() {
		return " soldat";
	}
	
}
