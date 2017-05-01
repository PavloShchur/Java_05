package javaEvent;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnonymousInnerClassDemo extends Applet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init () {
		addMouseListener(new  MouseAdapter() {
			public void mousePressed (MouseEvent me) {
				showStatus("Mouse Pressed");
			}
		});
	}

}
