package fourmiliere;

public class Adulte extends Etape{

	public Adulte(double poids, double resteAManger) {
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
		super.resteAManger -= aEteMange;		
		return super.resteAManger > 0;	
	}
}
