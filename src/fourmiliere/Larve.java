package fourmiliere;

public class Larve extends Etape{
	
	/**
	 * Constructeur de Larve avec initialisation des variables
	 **/
	public Larve() {
		super();
		double unPoids = Math.random() * 8 + 4.5;
		this.poids = (double) Math.round(unPoids * 100) / 100;
		this.resteAManger = this.poids;
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
	 * Méthode qui fait manger la larve
	 **/
	@Override
	public boolean mange(double aEteMange) {
		this.resteAManger -= aEteMange;		
		return this.resteAManger > 0;	
	}

	/**
	 * Méthode qui remet à zéro la faim de la larve
	 **/
	@Override
	public void vaManger() {
		this.resteAManger = this.poids;
	}
	 
	/**
	 * Méthode qui affiche les variables
	 **/
	@Override
	public String toString() {
		return "Larve[poids="+this.poids+ " , resteAManger=" + this.resteAManger +"]";
	}

	@Override
	Etape etatSuivant(int age) {
		if( age > 13 ) {
			return new Nymphe();
		}
		return this;
	}
	
	
}