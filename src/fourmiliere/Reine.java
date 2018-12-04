package fourmiliere;

public class Reine extends Role{
	
	public Reine(){
		
		super();
	}
	
	
	public Fourmi pond(Fourmiliere f) {
		
		Fourmi laFourmi= new Fourmi();
		f.listeFourmis.add(laFourmi);
		
		return laFourmi;
		
	}

}
