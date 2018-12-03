package Fourmiliere;

public class Oeuf extends Etape{

	public Oeuf(double poids, int quantiteNourritureObligatoire) {
		super.poids = poids;
		super.quantiteNourritureObligatoire = quantiteNourritureObligatoire;
		System.out.println("Creation d'un adulte");
	}
	
	@Override
	double getPoids() {
		return super.poids;
	}

	@Override
	int getQuantiteNourritureObligatoire() {
		return super.quantiteNourritureObligatoire;
	}



}
