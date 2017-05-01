package javaEvent;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class AdapterDemo extends Applet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init () {
		addMouseListener(new MyMouseAdapter(this));
		addMouseMotionListener(new MyMouseMoyionAdapter(this));
		
	}
}

	class MyMouseAdapter extends MouseAdapter {
		AdapterDemo adapterDemo;

		public MyMouseAdapter(AdapterDemo adapterDemo) {
			super();
			this.adapterDemo = adapterDemo;
		}
		
		public void mouseClicked (MouseEvent me) {
			adapterDemo.showStatus("Mouse clicked.");
		}
	}
	
	class MyMouseMoyionAdapter extends MouseMotionAdapter {
		AdapterDemo adapterDemo;

		public MyMouseMoyionAdapter(AdapterDemo adapterDemo) {
			super();
			this.adapterDemo = adapterDemo;
		}
		
		public void mouseDragged (MouseEvent me) {
			adapterDemo.showStatus("Mouse dragged.");
		}
	}
