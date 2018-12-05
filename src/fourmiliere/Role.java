package fourmiliere;

public abstract class Role {

	Adulte adulte;
	
	Role(Adulte a){
		
		adulte=a;		
	}
	
	public void step() {
		if(this.adulte.fourmi.fourmiliere.pourcentageDeMort() > 30.0) {
			this.nettoyage();
		}else {
			this.travaille();
		}
	}
	
	abstract void travaille();
	
	public void nettoyage() {
		int cc = 0;
		
		for(int i=0; i>this.adulte.fourmi.fourmiliere.getSize(); i++) {
			
			Fourmi courant = this.adulte.fourmi.fourmiliere.getElement(i);
			
			if (courant.getVivant() == false && cc<2) {
				this.adulte.fourmi.fourmiliere.getDepot().ajouterCadavre(courant);
				this.adulte.fourmi.fourmiliere.remove(courant);
				cc++;
			}
			
		}
	}
	
}
