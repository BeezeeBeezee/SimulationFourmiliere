package fourmiliere;

public abstract class Role {

	Adulte adulte;
	public int identificateur;
	
	Role(Adulte a){
		adulte=a;
	}
	
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
