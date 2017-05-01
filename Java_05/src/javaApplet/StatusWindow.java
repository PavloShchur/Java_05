package javaApplet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class StatusWindow extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
		setBackground(Color.CYAN);
	}

	public void paint(Graphics g) {
		g.drawString("This is in the applet window.", 10, 20);
		showStatus("This is shown in the status window.");
	}
}
