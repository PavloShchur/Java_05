package javaAWT;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class XOR extends Applet {
		
	int chsX = 100, chsY = 100;
	
	public XOR () {
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent me) {
				int x = me.getX();
				int y = me.getY();
				chsX = x - 10;
				chsY = y - 10;
				repaint();
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
		});
	}
	
	public void paint (Graphics g) {
		g.drawLine(0, 0, 100, 100);
		g.drawLine(0, 100, 100, 0);
		g.setColor(Color.BLUE);
		g.drawLine(40, 25, 250, 180);
		g.drawLine(75, 90, 400, 400);
		g.setColor(Color.GREEN);
		g.drawRect(10, 10, 60, 50);
		g.setColor(Color.RED);
		g.drawRoundRect(190, 10, 60, 50, 15, 15);
		g.fillRoundRect(70, 90, 140, 100, 30, 40);
		g.setColor(Color.CYAN);
		g.drawLine(5, 290, 80, 19);
		
		g.setXORMode(Color.BLACK);
		g.drawLine(chsX - 10, chsY, chsX + 10, chsY);
		g.drawLine(chsY, chsY - 10, chsX, chsY + 10);
		g.setPaintMode();
	}
	
	
	
	
	
}
