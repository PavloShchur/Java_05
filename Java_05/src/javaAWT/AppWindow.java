package javaAWT;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppWindow extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String keymsq = "This is a test";
	String mousemsq = "";
	int mouseX = 30, mouseY = 30;

	public AppWindow() {
		addKeyListener(new MyKeyAdapter(this));
		addMouseListener(new MyMouseAdapter(this));
		addWindowListener(new MyWindowAdapter(this));
	}

	public void paint(Graphics g) {
		g.drawString(keymsq, 10, 40);
		g.drawString(mousemsq, mouseX, mouseY);
	}

	public static void main(String[] args) {
		AppWindow appWindow = new AppWindow();

		appWindow.setSize(new Dimension(300, 200));
		appWindow.setTitle("An AWT-Based Application");
		appWindow.setVisible(true);
	}

	class MyKeyAdapter extends java.awt.event.KeyAdapter {
		AppWindow appWindow;

		public MyKeyAdapter(AppWindow appWindow) {
			this.appWindow = appWindow;
		}

		public void keyTyped(KeyEvent ke) {
			appWindow.keymsq += ke.getKeyChar();
			appWindow.repaint();
		}

	}

	class MyMouseAdapter extends MouseAdapter {
		AppWindow appWindow;

		public MyMouseAdapter(AppWindow appWindow) {
			this.appWindow = appWindow;
		}

		public void mousePressed(MouseEvent me) {
			appWindow.mouseX = me.getX();
			appWindow.mouseY = me.getY();
			appWindow.mousemsq = "Mouse Down at " + appWindow.mouseX + ", " + appWindow.mouseY;
			appWindow.repaint();
		}

	}

	class MyWindowAdapter extends WindowAdapter {
		public MyWindowAdapter(AppWindow appWindow) {
		}

		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}

}
