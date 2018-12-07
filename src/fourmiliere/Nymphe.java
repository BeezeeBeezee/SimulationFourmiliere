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
		this.identificateur = 3;
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
	 * Méthode qui permet a la nymphe de manger
	 **/
	@Override
	boolean mange(double aEteMange) {
		this.resteAManger -= aEteMange;		
		return this.resteAManger > 0;	
	}

	@Override
	void vaManger() {
	}
	
	@Override
	public String toString() {
		return "[ Nymphe: Poids=" + this.poids + " , ResteAManger=" + this.resteAManger + "]";
	}

	/**
	 * Methode qui renvoie un Adulte si la Nymphe est plus agée de 30 jours
	 * sinon renvoie la Nymphe
	 */
	@Override
	Etape etatSuivant(int age) {
		if( age > 30 ) {
			return new Adulte(this.fourmi);
		}
		return this;
	}
	
	/**
	 * La Nymphe ne peut pas mourrir
	 */
	@Override
	boolean isGonnaDie() {
		return false;
	}
	
	public void step(){}
	
}