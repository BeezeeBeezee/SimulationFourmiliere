package fourmiliere;

public class Reine extends Role{
	
	/**
	 * Constructeur de la Reine associé à l'Adulte
	 * @param a l'Adulte a associé
	 */
	public Reine(Adulte a){
		super(a);	
		this.identificateur = 7;
	}
	
	/**
	 * La reine pond
	 */
	public void travaille() {
		this.pond();
	}
	
	/**
	 * Methode permettant à la Reine de pondre un Oeuf
	 * et de le rajouter dans la fourmiliere
	 */
	private void pond() {	
		//System.out.print("je ponds");
		if( (this.adulte.fourmi.fourmiliere.temps.lireLeTemps()%365) <= 92 ) {
			//System.out.print("je ponds");
			Fourmi laFourmi= new Fourmi(this.adulte.fourmi.fourmiliere);
			this.adulte.fourmi.fourmiliere.addListe(laFourmi);
			laFourmi.setId(this.adulte.fourmi.fourmiliere.indexOfListe(laFourmi));
		}
	} 

	public String toString() {
		return " ( Reine )";
	}
}