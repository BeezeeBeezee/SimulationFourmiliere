package fourmiliere;

public class Oeuf extends Etape{

	public Oeuf() {
		super();
		this.poids = Math.random() * 1 + 0.1;
		this.resteAManger = 0;
	}
	
	@Override
	double getPoids() {
		return this.poids;
	}

	@Override
	double getResteAManger() {
		return this.resteAManger;
	}

	@Override
	boolean mange(double aEteMange) {
		return false;
	}

}
