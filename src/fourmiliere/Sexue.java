package fourmiliere;

public class Sexue extends Role{
	
	Sexue(Adulte adulte){
		super(adulte);
		this.identificateur = 6;
	}

	public String toString() {
		return "[ Sexue ]";
	}
	
	public void travaille() {
		if( (this.adulte.fourmi.fourmiliere.temps.lireLeTemps()%365) == 92) {
			this.adulte.fourmi.fourmiliere.remove(this.adulte.fourmi);
		}
	}
}