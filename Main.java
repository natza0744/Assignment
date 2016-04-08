import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,600);
		frame.getContentPane().setLayout(new BorderLayout());
		
		SpaceShip v4 = new SpaceShip(192, 537, 20, 5);
		SpaceShip v3 = new SpaceShip(189, 540, 26, 5);
		SpaceShip v2 = new SpaceShip(186, 543, 31, 5);
		SpaceShip v1 = new SpaceShip(183, 546, 37, 5);
		SpaceShip v = new SpaceShip(180, 550, 43, 5);
		GamePanel gp = new GamePanel();
		GameEngine engine = new GameEngine(gp, v, v1, v2, v3, v4);
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		frame.setVisible(true);
		engine.start();
		}
}
