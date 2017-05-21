package javaAWT;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo extends Applet implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7840264194009198542L;
	String msq = "";
	Button yes, no, maybe;

	public void init() {
		yes = new Button("Yes");
		no = new Button("No");
		maybe = new Button("Undecided");

		add(yes);
		add(no);
		add(maybe);

		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if (str.equals("Yes")) {
			msq = "You pressed Yes.";
		} else if (str.equals("No")) {
			msq = "You pressed No.";
		} else {
			msq = "You pressed Undecided.";
		}
		repaint();
	}

	public void paint(Graphics g) {
		g.drawString(msq, 6, 100);
	}
}
