package javaApplet;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FlowLayoutDemo extends Applet implements ItemListener {

	String msq = "";
	Checkbox windows, android, solaris, mac;

	public void init() {
		setLayout(new FlowLayout(FlowLayout.LEFT));

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

	@Override
	public void itemStateChanged(ItemEvent itemEvent) {
		repaint();
	}

	public void paint(Graphics graphics) {
		msq = "Current state: ";
		graphics.drawString(msq, 6, 80);
		msq = " Windows: " + windows.getState();
		graphics.drawString(msq, 6, 100);
		msq = " Android: " + android.getState();
		graphics.drawString(msq, 6, 120);
		msq = " Solaris: " + solaris.getState();
		graphics.drawString(msq, 6, 140);
		msq = " Mac: " + mac.getState();
		graphics.drawString(msq, 6, 160);

	}

}
