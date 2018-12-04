package ihm;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;

import fourmiliere.Fourmiliere;

public class DessinFourmiliere extends JPanel { 
	
	public void paintComponent(Graphics g){		
		g.drawRoundRect(200, 150, 100, 100, 10, 10);
		g.setColor(Color.RED);
		g.fillOval(230, 170, 50, 50);
		
		Fourmiliere f= new Fourmiliere();
		while(true) {
			
			f.pond();
			try {
				TimeUnit.MINUTES.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("a");
		}
	} 
	
}

