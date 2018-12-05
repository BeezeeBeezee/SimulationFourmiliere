package fourmiliere;

public class Nymphe extends Etape{
	
	/**
	 * Constructeur de Nymphe avec initialisation des variables
	 **/
	public Nymphe(Fourmi fourmi) {
		super();
		this.poids = 0;
		this.resteAManger = 0;
		this.fourmi = fourmi;
	}
	
	@Override
	double getPoids() {
		return this.poids;
	}

	@Override
	double getResteAManger() {
		return this.resteAManger;
	}

	/**
	 * Méthode qui fait manger la nymphe
	 **/
	@Override
	boolean mange(double aEteMange) {
		this.resteAManger -= aEteMange;		
		return this.resteAManger > 0;	
	}

	/**
	 * Méthode qui remet à zéro la faim de la nymphe
	 **/
	@Override
	void vaManger() {
		this.resteAManger = 0;
	}
	
	
	/**
	 * Méthode qui affiche les variables
	 **/
	@Override
	public String toString() {
		return "Nymphe[poids=" + this.poids + " , resteAManger=" + this.resteAManger + "]";
	}

	@Override
	Etape etatSuivant(int age) {
		if( age > 30 ) {
			return new Adulte(this.fourmi);
		}
		this.vaManger();
		return this;
	}
	
	@Override
	boolean isGonnaDie() {
		return false;
	}
	
	public void step(){}
	
}