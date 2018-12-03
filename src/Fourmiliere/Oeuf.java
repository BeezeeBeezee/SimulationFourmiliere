package Fourmiliere;

public class Oeuf extends Etape{

	public Oeuf(double poids, double resteAManger) {
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
	boolean mange(double aEteMange) {
		return false;
	}

}
