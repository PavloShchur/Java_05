package javaEvent;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MousePressedDemo extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init () {
		addMouseListener(new MyMouseAdaptera(this));
	}
}

	class MyMouseAdaptera extends MouseAdapter {
		MousePressedDemo mousePressedDemo;

		public MyMouseAdaptera(MousePressedDemo mousePressedDemo) {
			super();
			this.mousePressedDemo = mousePressedDemo;
		}
		
		public void mousePressed (MouseEvent me) {
			mousePressedDemo.showStatus("Mouse pressed");
		}
		
		
	}
