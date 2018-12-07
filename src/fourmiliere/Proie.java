package fourmiliere;

public class Proie extends Animal{
	
	private double poids;
	private boolean vivant;
	private int x;
	private int y;
	
	public Proie(int x, int y){
		double unPoids = Math.random() * 150 + 4.5;
		this.poids = (double) Math.round(unPoids * 100) / 100;
		this.vivant = true;
		this.x = x;
		this.y = y;
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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
