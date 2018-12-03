package Fourmiliere;

public class Larve extends Etape{

	public Larve(double poids, int quantiteNourritureObligatoire) {
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
