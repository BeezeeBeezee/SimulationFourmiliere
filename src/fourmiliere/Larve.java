package fourmiliere;

public class Larve extends Etape{

	public Larve() {
		super();
		this.poids = Math.random() * 8 + 4.5;
		this.resteAManger = this.poids;
		// TO DO
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