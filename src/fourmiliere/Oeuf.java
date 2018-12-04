package fourmiliere;

public class Oeuf extends Etape{

	public Oeuf() {
		super();
		this.poids = Math.random() * 1 + 0.1;
		this.resteAManger = 0;
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
