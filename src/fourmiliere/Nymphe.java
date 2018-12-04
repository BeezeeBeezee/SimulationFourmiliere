package fourmiliere;

public class Nymphe extends Etape{

	public Nymphe() {
		super();
		this.poids = 0;
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
		this.resteAManger -= aEteMange;		
		return this.resteAManger > 0;	
	}

	@Override
	void vaManger() {
		this.resteAManger = 0;
	}
	
	@Override
	public String toString() {
		return "Nymphe[poids="+this.poids+ " , resteAManger=" + this.resteAManger +"]";
	}
}