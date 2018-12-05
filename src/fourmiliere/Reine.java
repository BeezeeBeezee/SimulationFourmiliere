package fourmiliere;

public class Reine extends Role{
	
	
	public Reine(Adulte a){
		super(a);	
	}
	
	public void travaille() {
		pond();
	}
	
	public void pond() {
		Fourmi laFourmi= new Fourmi(this.adulte.fourmi.fourmiliere);
		this.adulte.fourmi.fourmiliere.addListe(laFourmi);
		laFourmi.setId(this.adulte.fourmi.fourmiliere.indexOfListe(laFourmi));
	} 

	public String toString() {
		return " ( Reine )";
	}
}