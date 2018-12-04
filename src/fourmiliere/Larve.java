package fourmiliere;

public class Larve extends Etape{

	public Larve() {
		super();
		double unPoids = Math.random() * 8 + 4.5;
		this.poids = (double) Math.round(unPoids * 100) / 100;
		this.resteAManger = this.poids;
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
		this.resteAManger -= aEteMange;		
		return this.resteAManger > 0;	
	}

	@Override
	public void vaManger() {
		this.resteAManger = this.poids;
	}
	
	@Override
	public String toString() {
		return "Larve[poids="+this.poids+ " , resteAManger=" + this.resteAManger +"]";
	}
	
	
}