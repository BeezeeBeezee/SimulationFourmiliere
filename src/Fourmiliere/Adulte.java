package Fourmiliere;

public class Adulte extends Etape{

	public Adulte(double poids, int quantiteNourritureObligatoire) {
		super.poids = poids;
		super.quantiteNourritureObligatoire = quantiteNourritureObligatoire;
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
