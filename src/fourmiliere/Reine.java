package fourmiliere;

public class Reine extends Role{
	
	public Reine(){
		super();
	}
	
	
	public void pond(Fourmiliere f) {
		
		Fourmi laFourmi= new Fourmi(0);
		f.listeFourmis.add(laFourmi);
		laFourmi.setId(f.listeFourmis.indexOf(laFourmi));	

	}

}
