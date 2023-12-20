import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


	public class TicTacToe implements ActionListener{
		
		Random random = new Random();
		JFrame frame = new JFrame();
		JPanel tittle_panel = new JPanel(); //	a panel to hold tittle
		JPanel button_panel = new JPanel();//	a panel to hold all the buttons we have
		JLabel textfield = new JLabel(); //	To display some message
		JButton[] buttons = new JButton[9];  
		boolean player1_turn;
			
		TicTacToe() {
			
//			create Jframe first, 
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			create size for the frame
			frame.setSize(800,800);			
			frame.getContentPane().setBackground(new Color(50,50,50));
//			set layout for the frame
			frame.setLayout(new BorderLayout());
			frame.setVisible(true);
			
			textfield.setBackground(new Color(25,25,25));
			textfield.setForeground(new Color(25,255,0));
			textfield.setFont(new Font("Ink Free", Font.BOLD,75));
			textfield.setHorizontalAlignment(JLabel.CENTER);// These lines format the headline
			textfield.setText("Tic-Tac-Toe"); // The text for the tittle
			textfield.setOpaque(true);  //Start the headline first
			
			tittle_panel.setLayout(new BorderLayout());
//		The layout starts at the top left corner	
			tittle_panel.setBounds(0,0,800,100);
			
//		Create the layout for the panel
			button_panel.setLayout(new GridLayout(3,3));
			button_panel.setBackground(new Color(150,150,150));

//		create buttons, 9 boxes
			for(int i=0; i<9;i++) {
				buttons[i] = new JButton();
				button_panel.add(buttons[i]);
				buttons[i].setFont(new Font("MV Boli", Font.BOLD,120));
//		Dont want these buttons to be focusable so.....
				buttons[i].setFocusable(false);
				buttons[i].addActionListener(this);
			}
			
			tittle_panel.add(textfield);
//		Make the panel to the top
			frame.add(tittle_panel,BorderLayout.NORTH);
			frame.add(button_panel);
			
			firstTurn();
			
		}

		@Override
	public void actionPerformed(ActionEvent e) {

//	Game runs 9 for loops
		for (int i =0;i<9;i++) {
//	Check if each of 9 buttons, check whose turn it is 
			if(e.getSource()==buttons[i]) {
//				if it is player1 turn :
//		If somebody clicks on a button, it will reflect and switch
//		to another X or O.	
				if(player1_turn) { // If it is player1's turn
					if (buttons[i].getText()=="") { 
						buttons[i].setForeground(Color.blue);
						buttons[i].setText("X"); // print X blue
						player1_turn=false;  //	Then to the other's turn
						textfield.setText("O turn");
						check();
					}
				}
				else {
					if (buttons[i].getText()=="") { 
						buttons[i].setForeground(Color.red);
						buttons[i].setText("O"); // print O red
						player1_turn=true;  //	Then to the other's turn
						textfield.setText("X turn");
						check();

				}
			}
		}
	}
			
			
	}
		
	public void firstTurn() {
		
//		This try/catch used to show who's first after 3000 mili sec
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

//		I have 2 numbers ( 0 and 1), take a random number between them, if it's 0,
//		it's player1's turn and vice versa
		if(random.nextInt(2)==0) {
			player1_turn= true;
			textfield.setText("X turn");
		}
		else {
			player1_turn= false;
			textfield.setText("0 turn");
		}
		
	}
	
// Check if who wins, then call out that method, X or O
	public void check() {
		
//	check if the FIRST row have any matches
		if((buttons[0].getText()=="X") &&
		   (buttons[1].getText()=="X") &&
		   (buttons[2].getText()=="X")){
			xWin(0,1,2);
		}
		
		if((buttons[3].getText()=="X") &&
		   (buttons[4].getText()=="X") &&
		   (buttons[5].getText()=="X")){
			xWin(3,4,5);
		}
		if((buttons[6].getText()=="X") &&
		   (buttons[7].getText()=="X") &&
		   (buttons[8].getText()=="X")){
			xWin(6,7,8);
		}
		if((buttons[0].getText()=="X") &&
		   (buttons[3].getText()=="X") &&
		   (buttons[6].getText()=="X")){
			xWin(0,3,6);
		}
		if((buttons[1].getText()=="X") &&
		   (buttons[4].getText()=="X") &&
		   (buttons[7].getText()=="X")){
			xWin(1,4,7);
		}
		if((buttons[2].getText()=="X") &&
		   (buttons[5].getText()=="X") &&
		   (buttons[8].getText()=="X")){
			xWin(2,5,8);
		}
		if((buttons[0].getText()=="X") &&
		   (buttons[4].getText()=="X") &&
		   (buttons[8].getText()=="X")){
			xWin(0,4,8);
		}
		if((buttons[2].getText()=="X") &&
		   (buttons[4].getText()=="X") &&
		   (buttons[6].getText()=="X")){
			xWin(2,4,6);
		}
		
//	Do the same for O
				if((buttons[0].getText()=="O") &&
				   (buttons[1].getText()=="O") &&
				   (buttons[2].getText()=="O")){
					oWin(0,1,2);
				}
				
				if((buttons[3].getText()=="O") &&
				   (buttons[4].getText()=="O") &&
				   (buttons[5].getText()=="O")){
					oWin(3,4,5);
				}
				if((buttons[6].getText()=="O") &&
				   (buttons[7].getText()=="O") &&
				   (buttons[8].getText()=="O")){
					oWin(6,7,8);
				}
				if((buttons[0].getText()=="O") &&
				   (buttons[3].getText()=="O") &&
				   (buttons[6].getText()=="O")){
					oWin(0,3,6);
				}
				if((buttons[1].getText()=="O") &&
				   (buttons[4].getText()=="O") &&
				   (buttons[7].getText()=="O")){
					oWin(1,4,7);
				}
				if((buttons[2].getText()=="O") &&
				   (buttons[5].getText()=="O") &&
				   (buttons[8].getText()=="O")){
					oWin(2,5,8);
				}
				if((buttons[0].getText()=="O") &&
				   (buttons[4].getText()=="O") &&
				   (buttons[8].getText()=="O")){
					oWin(0,4,8);
				}
				if((buttons[2].getText()=="O") &&
				   (buttons[4].getText()=="O") &&
				   (buttons[6].getText()=="O")){
					oWin(2,4,6);
				}
			
		}
	
	
	
//	method if x win
	public void xWin( int a, int b, int c) {
//		set the win buttons
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.green);
		buttons[c].setBackground(Color.green);

//		set the rest buttons enable so people cannot keep playing
		for (int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("X wins");
	}
	
//	method if o win
	public void oWin( int a, int b, int c) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.green);
		buttons[c].setBackground(Color.green);

		for (int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("O wins");
	}
	
}