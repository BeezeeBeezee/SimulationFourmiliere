package fourmiliere;

public class Oeuf extends Etape{

	public Oeuf() {
		super();
		
		double unPoids = Math.random() * 1 + 0.1;
		this.poids = (double) Math.round(unPoids * 100) / 100;
		this.resteAManger = 0;
	}
	
	@Override
	public double getPoids() {
		return this.poids;
	}

	@Override
	public double getResteAManger() {
		return this.resteAManger;
	}

	@Override
	public boolean mange(double aEteMange) {
		return false;
	}

	@Override
	public void vaManger() {
		this.resteAManger = 0;
	}

	@Override
	public String toString() {
		return "Oeuf[poids="+this.poids+ " , resteAManger=" + this.resteAManger +"]";
	}
	
	
	
}
