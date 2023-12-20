
package flappybirds;

import java.awt.Rectangle;
import java.io.File;

import javax.imageio.ImageIO;

import pkg2dgamesframework.Objects;
import pkg2dgamesframework.SoundPlayer;

public class Bird extends Objects {

		private float vt = 0;	//	the falling speed of the bird
		
		private boolean isFlying = false;
		private Rectangle rect; // use this class of java to check impact between rectangles
		private boolean isLive = true;
		
		public static SoundPlayer flapSound,bupSound,getMoneySound;
	
//	the coordinate of the bird
		public Bird (int x , int y, int w, int h)	{
			super ( x,y,w,h);
			rect = new Rectangle(x,y,w,h);
			
			flapSound = new SoundPlayer(new File("Assets/fap.wav"));
			bupSound = new SoundPlayer(new File("Assets/fall.wav"));
			getMoneySound = new SoundPlayer(new File("Assets/getpoint.wav"));
		}
		public void setLive(boolean b) {
	
			isLive = b ;
		}
		
		public boolean getLive() {
			return isLive;
		}
		
		
		public Rectangle getRect() {
			return rect;
		}
		
//	set the speed of the bird after playing again
		
		public void setVt(float vt) {
			this.vt=vt;
		}

//		update the fall of the bird
		public void update(long deltaTime) {
			
			 vt+=FlappyBirds.g;
			 
//	make the birds fall faster after time
			 this.setPosY(this.getPosY() + vt);
			 this.rect.setLocation((int) this.getPosX() , (int) this.getPosY());
			 
			 
			 if(vt<0) isFlying = true; //vt <0 mean going up.
			 else isFlying = false;
		}

//	make the bird fly up
		public void fly() {
			
			vt = -4;
			flapSound.play();
		}
	
		public boolean getIsFlying() {
			return isFlying;
		}
	
}
