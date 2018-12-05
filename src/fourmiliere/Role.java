package fourmiliere;

public abstract class Role {

	Adulte adulte;
	
	Role(Adulte a){
		
		adulte=a;		
	}
	
	abstract void travaille();
	
	
}
