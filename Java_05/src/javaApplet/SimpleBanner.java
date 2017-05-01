package javaApplet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class SimpleBanner extends Applet implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msq = "A Simple Moving Banner.";
	Thread t = null;
	int state;
	volatile boolean stopFlag;

	public void init() {
		setBackground(Color.CYAN);
		setForeground(Color.RED);
	}

	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}

	public void run() {
		for (;;) {
			try {
				repaint();
				Thread.sleep(250);
				if (stopFlag)
					break;
			} catch (InterruptedException e) {
			}
		}
	}

	public void stop() {
		stopFlag = true;
		t = null;
	}

	public void paint(Graphics g) {
		char ch;

		ch = msq.charAt(0);
		msq = msq.substring(1, msq.length());
		msq += ch;

		g.drawString(msq, 50, 30);
	}

}
