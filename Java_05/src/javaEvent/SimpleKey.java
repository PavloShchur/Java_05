package javaEvent;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleKey extends Applet implements KeyListener {

	String msq = "*";
	int X = 10;
	int Y = 20;

	public void init() {
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent ke) {
		showStatus("Key Down");
	}

	public void keyReleased(KeyEvent ke) {
		showStatus("Key Up");
	}

	public void keyTyped(KeyEvent ke) {
		msq += ke.getKeyChar();
		repaint();
	}

	public void paint(Graphics g) {
		g.drawString(msq, X, Y);
	}

}
