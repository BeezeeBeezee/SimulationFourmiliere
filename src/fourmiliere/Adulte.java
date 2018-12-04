package fourmiliere;

import java.util.Random;

public class Adulte extends Etape{

	private Role role;
	
	public Adulte() {
		super();
		double unPoids =  Math.random() * 2.5 + 1.5;
		this.poids = (double) Math.round(unPoids * 100) / 100;;
		this.resteAManger = this.poids;
		
		double roleFinal = Math.random() * 99 + 1;
		double roleOuvrier = Math.random() * 70 + 60;
		double roleSoldat = Math.random() * 25 + 20;
		
		if (roleFinal > 0 && roleFinal <= roleOuvrier) {
			this.role = new Ouvriere();
		}
		if (roleFinal > roleOuvrier && roleFinal <= roleOuvrier + roleSoldat) {
			this.role = new Soldat();
		}
		if (roleFinal > roleOuvrier + roleSoldat && roleFinal <= 99) {
			this.role = new Sexue();
		}
		
	}
	
	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
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
		return "Oeuf[poids="+this.poids+ " , resteAManger=" + this.resteAManger +", role=" + this.role.toString() + "]";
	}
}