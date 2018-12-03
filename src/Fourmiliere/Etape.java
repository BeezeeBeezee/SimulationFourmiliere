package Fourmiliere;

public abstract class Etape {
	
	
	protected double poids;
	protected int quantiteNourritureObligatoire;
	
	abstract double getPoids();

	abstract int getQuantiteNourritureObligatoire();
	
	
}
