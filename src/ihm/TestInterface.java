package ihm;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import fourmiliere.Adulte;
import fourmiliere.Etape;
import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;
import fourmiliere.Nymphe;
import fourmiliere.Oeuf;
import fourmiliere.Ouvriere;
import fourmiliere.Terrain;

public class TestInterface {

	public static void main(String[] args) {

		World jc = new World("Simulation Fourmilière");
		jc.setBackground(Color.WHITE);
		jc.setPreferredSize(new Dimension(800, 600));
		
		Dimension dimFourmiliere = new Dimension(100, 100);
		Dimension dimFourmi = new Dimension(15, 15);
		
		//jc.add(new Rect(Color.RED, new Point(300, 200), dimFourmiliere));
		//jc.add(new Oval(Color.BLACK, new Point(300, 200), dimFourmiliere));

		// GESTION DE LA FOURMILIERE
		Fourmiliere laFourmiliere = new Fourmiliere();
		Terrain leTerrain = new Terrain();	
		
		for(int i=0; i < 10; i++) {
			laFourmiliere.pond();
			jc.add(new Oval(Color.BLUE, new Point(10, 10), dimFourmi));
		}
		

		int val;
		jc.open();
		while (true) {
			// AJOUT DANS LA COLLECTION
			val = 0;
			
			for (int i=0; i < 10; i++) {
				leTerrain.seDeplacer(laFourmiliere.getListe().get(i));
			}
			
			//System.out.println(fourmi1.getX() + " - " + fourmi1.getY());
			
			
			List<Morph> drawables = jc.contents();
			for (Iterator<Morph> iter = drawables.iterator(); iter.hasNext();) {
				iter.next().setPosition(new Point(laFourmiliere.getListe().get(val).getX(), laFourmiliere.getListe().get(val).getY()));
				val++;
			}
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}