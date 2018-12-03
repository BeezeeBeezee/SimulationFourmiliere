package IHM;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel { 
	
	public void paintComponent(Graphics g){
		
		g.fillOval(100, 100, 10, 10);
		
		g.drawRoundRect(200, 150, 100, 100, 10, 10);
	}               
}

