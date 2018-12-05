package ihm;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import coeurSimulateur.Temps;
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
		jc.setBackground(Color.lightGray);
		jc.setPreferredSize(new Dimension(800, 600));
		
		Dimension dimFourmiliere = new Dimension(100, 100);
		Dimension dimReine = new Dimension(30, 30);
		Dimension dimFourmi = new Dimension(15, 15);
		

		// GESTION DE LA FOURMILIERE
		Terrain leTerrain = new Terrain();	
		
		//----------------------------------------------
		int nbJours=0;	
		Temps test = new Temps();	
		Fourmiliere f= new Fourmiliere();	
		f.setQuantiteNourriture(1000000000);

		
		int val;
		jc.open();
		
		while(true) {
			jc.clear();
			val = 0;
			double laBouffe=f.getQuantiteNourrirture();		
			test.stepFourmiliere(f);
				
			System.out.println("----------jour"+nbJours+"---------------");
			System.out.println("quantite bouffe:"+laBouffe);
			
			for(int i=0;i < f.getSize(); i++) {					
				System.out.println(f.getElement(i));
			} 
			
			for(int i=0; i < f.getSize(); i++) {
				leTerrain.seDeplacer(f.getListe().get(i));
				jc.add(new Oval(Color.WHITE, new Point(10, 10), dimFourmi));
			}		
			
			List<Morph> drawables = jc.contents();
			for (Iterator<Morph> iter = drawables.iterator(); iter.hasNext();) {
				iter.next().setPosition(new Point(f.getListe().get(val).getX(), f.getListe().get(val).getY()));
				val++;
			}
			jc.add(new Rect(Color.darkGray, new Point(300, 200), dimFourmiliere));
			jc.add(new Oval(Color.GRAY, new Point(350, 250), dimReine));
			
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
			nbJours++;
		}
			//----------------------------------------------------	
	}	

}