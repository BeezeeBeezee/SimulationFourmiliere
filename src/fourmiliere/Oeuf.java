package fourmiliere;

public class Oeuf extends Etape{

	public Oeuf() {
		super();
		
		double unPoids = Math.random() * 1 + 0.1;
		this.poids = (double) Math.round(unPoids * 100) / 100;
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

	@Override
	void vaManger() {
		this.resteAManger = 0;
	}

	@Override
	public String toString() {
		return "Oeuf[poids="+this.poids+ " , resteAManger=" + this.resteAManger +"]";
	}
	
	
	
}
