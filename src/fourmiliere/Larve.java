package fourmiliere;

public class Larve extends Etape{

	public Larve() {
		super();
		this.poids = Math.random() * 8 + 4.5;
		this.resteAManger = this.poids;
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
		this.resteAManger -= aEteMange;		
		return this.resteAManger > 0;	
	}
}