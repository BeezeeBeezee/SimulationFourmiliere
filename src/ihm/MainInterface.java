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

import coeurSimulateur.Statistique;
import coeurSimulateur.Temps;
import coeurSimulateur.TempsMinutes;
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

public class MainInterface {

	public static void main(String[] args) {

		// CREATION DU MONDE
		World jc = new World("Simulation Fourmilière");
		jc.setBackground(Color.WHITE);
		jc.setPreferredSize(new Dimension(800, 600));
		
		// CREATION DES 4 TYPES DE DIMENSION
		Dimension dimFourmiliere = new Dimension(100, 100);
		Dimension dimReine = new Dimension(20, 20);
		Dimension dimFourmi = new Dimension(5, 5);
		Dimension dimPheromone = new Dimension(10, 10);

		// CREATION DE LA FOURMILIERE
		Terrain leTerrain = new Terrain();	
		Proie proie1 = new Proie(10, 10);
		Proie proie2 = new Proie(500, 500);

		Temps test = new Temps();	
		Fourmiliere f= new Fourmiliere();	
		TempsMinutes leTemps= new TempsMinutes();
		Statistique stat = new Statistique(f);	
		
		// Ajout des Phéromones
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
		
				
		f.setQuantiteNourriture(Integer.parseInt(nombreNourriture));
			
		// On fait passer les 30 premiers jours en accéléré
		for(int i=1; i<=29;i++) {
			f.temps.stepFourmiliere(f);
		}
		
		int compteurFourmis;
		jc.open();
		
		// DEBUT DU TRAITEMENT
		while(true) {
			jc.clear(); // On écrase l'affichage précédent
			
			stat.calculDesStatistique(); // Calcul avant d'afficher les statistiques 
			compteurFourmis = 0;	
			
			
			leTemps.incrementeMinute(f); // Le temps passe
				
				
				// On ajoute dans la liste des éléments graphiques les points représentant les fourmis
				for(int i=0; i < f.getSize(); i++) {
					if((f.getListe().get(i).getEtape().identificateur == 4) || (f.getListe().get(i).getEtape().identificateur == 5) || (f.getListe().get(i).getEtape().identificateur == 6)) {
						leTerrain.seDeplacer(f.getListe().get(i));
						
						if(f.getListe().get(i).getEtape().identificateur == 4) {
							jc.add(new Oval(Color.BLUE, new Point(350, 250), dimFourmi));
						}
						if(f.getListe().get(i).getEtape().identificateur == 5) {
							jc.add(new Oval(Color.RED, new Point(350, 250), dimFourmi));
						}
						if(f.getListe().get(i).getEtape().identificateur == 6) {
							jc.add(new Oval(Color.PINK, new Point(350, 250), dimFourmi));
						}
					}
				}		
				
				// Affichage des fourmis (graphiquement)
				List<Morph> drawables = jc.contents();
				for (Iterator<Morph> iter = drawables.iterator(); iter.hasNext();) {	
					if(f.getListe().get(compteurFourmis).isIn() == true) {
						iter.next().setPosition(new Point(350, 250));
					} else {
						iter.next().setPosition(new Point(f.getListe().get(compteurFourmis).getX(), f.getListe().get(compteurFourmis).getY()));
					}
					compteurFourmis++;
				}
				
				// Affichage de la fourmilière et de la reine
				jc.add(new Rect(Color.darkGray, new Point(300, 200), dimFourmiliere));
				jc.add(new Oval(Color.GRAY, new Point(350, 220), dimReine));

				// Affichage des statistiques
				jc.add(new DrawString(Color.BLACK, new Point(500, 80), dimReine, "AFFICHAGE DES INFORMATIONS :"));
				jc.add(new DrawString(Color.BLACK, new Point(500, 100), dimReine, "Nombre de jours : " + f.temps.lireLeTemps() ));
				jc.add(new DrawString(Color.BLACK, new Point(500, 120), dimReine, "Quantite de nourriture restante : " + f.getQuantiteNourrirture()));
				jc.add(new DrawString(Color.BLACK, new Point(500, 140), dimReine, "Nombre d'oeufs : " + stat.getNbOeufs()));
				jc.add(new DrawString(Color.BLACK, new Point(500, 160), dimReine, "Nombre de larves : " + stat.getNbLarves()));
				jc.add(new DrawString(Color.BLACK, new Point(500, 180), dimReine, "Nombre de nymphes : " + stat.getNbNymphes()));
				jc.add(new DrawString(Color.BLACK, new Point(500, 200), dimReine, "Nombre d'ouvriers : " + stat.getNbOuvriere()));
				jc.add(new DrawString(Color.BLACK, new Point(500, 220), dimReine, "Nombre de soldats : " + stat.getNbSoldat()));
				jc.add(new DrawString(Color.BLACK, new Point(500, 240), dimReine, "Nombre de sexués : " + stat.getNbSexue()));
				jc.add(new DrawString(Color.BLACK, new Point(500, 260), dimReine, "Nombre de morts : " + stat.getNbMort()));
				jc.add(new DrawString(Color.BLACK, new Point(500, 280), dimReine, "Nombre de cadavres dans le dépôt : " + f.getDepot().getSizeDeCadavres()));
				
				jc.add(new DrawString(Color.RED, new Point(500, 300), dimReine, "Fourmis soldats en rouge"));
				jc.add(new DrawString(Color.BLUE, new Point(500, 320), dimReine, "Fourmis ouvrières en bleu"));
				jc.add(new DrawString(Color.PINK, new Point(500, 340), dimReine, "Fourmis sexuées en rose"));
				
				jc.add(new Oval(Color.GREEN, new Point(proie1.getX(), proie1.getY()), dimPheromone));
				jc.add(new Oval(Color.GREEN, new Point(proie2.getX(), proie2.getY()), dimPheromone));
				
				
				try {
					TimeUnit.MILLISECONDS.sleep(Integer.parseInt(nombreTemps));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

		}		
	}	

}