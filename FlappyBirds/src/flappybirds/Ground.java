//	Create the ground moving forward
package flappybirds;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ground {
	
	private BufferedImage groundImage;
	private int x1,y1,x2,y2;
	
	static Rectangle rect;

	
	public Ground() {
		try {
			groundImage = ImageIO.read(new File("Assets/ground.png"));
		} catch (IOException ex) {}
		
		x1 = 0;
		y1 = 500;
		x2 = x1+830;  // 830 because the size of the ground pic is 830x100
		y2 = 500;
	}
	
	public void Update() {
		rect = new Rectangle(x1,y1);
		
		x1 -=2;
		x2 -=2;
		if(x2<0) {
			x1 = x2+830;
		}
		if(x1<0) {
			x2 = x1+830; 
		}
	}
	
	
	public void Paint(Graphics2D g2) {
		g2.drawImage(groundImage,x1,y1, null);	// the first ground
		g2.drawImage(groundImage,x2,y2, null);	// 2nd ground
	}
	
	public int getYGround() {
		return y1;
	}
	
}
