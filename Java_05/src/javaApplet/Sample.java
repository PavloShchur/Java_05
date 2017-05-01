package javaApplet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Sample extends Applet{
	
	String msq;
	
	public void init () {
		setBackground(Color.CYAN);
		setForeground(Color.RED);
		msq = "Inside init () --";
	}
	
	public void start () {
		msq += "Inside start () --";
	}
	
	public void paint (Graphics g) {
		msq += "Inside paint ().";
		g.drawString(msq, 10, 30);

	}
	
}
