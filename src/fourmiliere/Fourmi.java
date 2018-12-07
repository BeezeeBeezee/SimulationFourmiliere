   package fourmiliere;

import java.util.Random;

public class Fourmi extends Animal {
	
	private int id;
	private int age;
	private boolean sexe;
	private Boolean vivant;
	private Etape etape;
	private int x;
	private int y;
	private boolean isIn;
	public Fourmiliere fourmiliere;
	
	/**
	 * Creation d'une fourmi
	 */
	public Fourmi(Fourmiliere fourmiliere){                                                                                                                                                                                                       
		age = 0;
		vivant = true;
		etape = new Oeuf(this);
		this.setSexeRandom();
		this.x = 350;
		this.y = 250;
		this.isIn = true; 
		this.fourmiliere = fourmiliere;
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
		if(this.vivant == true) {
			this.age++;
			this.evolution();
		}
	}

	public boolean getSexe() {
		return sexe;
	}

	public boolean getVivant() {
		return vivant;
	}
	
	public void setVivant(Boolean vivant) {
		this.vivant = vivant;
	}

	public Etape getEtape() {
		return etape; 
	}

	public void setEtape(Etape etape) {
		this.etape = etape;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
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
	 * Methode qui verifie si la fourmi doit mourir et modifie les parametre si c'est le cas.
	 * @return true si elle meurt, false sinon
	 */
	public boolean isGonnaDie() {
		boolean res = this.etape.isGonnaDie();
		this.vivant  = !res;
		return res;
	}
	
	public void step() {
		this.etape.step();
	}
	

	@Override
	public String toString() {
		return "\n" + id + ": Age=" + age + ", Sexe=" + sexe + ", Vivant="
				+ vivant + "Etape=" + etape + ", Dedans="+isIn;
	}

	public boolean isIn() {
		return isIn;
	}

	public void setIn(boolean isIn) {
		this.isIn = isIn;
	}
}
