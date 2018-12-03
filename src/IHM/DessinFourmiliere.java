package IHM;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DessinFourmiliere extends JPanel { 
	
	public void paintComponent(Graphics g){		
		g.drawRoundRect(200, 150, 100, 100, 10, 10);
		g.fillOval(100, 100, 10, 10);
	} 
	
}

