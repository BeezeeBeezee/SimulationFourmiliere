   package fourmiliere;

import java.util.Random;

public class Fourmi {
	
	private int id;
	private int age;
	private boolean sexe;
	private Boolean vivant;
	private Etape etape;
	
	/**
	 * Creation d'une fourmi
	 */
	public Fourmi(){                                                                                                                                                                                                       
		age = 0;
		vivant = true;
		etape = new Oeuf();
		this.setSexeRandom();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	public int getAge() {
		return age;
	}

	/**
	 * Vieillissement d'une fourmi d'un jour.
	 */
	public void incrementAge() {
		this.age++;
		this.evolution();
	}
	
	
	/**
	 * Vieillissement d'une fourmi de nbAgeAjouter.
	 * @param nbAgeAjouter nombre de jour à ajouter à l'age de la fourmi
	 * @return true si il y a eu evolution, false sinon
	 */
	public void ajoutAge(int nbAgeAjouter) {
		this.age = this.age + nbAgeAjouter;
		this.evolution();
	}

	public boolean getSexe() {
		return sexe;
	}

	public boolean getVivant() {
		return vivant;
	}

	public Etape getEtape() {
		return etape; 
	}

	public void setEtape(Etape etape) {
		this.etape = etape;
	}

	private void setSexeRandom() {
		Random random = new Random();
		this.sexe = random.nextBoolean();
	}
	
	public double getResteAManger() {
		return etape.getResteAManger();
	}
	
	public boolean mange(double aEteMange) {
		return etape.mange(aEteMange); 
	}

	private void evolution() {
		this.etape = etape.etatSuivant(this.age);
	}
	
	/**
	 * Methode qui verifie si la fourmi doit mourir ou non selon 
	 * l'etape et le taux de nourriture de la fourmi.
	 */
	public boolean isGonnaDie() {
		boolean res = false;
		if(! (this.getEtape().getClass().getName()=="fourmiliere.Oeuf" 
				&& this.getEtape().getClass().getName()=="fourmiliere.Nymphe") ) {
			if(this.getEtape().getResteAManger() > 0) {
				this.vivant = false;
				res = true;
			}
		}
		
		return res;
	}

	@Override
	public String toString() {
		return "Fourmi n°" + id + ": [age=" + age + ", sexe=" + sexe + ", vivant="
				+ vivant + ", etape=" + etape + "]";
	}
}
