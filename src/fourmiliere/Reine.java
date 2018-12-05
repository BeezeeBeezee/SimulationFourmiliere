package fourmiliere;

public class Reine extends Role{
	
	public Reine(){
		super();
	}
	
	
	public void pond(Fourmiliere f) {
		
		Fourmi laFourmi= new Fourmi();
		f.addListe(laFourmi);
		laFourmi.setId(f.indexOfListe(laFourmi));	

	}
	

	

	

}
