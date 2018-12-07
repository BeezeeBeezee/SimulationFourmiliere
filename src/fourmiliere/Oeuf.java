package fourmiliere;

public class Oeuf extends Etape{
	
	/**
	 * Constructeur de Oeuf associé à une fourmi
	 * @param fourmi la fourmi associe
	 */
	public Oeuf(Fourmi fourmi) {
		super();
		double unPoids = Math.random() * 1 + 0.1;
		this.poids = (double) Math.round(unPoids * 100) / 100;
		this.resteAManger = 0;
		this.fourmi = fourmi;
		this.identificateur = 1;
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
	 * Methode qui previens que l'oeuf ne mange pas.
	 **/
	@Override
	public boolean mange(double aEteMange) {
		return false;
	}

	@Override
	public void vaManger() {
	}

	@Override
	public String toString() {
		return "[ Oeuf: Poids=" + this.poids + " , ResteAManger=" + this.resteAManger + "]";
	}

	/**
	 * Methode qui renvoie l'etat suivant si l'oeuf est plus vieux que 3 jours
	 * sinon return this
	 */
	@Override
	Etape etatSuivant(int age) {
		if(age > 3) {
			return new Larve(this.fourmi);
		}
		return this;
	}
	
	/**
	 * L'oeuf ne peut pas mourir.
	 */
	@Override
	boolean isGonnaDie() {
		return false;
	}
	
	public void step() {}
}
