package fourmiliere;

import java.util.Random;

public class Adulte extends Etape{

	private Role role;
	
	public Adulte(double poids, double resteAManger) {
		super.poids = poids;
		super.resteAManger = resteAManger;
		
		double random = Math.random() * 99 + 1;
		if (random >= 1 && random <= 60) {
			
		}
		
	}
	
	@Override
	double getPoids() {
		return super.poids;
    }

	@Override
	double getResteAManger() {
		return super.resteAManger;
	}

	@Override
	boolean mange(double aEteMange) {
		super.resteAManger -= aEteMange;		
		return super.resteAManger > 0;	
	}
}