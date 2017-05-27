package javaAWT;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ExampleEventHandling extends Applet implements MouseListener {

	StringBuffer strBuffer;

	public void init() {
		addMouseListener(this);
		strBuffer = new StringBuffer();
		addItem("intializating the applet ");
	}

	public void start() {
		addItem("starting the applet ");
	}

	public void stop() {
		addItem("stoping the applet ");
	}

	public void destroy() {
		addItem("unloading the applet ");

	}

	void addItem(String word) {
		System.out.println(word);
		strBuffer.append(word);
		repaint();
	}

	public void paint(Graphics g) {
		g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
		g.drawString(strBuffer.toString(), 10, 20);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		addItem("mouse clicked");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}
