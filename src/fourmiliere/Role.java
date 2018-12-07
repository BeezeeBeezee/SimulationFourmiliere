package fourmiliere;

public abstract class Role {

	Adulte adulte;
	public int identificateur;
	
	/**
	 * Constructeur de Role associé à un Adulte
	 * @param a l'adulte associé
	 */
	public Role(Adulte a){
		adulte=a;
	}
	
	/**
	 * Methode permettant de faire le travail de la fourmi 
	 * soit le nettoyage,
	 * soit leurs travails respectifs.
	 */
	public void step() {
		if(this.adulte.fourmi.fourmiliere.pourcentageDeMort() > 0.30) {
				this.nettoyage();
				this.nettoyage();
		}else {

			this.travaille();
			this.nettoyage();
		}
	}
	
	abstract void travaille();
	
	/**
	 * Methode permettant le nettoyage de la fourmiliere
	 * Chaque fourmi nettoie deux cadavres de la fourmiliere
	 */
	public void nettoyage() {
		
		for(int i=0; i<this.adulte.fourmi.fourmiliere.getSize(); i++) {
			Fourmi courant = this.adulte.fourmi.fourmiliere.getElement(i);
			if (courant.getVivant() == false) {
				this.adulte.fourmi.fourmiliere.getDepot().ajouterCadavre(courant);
				this.adulte.fourmi.fourmiliere.remove(courant);
			}
		}
		
		if(this.adulte.fourmi.fourmiliere.pourcentageDeMort() > 0.0) {
			for(int i=0; i>this.adulte.fourmi.fourmiliere.getSize(); i++) {
				Fourmi courant = this.adulte.fourmi.fourmiliere.getElement(i);
				if (courant.getVivant() == false) {
					this.adulte.fourmi.fourmiliere.getDepot().ajouterCadavre(courant);
					this.adulte.fourmi.fourmiliere.remove(courant);
				}
			}
		}
	}
	
}
