package fourmiliere;

public class Larve extends Etape{
	
	/**
	 * Constructeur de Larve avec initialisation des variables
	 **/
	public Larve(Fourmi fourmi) {
		super();
		double unPoids = Math.random() * 8 + 4.5;
		this.poids = (double) Math.round(unPoids * 100) / 100;
		this.resteAManger = this.poids;
		this.fourmi = fourmi;
		this.identificateur = 2;
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
	 * Methode qui fait manger la larve
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
	 
	@Override
	public String toString() {
		return "[Larve: Poids=" + this.poids + " , ResteAManger=" + this.resteAManger + "]";
	}

	/**
	 * Si la larve est plus vieille de 13 jours, on renvoie une nouvelle Nymphe
	 * sinon reinitialisation de la larve pour une nouvelle journée
	 */
	@Override
	Etape etatSuivant(int age) {
		if( age > 13 ) {
			return new Nymphe(this.fourmi);
		}
		this.vaManger();
		return this;
	}
	
	/**
	 * Si la larve ne mange pas assez, elle meurt
	 */
	@Override
	boolean isGonnaDie() {
		if( this.resteAManger > 0 ) {
			return true;
		}
		return false;
	}
	
	void step() {}
	
}