package javaEvent;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msq = "";
	int mouseX = 0;
	int mouseY = 0;

	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msq = "Mouse clicked.";
		repaint();
	}

	public void mouseEntered(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msq = "Mouse entered.";
		repaint();
	}

	public void mouseExited(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msq = "Mouse exited.";
		repaint();
	}

	public void mousePressed(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msq = "Down";
		repaint();
	}

	public void mouseReleased(MouseEvent me) {
		mouseY = me.getY();
		msq = "Up";
		repaint();
	}

	public void mouseDragged(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msq = "*";
		showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
		repaint();
	}

	public void mouseMoved(MouseEvent me) {
		showStatus("Moving mouse at " + mouseX + ", " + mouseY);
		repaint();
	}

	public void paint(Graphics g) {
		g.drawString(msq, mouseX, mouseY);
	}

}
