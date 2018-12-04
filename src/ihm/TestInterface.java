package ihm;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import fourmiliere.Adulte;
import fourmiliere.Etape;
import fourmiliere.Fourmi;
import fourmiliere.Nymphe;
import fourmiliere.Oeuf;
import fourmiliere.Ouvriere;

public class TestInterface {

	public static void main(String[] args) {
		int x = 20;
		int y = 20;
		World jc = new World("Simulation Fourmilière");
		jc.setBackground(Color.WHITE);
		jc.setPreferredSize(new Dimension(800, 600));
		
		Dimension dimFourmiliere = new Dimension(100, 100);
		Dimension dimFourmi = new Dimension(5, 5);
		
		jc.add(new Rect(Color.RED, new Point(300, 200), dimFourmiliere));
		jc.add(new Oval(Color.BLACK, new Point(300, 200), dimFourmiliere));
			
		for (int i = 0; i < 5; i++) {
			dimFourmi = new Dimension(15, 15);
			jc.add(new Oval(Color.BLUE, new Point(100, 100), dimFourmi));
		}
		jc.open();
		while (true) {
			x=20;
			y=20;
			List<Morph> drawables = jc.contents();
			for (Iterator<Morph> iter = drawables.iterator(); iter.hasNext();) {
				iter.next().setPosition(new Point(x + 100, y + 100));
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