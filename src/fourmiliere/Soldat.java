package fourmiliere;

public class Soldat extends Role{

	/**
	 * Constructeur de Soldat rattaché à un adulte
	 * @param adulte l'adulte en question
	 */
	Soldat(Adulte adulte){
		super(adulte);
		this.identificateur = 5;
	}
	
	/**
	 * Le Soldat part travaille à l'exterieur de la fourmiliere
	 */
	public void travaille() {
		this.adulte.fourmi.setIn(false);
	}
	
	public String toString() {
		return "[ Soldat ]";
	}
	
}
