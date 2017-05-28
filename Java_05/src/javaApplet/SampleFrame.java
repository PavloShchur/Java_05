package javaApplet;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SampleFrame extends Frame {

	SampleFrame(String title) {
		super(title);

		addWindowListener(new WindowAdapter() {
			public void windowCloing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
