

package flappybirds;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import pkg2dgamesframework.QueueList;


public class ChimneyGroup {

//	Queuelist thể hiện 1 vòng đòi, thể hiện dc bất cứ object nào. First in first out
	private QueueList<Chimney> chimneys;
	private BufferedImage chimneyImage, chimneyImage2;
	public static int SIZE = 6;
	private int topChimneyY = -350;
    private int bottomChimneyY = 200;
	private Rectangle rect;

	 
	public Chimney getChimney(int i) {
		return chimneys.get(i);
		
	}
	
//	use the Random class of Java to create random chimneys
	public int getRandomY(){
        Random random = new Random();
        int a;
        a = random.nextInt(10);
        
        return a*35;
	}
	
	public ChimneyGroup() {
		
//		
		
		
		try {
			chimneyImage = ImageIO.read(new File("Assets/chimney.png"));
				chimneyImage2 = ImageIO.read(new File("Assets/chimney_.png"));
	
			} catch (IOException ex) {}
	
			chimneys = new QueueList<Chimney>();
			
			Chimney cn;
		
		for(int i = 0; i< SIZE/2;i++){
		            
		            int deltaY = getRandomY();
		            
		            cn = new Chimney(830+i*300, bottomChimneyY + deltaY, 74, 400);
		            chimneys.push(cn);
		            
		            cn = new Chimney(830+i*300, topChimneyY + deltaY, 74, 400);
		            chimneys.push(cn);
        }
		
	}
	
	public void resetChimneys() {
		chimneys = new QueueList<Chimney>();
				
				Chimney cn;
				int deltaY = getRandomY();
				
				for (int i =0;i<SIZE/2;i++) {
					
					cn = new Chimney(830+i*300, bottomChimneyY+ deltaY, 74, 400  ); // the first pair of chimney
					chimneys.push(cn);
					
					cn = new Chimney(830+i*300, topChimneyY + deltaY, 74, 400 );
					chimneys.push(cn);

		}
	}
	
	public void update() {
		for(int i =0; i<SIZE;i++) {
			chimneys.get(i).update();
		}
			if(chimneys.get(0).getPosX() < -74) {
				
				int deltaY = getRandomY();
				
				Chimney cn;
				cn = chimneys.pop();  // when the first pair of chimney pop out, 
				cn.setPosX(chimneys.get(4).getPosX() + 300);	// set its next position as the 4th position
				cn.setPosY( bottomChimneyY + deltaY);
				cn.setIsBehindBird(false);
				chimneys.push(cn);
 
				
				cn = chimneys.pop();
				cn.setPosX(chimneys.get(4).getPosX());
				cn.setPosY(topChimneyY + deltaY);
				chimneys.push(cn);

			}
			
		}
		
	
	
//	paint 2 sides of chimneys
	public void Paint(Graphics2D g2) {
		for (int i=0;i<6;i++) {
			if(i%2==0) {
				g2.drawImage(chimneyImage,(int) chimneys.get(i).getPosX(),(int) chimneys.get(i).getPosY(), null);

		} else
				g2.drawImage(chimneyImage2,(int) chimneys.get(i).getPosX(),(int) chimneys.get(i).getPosY(), null);
	}
}
	
	
}
