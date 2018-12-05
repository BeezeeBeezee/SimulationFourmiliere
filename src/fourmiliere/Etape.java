package fourmiliere;

public abstract class Etape {
	
	protected Fourmi fourmi;
	protected double poids;
	protected double resteAManger;
	
	abstract double getPoids();
	abstract boolean mange(double aEteMange);
	
	abstract double getResteAManger();
	abstract void vaManger();
	abstract Etape etatSuivant(int age);
	abstract boolean isGonnaDie();
	abstract void step();
}