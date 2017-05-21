package javaAWT;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxDemo extends Applet implements ItemListener {
	String msq = "";
	Checkbox windows, android, solaris, mac;

	public void init() {
		windows = new Checkbox("Windows", null, true);
		android = new Checkbox("Android");
		solaris = new Checkbox("Solaris");
		mac = new Checkbox("Mac OS");

		add(windows);
		add(android);
		add(solaris);
		add(mac);

		windows.addItemListener(this);
		android.addItemListener(this);
		solaris.addItemListener(this);
		mac.addItemListener(this);

	}

	public void paint(Graphics g) {
		msq = "Current state: ";
		g.drawString(msq, 6, 80);
		msq = " Windows " + windows.getState();
		g.drawString(msq, 6, 100);
		msq = " Android " + android.getState();
		g.drawString(msq, 6, 120);
		msq = " Solaris " + solaris.getState();
		g.drawString(msq, 6, 140);
		msq = " Mac OS " + mac.getState();
		g.drawString(msq, 6, 160);

	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		repaint();

	}
}
