   package fourmiliere;

import java.util.Random;

public class Fourmi {
	private int incrementId = 0;
	
	public int id;
	private int age;
	private boolean sexe;
	private Boolean vivant;
	private Etape etape;
	
	/*
	 * Creation d'une fourmi
	 */
	public Fourmi(){
		id = incrementId;
		id++;                                                                                                                                                                                                                      
		age = 0;
		vivant = true;
		etape = new Oeuf();
		this.setSexeRandom();
	}
	
	public Fourmi(int larve){
		id = incrementId;
		id++;                                                                                                                                                                                                                      
		age = 0;
		vivant = true;
		etape = new Larve();
		this.setSexeRandom();
	}
	
	public Fourmi(String Adulte){
		id = incrementId;
		id++;                                                                                                                                                                                                                      
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

	/*
	 * Vieillissement d'une fourmi d'un jour
	 */
	public void incrementAge() {
		this.age++;
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

	public void evolution() {
		if(this.getClass().getName()=="Oeuf" && this.age>3) {
			this.etape = new Larve();
		}
		if(this.getClass().getName()=="Larve" && this.age>13) {
			this.etape = new Nymphe();
		}
		if(this.getClass().getName()=="Nymphe" && this.age>30) {
			this.etape = new Adulte();
		}
	}
	
	public void isGonnaDie() {
		if(this.getEtape().getResteAManger() > 0) {
			this.vivant = false;
		}
	}

	@Override
	public String toString() {
		return "Fourmi n°" + id + ": [age=" + age + ", sexe=" + sexe + ", vivant="
				+ vivant + ", etape=" + etape + "]";
	}
	
	
}
