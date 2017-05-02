package javaAWT;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SampleFrame extends Frame implements MouseListener, MouseMotionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String msq = "";
	int mouseX = 10, mouseY = 10;
	int movX = 1, movY = 0;

	SampleFrame(String title) {
		super(title);
		MyWindowAdapter adapter = new MyWindowAdapter(this);
		addWindowListener(adapter);
		addMouseListener(this);
		addMouseMotionListener(this);

	}

	public void paint(Graphics g) {
		g.drawString(msq, mouseX, mouseY);
		g.drawString("Mouse at " + movX + ", " + movY, 10, 40);

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
		repaint(0, 0, 100, 60);
	}

	@Override
	public void mouseClicked(MouseEvent me) {
	}

	@Override
	public void mouseEntered(MouseEvent evtObj) {
		mouseX = 10;
		mouseY = 54;
		msq = "Mouse just entered child window";
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent evtObj) {
		mouseX = 10;
		mouseY = 54;
		msq = "Mouse just left child window";
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
}

class MyWindowAdapter extends WindowAdapter {
	SampleFrame sampleFrame;

	public MyWindowAdapter(SampleFrame sampleFrame) {
		this.sampleFrame = sampleFrame;
	}

	public void windowClosing(WindowEvent we) {
		sampleFrame.setVisible(false);
	}
}
