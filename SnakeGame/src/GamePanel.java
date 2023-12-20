import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener{

	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNIT_SIZE = 25; 	// How big i want the unit size
	static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
	static final int DELAY = 75;
	
	final int x[] = new int[GAME_UNITS]; // 	Hold the x cordinates		 
	final int y[] = new int[GAME_UNITS]; // 	Hold the y cordinates
	int bodyParts = 6;
	int applesEaten;	// number of apples eaten
	int appleX;		// apples will randomly appear on the screen after one has been eaten
	int appleY;
	char direction = 'R';	// The direction the snake will go when the game starts
	boolean running = false;	//Running is false so when it is "true" the game will start
	Timer timer;
	Random random;
	
	
	GamePanel(){
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));	// Use setPreferredSize from JFrame package to set size of the screen
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		StartGame();	//	Passing the flow of code to StartGame method
	}
	
	public void StartGame() {
		newApple ();
//		call the newApple method to create a new applem for gameplay
		running = true; 
//		This boolean is set to "true" as it WAS set as "False" to begin with, basically, to make the game start
		timer = new Timer (DELAY, this);
//		pass in the DELAY value, to set how fast the game is running. keyword "this" as i'm using "action listener interface.
		timer.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
//		Toi day la đã xong phần nền gameplay, khung đen
	}
	
	public void draw(Graphics g) {
		
		if(running) {
		g.setColor(Color.red); //	Set color for the apple
		g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
//		position of Apple, and how large it is.
		
//		Draw the snake
		for(int i =0; i<bodyParts;i++) {
			if (i==0) {
				g.setColor(Color.green);
				g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE); // Rect for rectangle
			}
			else {
				g.setColor(new Color(45,180,0));
//				g.setColor(new Color(random.nextInt(255) ,random.nextInt(255), random.nextInt(255)));   // Set RBG color for the snake
				g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
			}
		}
//	Set the game score line on top, using the same method as "game over method
		g.setColor(Color.red);
		g.setFont( new Font("Ink Free", Font.BOLD, 40));  //	Font of the word "Game over"
		FontMetrics metrics = getFontMetrics(g.getFont());	//	Chỉ số (metrics)
		g.drawString("Score: "+ applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: "+ applesEaten))/2, g.getFont().getSize());
	}
		else {
			gameOver(g);
		}
}
	
	public void newApple() {
		appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
//		x cordinate of apple, it will appear randomly along the Screen_width range, it will take place 1 Unit_Size.
//		int because just to be safe, so it won't break the program
		appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	
	public void move() {
//		use for loop to iterate all parts of snake body. 
//		apply for snake body parts, keep continue as long as > 0
		for(int i=bodyParts;i>0;i--) {
			x[i] = x[i-1];
			y[i] = y[i-1];
		}
		
//		Use switch loop to direct snake
		switch(direction) {
		case'U' : 
			y[0] = y[0] - UNIT_SIZE;
			break;
		case 'D':
			y[0] = y[0] + UNIT_SIZE;
			break;
		case 'L':
			x[0] = x[0] - UNIT_SIZE;
			break;
		case 'R':
			x[0] = x[0] + UNIT_SIZE;
			break;		
		}
		
	}
	
	public void checkApple() {
		if((x[0] == appleX) && (y[0] == appleY)) {
			bodyParts++;
			applesEaten++;
			newApple();
		}
	}
	
	public void checkCollisions() {
		for(int i= bodyParts; i >0; i--) {
			if((x[0] == x[i]) && (y[0] == y[i])){
//					x[0] is the head of the snake, this means if the head of the snake impacts the body, trigger running false,game over
				 running = false;
			}
//		check game over if head hits border
			if(x[0] < 0) {
				running = false;
			}
			if(x[0] > SCREEN_WIDTH) {
				running = false;
			}
			if(y[0] < 0) {
				running = false;
			}
			if(y[0] > SCREEN_HEIGHT) {
				running = false;
			}
			if(!running) {	//	check if running is false
				timer.stop();
			}
			
		}	
	}
	
	public void gameOver(Graphics g) {
//		Game over text
			g.setColor(Color.red);
			g.setFont( new Font("Ink Free", Font.BOLD, 75));  //	Font of the word "Game over"
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Game Over", (SCREEN_WIDTH - metrics.stringWidth("Game Over"))/2, SCREEN_HEIGHT/2);
//	This method outputs the Game Over board and its position, x and y = middle of the frame
			
//	Show score when game is over
			g.setColor(Color.red);
			g.setFont( new Font("Ink Free", Font.BOLD, 40));  //	Font of the word "Game over"
			FontMetrics metrics2 = getFontMetrics(g.getFont());	//	Chỉ số (metrics)
			g.drawString("Score: "+ applesEaten, (SCREEN_WIDTH - metrics2.stringWidth("Score: "+ applesEaten))/2, g.getFont().getSize());
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(running) {	// check if the game's running
			move();		// then move the snake
			checkApple();	// check it i score, run into the apple
			checkCollisions();	// check if game over
			
		}
		repaint();	// if the game stops running, call this
		
	}
	
	public class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					if(direction != 'R') {
						direction = 'L';
					}
					break;
			
				case KeyEvent.VK_RIGHT:
					if(direction != 'L') {
						direction = 'R';
					}
					 break;
				case KeyEvent.VK_UP:
					if(direction != 'D') {
						direction = 'U';
					}
					break;
				case KeyEvent.VK_DOWN:
					if(direction != 'U') {
						direction = 'D';
					}
					break;
		}
	}
	
	}}

