package ihm;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import coeurSimulateur.Temps;
import fourmiliere.Adulte;
import fourmiliere.Etape;
import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;
import fourmiliere.Nymphe;
import fourmiliere.Oeuf;
import fourmiliere.Ouvriere;
import fourmiliere.Pheromone;
import fourmiliere.Proie;
import fourmiliere.Terrain;

public class TestInterface {

	public static void main(String[] args) {

		World jc = new World("Simulation Fourmilière");
		jc.setBackground(Color.lightGray);
		jc.setPreferredSize(new Dimension(800, 600));
		
		Dimension dimFourmiliere = new Dimension(100, 100);
		Dimension dimReine = new Dimension(20, 20);
		Dimension dimFourmi = new Dimension(15, 15);

		// GESTION DE LA FOURMILIERE
		Terrain leTerrain = new Terrain();	
		Proie proie1 = new Proie(10, 10);
		Proie proie2 = new Proie(500, 500);
		
		Pheromone pheromone1 = new Pheromone(10, 10);
		Pheromone pheromone2 = new Pheromone(500, 500);
		
		leTerrain.ajouterPheromone(pheromone1);
		leTerrain.ajouterPheromone(pheromone2);
		
		// L'utilisateur décide de la quantité de nourriture présente dans la fourmilière au début et de la vitesse d'itération
		JOptionPane questionNourriture = new JOptionPane(), reponseNourriture = new JOptionPane();
		String nombreNourriture = questionNourriture.showInputDialog(null, "Veuillez indiquer la quantite de nourriture dans la fourmilière", "Utilisateur", JOptionPane.QUESTION_MESSAGE);
		reponseNourriture.showMessageDialog(null,  "Vous avez choisi d'avoir " + nombreNourriture + " en quantité de nourriture!", "Utilisateur", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane questionTemps = new JOptionPane(), reponseTemps = new JOptionPane();
		String nombreTemps = questionTemps.showInputDialog(null, "Veuillez indiquer la vitesse de simulation", "Utilisateur", JOptionPane.QUESTION_MESSAGE);
		reponseTemps.showMessageDialog(null,  "Vous avez choisi d'avoir " + nombreTemps + " en vitesse de simulation", "Utilisateur", JOptionPane.INFORMATION_MESSAGE);
		
		//----------------------------------------------
		int nbJours=0;	
		Temps test = new Temps();	
		Fourmiliere f= new Fourmiliere();	
		f.setQuantiteNourriture(Integer.parseInt(nombreNourriture));

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
			
			jc.add(new DOval(Color.darkGray, new Point(300, 200), dimFourmiliere));
			jc.add(new Oval(Color.GRAY, new Point(350, 250), dimReine));
			
			jc.add(new Oval(Color.GREEN, new Point(proie1.getX(), proie1.getY()), dimReine));
			jc.add(new Oval(Color.GREEN, new Point(proie2.getX(), proie2.getY()), dimReine));
			
			try {
				TimeUnit.MILLISECONDS.sleep(Integer.parseInt(nombreTemps));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
			nbJours++;
		}
				
	}	

}