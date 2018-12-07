package fourmiliere;

public class Reine extends Role{
	
	
	public Reine(Adulte a){
		super(a);	
		this.identificateur = 7;
	}
	
	public void travaille() {
		this.pond();
	}
	
	public void pond() {
		if( (this.adulte.fourmi.fourmiliere.temps.lireLeTemps()%365) <= 92 ) {
			Fourmi laFourmi= new Fourmi(this.adulte.fourmi.fourmiliere);
			this.adulte.fourmi.fourmiliere.addListe(laFourmi);
			laFourmi.setId(this.adulte.fourmi.fourmiliere.indexOfListe(laFourmi));
		} else {
			System.out.println("NON POND");
		}
	} 

	public String toString() {
		return " ( Reine )";
	}
}