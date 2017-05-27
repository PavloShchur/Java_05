package javaAWT;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageDemo extends Applet {

	private Image image;
	private AppletContext appletContext;

	public void init() {
		appletContext = this.getAppletContext();
		String imageURL = this.getParameter("image");
		if (imageURL == null) {
			imageURL = "java.jpg";
		}
		try {
			URL url = new URL(this.getDocumentBase(), imageURL);
			image = appletContext.getImage(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			appletContext.showStatus("Could not load image!");
		}
	}

	public void paint(Graphics g) {
		appletContext.showStatus("Displaying image.");
		g.drawImage(image, 0, 0, 200, 84, null);
		g.drawString("www.javalicence.com", 35, 100);
	}

}
