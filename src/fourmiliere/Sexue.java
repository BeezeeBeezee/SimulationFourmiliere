package fourmiliere;

public class Sexue extends Role{
	
	Sexue(Adulte adulte){
		super(adulte);
	}

	public String toString() {
		return "[ Sexue ]";
	}
	
	public void travaille() {
		if( (this.adulte.fourmi.fourmiliere.temps.lireLeTemps()%365) == 300) {
			this.adulte.fourmi.fourmiliere.remove(this.adulte.fourmi);
		}
	}
}