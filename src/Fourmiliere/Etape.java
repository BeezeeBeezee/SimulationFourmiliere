package Fourmiliere;

public abstract class Etape {
	
	
	protected double poids;
	protected double resteAManger;
	
	abstract double getPoids();
	abstract boolean mange(double aEteMange);
	
	abstract double getResteAManger();
	
	
}
