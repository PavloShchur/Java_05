package javaAWT;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class WindowEvents extends Applet implements MouseListener, MouseMotionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	SampleFrame f;
	String msq = "";
	int mouseX = 0, mouseY = 0;
	int movX = 0, movY = 0;

	public void init() {
		f = new SampleFrame("Handle Mouse Events");
		f.setSize(300, 200);
		f.setVisible(true);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void stop () {
		f.setVisible(false);
	}
	
	public void start () {
		f.setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		movX = me.getX();
		movY = me.getY();
		msq = "*";
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		movX = me.getX();
		movY = me.getY();
		repaint(0, 0, 100, 20);
	}

	@Override
	public void mouseClicked(MouseEvent me) {
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		mouseX = 0;
		mouseY = 24;
		msq = "Mouse just entered applet window";
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		mouseX = 0;
		mouseY = 24;
		msq = "Mouse just  left applet window";
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msq = "Down";
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msq = "Up";
		repaint();
	}
	
	public void paint (Graphics g) {
		g.drawString(msq, mouseX, mouseY);
		g.drawString("Mouse at " + movX + ", " + movY, 0, 10);
		
	}

}

















