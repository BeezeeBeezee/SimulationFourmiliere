package fourmiliere;

public class Pheromone {

	private int x;
	private int y;
	
	/**
	 * Constructeur du Pheromone
	 * @param x l'abscisse de positionnement
	 * @param y l'ordonné de positionnement 
	 */
	public Pheromone(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
