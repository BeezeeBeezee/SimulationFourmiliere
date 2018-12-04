package fourmiliere;

import java.util.Random;

public class Adulte extends Etape{

	private Role role;
	
	public Adulte(double poids, double resteAManger) {
		this.poids = poids;
		this.resteAManger = resteAManger;
		
		double random = Math.random() * 99 + 1;
		if (random >= 1 && random <= 60) {
			
		}
		if (random > 60 && random <= 80) {
			
		}
		if (random > 80 && random <= 85) {
			
		}
		else {
			
		}
		
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