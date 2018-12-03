package Fourmiliere;

public class Larve extends Etape{

	public Larve(double poids, int quantiteNourritureObligatoire) {
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
