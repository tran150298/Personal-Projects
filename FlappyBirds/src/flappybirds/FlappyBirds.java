//	Flappy Brirds, level 2 student - CET

package flappybirds;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import pkg2dgamesframework.AFrameOnImage;
import pkg2dgamesframework.Animation;
import pkg2dgamesframework.GameScreen;
  
public class FlappyBirds extends GameScreen  {
	
	private BufferedImage birds;
	private Animation bird_anim;

	
	public static float g = 0.2f; //	create gravity to make the bird fall
	private Bird bird;
	private Ground ground;
	private ChimneyGroup chimneygroup;
	private int Point = 0;
	
	private int BEGIN_SCREEN= 0;
	private int GAMEPLAY_SCREEN =1;
	private int GAMEOVER_SCREEN = 2;
	private int CURRENT_SCREEN = BEGIN_SCREEN;
	
	public FlappyBirds() {

//		Starts all the frame, background before playing the game
		super(800,600); 	//	Size of the screen
		
		try {	//	Add the pictures of the bird flapping wings
			birds = ImageIO.read(new File("Assets/bird_sprite.png"));
		} catch (IOException ex ) {
            ex.printStackTrace();

		}
		
		bird_anim = new Animation(100);
		AFrameOnImage f;
		f = new AFrameOnImage(0, 0, 60, 60); //	3 pictures, 1 to 2 to 3 to 2 to 1
		bird_anim.AddFrame(f);
		f = new AFrameOnImage(60, 0, 60, 60);
		bird_anim.AddFrame(f);
		f = new AFrameOnImage(120, 0, 60, 60);
		bird_anim.AddFrame(f);
		f = new AFrameOnImage(60, 0, 60, 60);
		bird_anim.AddFrame(f);
		
		bird = new Bird(350, 250, 50, 50);
		ground = new Ground();
		
		chimneygroup = new ChimneyGroup(); // call out the chimney pic with the size 74x400
		
		BeginGame();	//	Call the begin game method
	}

	public static void main(String[] args) {
		new FlappyBirds();	
		
	}
	
//	set the position of the bird back to the beginning
	private void resetGame() {
		bird.setPos(350, 250);
		bird.setVt(0);
		bird.setLive(true);
		Point = 0;
		chimneygroup.resetChimneys();
	}

	@Override
	public void GAME_UPDATE(long deltaTime) {
		
		if(CURRENT_SCREEN == BEGIN_SCREEN) {
			resetGame();  // reset game also reset the position of the bird
	}
		else if (CURRENT_SCREEN == GAMEPLAY_SCREEN) {
		
			if(bird.getLive()) 
				bird_anim.Update_Me(deltaTime);
				bird.update(deltaTime);
				ground.Update();
				chimneygroup.update();
		
			
//	Check if hit box of the bird and chimney impact
				for(int i = 0;i<ChimneyGroup.SIZE;i++){
	                if(bird.getRect().intersects(chimneygroup.getChimney(i).getRect())){
	                    if(bird.getLive()) {
	                    		bird.bupSound.play();
	                      }
	                	bird.setLive(false);
	                    
	                    System.out.println("Set live = false");
	                }

	            }
		
		 for(int i = 0;i<ChimneyGroup.SIZE;i++){
             if(bird.getPosX() > chimneygroup.getChimney(i).getPosX() 
            		 && !chimneygroup.getChimney(i).getIsBehindBird()
                     && i%2==0){
                 Point ++;
                 Bird.getMoneySound.play();
                 chimneygroup.getChimney(i).setIsBehindBird(true); 
             }
		}
			
			
		if(bird.getPosY() + bird.getH() >    ground.getYGround()) {
				CURRENT_SCREEN = GAMEOVER_SCREEN;
			}
	}}

		
	

	@Override
	public void GAME_PAINT(Graphics2D g2) {
			
			g2.setColor(Color.decode("#b8daef"));  // set background color
			g2.fillRect(0, 0, MASTER_WIDTH, MASTER_HEIGHT); // MASTER means to scale the game respectively
			
//	draw the chimney
			chimneygroup.Paint(g2);
		
//	draw the ground
			ground.Paint(g2);

			
		if(bird.getIsFlying()) 
//		adjust the first position of the bird
			bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, -1);
		else // make the bird raise its head when flying
			bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, 0);
	
		
		if(CURRENT_SCREEN == BEGIN_SCREEN) {
			g2.setColor(Color.red);
			g2.drawString("Press space to play", 200, 300);
	}
		if (CURRENT_SCREEN == GAMEOVER_SCREEN) {
			g2.setColor(Color.red);
			g2.drawString("Press space to back to menu", 200, 300);
	}
		
		g2.setColor(Color.red);
		g2.drawString("Point: " + Point , 20, 50 );
		
	}

	@Override
	 public void KEY_ACTION(KeyEvent e, int Event) {
        if(Event == KEY_PRESSED){
            
            if(CURRENT_SCREEN == BEGIN_SCREEN){
                
            	CURRENT_SCREEN = GAMEPLAY_SCREEN;
                
            }else if(CURRENT_SCREEN  == GAMEPLAY_SCREEN){
                if(bird.getLive())
                	bird.fly();
            }else if(CURRENT_SCREEN == GAMEOVER_SCREEN){
            	CURRENT_SCREEN = BEGIN_SCREEN;
			
           }
        }
	}

}
