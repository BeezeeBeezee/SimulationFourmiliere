package fourmiliere;

public class Reine extends Role{
	
	public Reine(){
		super();
	}
	
	
	public void pond(Fourmiliere f) {
		
		Fourmi laFourmi= new Fourmi(0);
		f.listeFourmis.add(laFourmi);
<<<<<<< HEAD
		laFourmi.id=f.listeFourmis.indexOf(laFourmi);
		
		
=======
		return laFourmi;
>>>>>>> branch 'master' of https://github.com/BeezeeBeezee/SimulationFourmiliere.git
	}

}
