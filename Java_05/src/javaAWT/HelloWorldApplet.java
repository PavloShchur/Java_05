package javaAWT;

import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6626072137229287150L;

	public void paint(Graphics g) {
		g.drawString("Hello World", 25, 50);
	}
}
