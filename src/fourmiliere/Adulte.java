package fourmiliere;

import java.util.Random;

public class Adulte extends Etape{

	private Role role;
	
	public Adulte() {
		super();
		this.poids =  Math.random() * 2.5 + 1.5;;
		this.resteAManger = this.poids;
		
		double roleFinal = Math.random() * 99 + 1;
		double roleOuvrier = Math.random() * 70 + 60;
		double roleSoldat = Math.random() * 25 + 20;
		
		if (roleFinal > 0 && roleFinal <= roleOuvrier) {
			// this.role = Ouvrier
		}
		if (roleFinal > roleOuvrier && roleFinal <= roleOuvrier + roleSoldat) {
			// this.role = Soldat
		}
		if (roleFinal > roleOuvrier + roleSoldat && roleFinal <= 99) {
			// this.role = Sexue
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