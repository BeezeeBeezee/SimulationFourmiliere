package coeurSimulateur;

public class main {

	public static void main(String[] args) {
		
		Temps test = new Temps();	
		while(true) {

			
			System.out.println(test.leTemps);
			test.lireLeTemps();
			System.out.println(test.leTemps);
		
		}
	}

}
