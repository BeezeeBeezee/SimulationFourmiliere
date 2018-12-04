package fourmiliere;

public class Proie {
	
	private double poids;
	private boolean vivant;
	
	public Proie(){
		double unPoids = Math.random() * 150 + 4.5;
		this.poids = (double) Math.round(unPoids * 100) / 100;
		this.vivant = true;
	}

	@Override
	public String toString() {
		return "Proie [poids=" + poids + ", vivant=" + vivant + "]";
	}

	public double getPoids() {
		return poids;
	}

	public boolean isVivant() {
		return vivant;
	}
}
