package IHM;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Simulation extends JFrame {
	
	public void creerFourmiliere() { 
		this.setTitle("Simulation Fourmiliere");
	    this.setSize(500, 500);
	    this.setLocationRelativeTo(null);               
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setContentPane(new Panneau());
	    this.setVisible(true);
	    
	}
	
	
	
}
