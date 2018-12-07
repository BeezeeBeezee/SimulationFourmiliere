package fourmiliere;

public class Sexue extends Role{
	
	/**
	 * Constructeur de Sexue rattaché à un Adulte
	 * @param adulte l'adulte en question
	 */
	Sexue(Adulte adulte){
		super(adulte);
		this.identificateur = 6;
	}

	public String toString() {
		return "[ Sexue ]";
	}
	
	/**
	 * Le sexue commence à travaillé quand il part définitivement de la fourmiliere
	 */
	public void travaille() {
		if( (this.adulte.fourmi.fourmiliere.temps.lireLeTemps()%365) == 92) {
			this.adulte.fourmi.fourmiliere.remove(this.adulte.fourmi);
		}
	}
}