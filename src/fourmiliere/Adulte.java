package fourmiliere;


public class Adulte extends Etape{

	private Role role;
	
	/**
	 * Constructeur de Adulte avec initialisation des variables
	 **/
	public Adulte(Fourmi fourmi) {
		super();
		double unPoids =  Math.random() * 2.5 + 1.5;
		this.poids = (double) Math.round(unPoids * 100) / 100;;
		this.resteAManger = this.poids;
		this.fourmi = fourmi;
		
		double roleFinal = Math.random() * 99 + 1;
		double roleSoldat = Math.random() * 25 + 20;
		double roleSexue = Math.random() * 20 + 5;
		
		if (roleFinal >= 0 && roleFinal <= roleSexue) { // Sexue
			this.role = new Sexue(this);
		}
		else if (roleFinal > roleSexue && roleFinal <= roleSexue + roleSoldat) { // Soldat
			this.role = new Soldat(this);
		}
		else if (roleFinal > roleSexue + roleSoldat && roleFinal <= 100) { // Ouvriere
			this.role = new Ouvriere(this);
		}
		this.identificateur = this.role.identificateur;
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

	/**
	 * Méthode qui permet de faire manger l'adulte
	 **/
	@Override
	public boolean mange(double aEteMange) {
		this.resteAManger -= aEteMange;		
		return this.resteAManger > 0;	
	}

	/**
	 * Méthode qui remet à zéro la faim de l'adulte
	 **/
	@Override
	public void vaManger() {
		this.resteAManger = this.poids;
	}

	@Override
	public String toString() {
		return "[ Adulte: Poids="+this.poids+ " , ResteAManger=" + this.resteAManger +", Role=" + this.role.toString() + "] ";
	}

	/**
	 * renvoie l'adulte reinitialise
	 */
	@Override
	Etape etatSuivant(int age) {
		this.vaManger();
		return this;
	}

	/**
	 * Methode qui permet de tuer une fourmi si elle n'a pas assez mange
	 */
	@Override
	boolean isGonnaDie() {
		if( this.resteAManger > 0 ) {
			return true;
		}
		return false;
	}
	
	/**
	 * Appel de la methode step selon le Role de la fourmi
	 */
	@Override
	public void step() {
		this.role.step();
	}
}