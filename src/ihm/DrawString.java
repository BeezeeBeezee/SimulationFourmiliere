package ihm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import fourmiliere.Etape;
import fourmiliere.Fourmi;

public class DrawString extends Morph {
	private String message;
	
	public DrawString(Color color, Point pos, Dimension dim, String message) {
		super(color, pos, dim);
		this.message = message;
	}

	/**
	 * Création d'une chaine de caractère à écrire sur le dessin
	 */
	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(color);
		g.drawString(message, bounds.x,bounds.y);
		g.setColor(c);
		super.draw(g);
	}

}
