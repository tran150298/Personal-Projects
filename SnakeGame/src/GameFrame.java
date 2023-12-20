import javax.swing.JFrame;

public class GameFrame extends JFrame {

	
		GameFrame(){
			this.add(new GamePanel());
//	A shorter version of: GamePanel panel = new GamePanel();		
//							this.add(new GamePanel());
			this.setTitle("Snake");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.pack();
//	Add components to JFrame, this "pack" will take JFrame and fit it all around the components
			this.setVisible(true);
			this.setLocationRelativeTo(null);//	set the panel to be in the middle of the screen
			
		}
}
