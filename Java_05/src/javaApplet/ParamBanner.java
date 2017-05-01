package javaApplet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ParamBanner extends Applet implements Runnable {
	String msq;
	Thread t = null;
	int state;
	volatile boolean stopFlag;
	
	public void init () {
		setBackground(Color.CYAN);
		setForeground(Color.RED);
	}
	
	public void start () {
		msq = getParameter("massage");
		if (msq == null) msq = "Message is not found.";
		msq = " " + msq;
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	
	public void run () {
		for ( ; ; ) {
			try {
				repaint();
				Thread.sleep(250);
				if (stopFlag) break;
			} catch (InterruptedException e) {}
		}
	}
	public void stop () {
		stopFlag = true;
		t = null;
	}
	
	public void paint (Graphics g) {
		char ch;
		
		ch = msq.charAt(0);
		msq = msq.substring(1, msq.length());
		msq += ch;
		
		g.drawString(msq, 50, 30);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
