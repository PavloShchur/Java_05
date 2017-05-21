package javaAWT;

import java.applet.Applet;
import java.awt.Label;

public class LabelDemo extends Applet {
	public void init() {

		Label one = new Label("One");
		Label two = new Label("Two");
		Label three = new Label("Three");

		add(one);
		add(two);
		add(three);

	}
}
