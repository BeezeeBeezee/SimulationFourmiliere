package fourmiliere;

public class Oeuf extends Etape{
	
	/**
	 * Constructeur de Oeuf avec initialisation des variables
	 **/
	public Oeuf(Fourmi fourmi) {
		super();
		double unPoids = Math.random() * 1 + 0.1;
		this.poids = (double) Math.round(unPoids * 100) / 100;
		this.resteAManger = 0;
		this.fourmi = fourmi;
	}
	
	@Override
	public double getPoids() {
		return this.poids;
	}

	@Override
	public double getResteAManger() {
		return this.resteAManger;
	}

	/**
	 * Méthode qui fait manger l'oeuf
	 **/
	@Override
	public boolean mange(double aEteMange) {
		return false;
	}

	/**
	 * Méthode qui remet à zéro la faim de l'oeuf
	 **/
	@Override
	public void vaManger() {
		this.resteAManger = 0;
	}

	/**
	 * Méthode qui affiche les variables
	 **/
	@Override
	public String toString() {
		return "[ Oeuf: Poids=" + this.poids + " , ResteAManger=" + this.resteAManger + "]";
	}

	@Override
	Etape etatSuivant(int age) {
		if(age > 3) {
			return new Larve(this.fourmi);
		}
		this.vaManger();
		return this;
	}
	
	@Override
	boolean isGonnaDie() {
		return false;
	}
	
	public void step() {}
}
