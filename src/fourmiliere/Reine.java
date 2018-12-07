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