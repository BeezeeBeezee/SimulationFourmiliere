package fourmiliere;

public class Sexue extends Role{
	
	Sexue(Adulte adulte){
		super(adulte);
	}

	public String toString() {
		return "[ Sexue ]";
	}
	
	public void travaille() {}
}