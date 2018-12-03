package Fourmiliere;

public class Larve extends Etape{

	public Larve(double poids, double resteAManger) {
		super.poids = poids;
		super.resteAManger = resteAManger;
	}
	
	@Override
	double getPoids() {
		return super.poids;
	}

	@Override
	double getResteAManger() {
		return super.resteAManger;
	}

	@Override
	void mange(double aEteMange) {
		super.resteAManger -= aEteMange;
		
	}
}
