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
	public Fourmi(int id){
		this.id = id;                                                                                                                                                                                                           
		age = 0;
		vivant = true;
		etape = new Oeuf();
		this.setSexeRandom();
	}
	
	//TODO A supprimer
	public Fourmi(int id, int Larve){
		this.id = id;                                                                                                                                                                                                                 
		age = 0;
		vivant = true;
		etape = new Larve();
		this.setSexeRandom();
	}
	
	//TODO A supprimer
	public Fourmi(int id, String Adulte){
		this.id = id;                                                                                                                                                                                                     
		age = 0;
		vivant = true;
		etape = new Adulte();
		this.setSexeRandom();
	}
	
	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	/**
	 * Vieillissement d'une fourmi d'un jour.
	 */
	public boolean incrementAge() {
		this.age++;
		return this.evolution();
	}
	
	/**
	 * Vieillissement d'une fourmi de nbAgeAjouter.
	 * @param nbAgeAjouter nombre de jour à ajouter à l'age de la fourmi
	 * @return true si il y a eu evolution, false sinon
	 */
	public boolean ajoutAge(int nbAgeAjouter) {
		this.age = this.age + nbAgeAjouter;
		return this.evolution();
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

	private boolean evolution() {
		boolean resultat = false;
		
		if(this.age>3) {
			this.etape = new Larve();
			resultat = true;
		}else if(this.age>13) {
			this.etape = new Nymphe();
			resultat = true;
		}else if(this.age>30) {
			this.etape = new Adulte();
			resultat = true;
		}
		
		return resultat;
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
