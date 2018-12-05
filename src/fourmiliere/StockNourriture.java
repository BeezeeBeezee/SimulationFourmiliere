package fourmiliere;

import java.util.ArrayList;

public class StockNourriture {
	private ArrayList<Proie> stock;
	private double grammeNourriture;
	
	public StockNourriture() {
		this.stock = new ArrayList<Proie>();
		this.grammeNourriture = 0.0;
	}

	public ArrayList<Proie> getStock() {
		return stock;
	}

	public void setStock(ArrayList<Proie> stock) {
		this.stock = stock;
	}
	
	public void add(Proie proie) {
		this.stock.add(proie);
		this.calculerPoidsNourritureGeneral();
	}
	
	public boolean remove(Proie proie) {
		boolean res = this.stock.remove(proie);
		this.calculerPoidsNourritureGeneral();
		return res;
	}
	
	public boolean contains(Proie proie) {
		return this.stock.contains(proie);
	}
	
	public int size() {
		return this.stock.size();
	}
	
	public Proie get(int index) {
		return this.stock.get(index);
	}
	
	public void calculerPoidsNourritureGeneral() {
		for(Proie p : stock) {
			this.grammeNourriture += p.getPoids();
		}
	}

	public double getGrammeNourriture() {
		return grammeNourriture;
	}
}
