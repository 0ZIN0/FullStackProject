package locker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class LockerPanel extends JPanel {
	
	
	
	
	private BufferedImage image;
	/**
	 * Create the panel.
	 */
	public LockerPanel() {
		
		try {
            image = ImageIO.read(new File("ui/background.png"));
        } catch (IOException ex) {
        }
		
		setBounds(0, 0, 1920, 1080);
		setBackground(new Color(73, 67, 68));
		setLayout(null);
	}
	
	 protected void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 g.drawImage(image, 0, 0, this);
	 }
}
