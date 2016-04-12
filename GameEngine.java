import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Timer;


public class GameEngine implements KeyListener, GameReporter{
	GamePanel gp;
		
	private SpaceShip v;
	private SpaceShip v1;
	private SpaceShip v2;
	private SpaceShip v3;
	private SpaceShip v4;	
	private long score = 0;
	private Timer timer;
	
	public GameEngine(GamePanel gp, SpaceShip v, SpaceShip v1, SpaceShip v2,SpaceShip v3, SpaceShip v4) {
		this.gp = gp;
		this.v = v;
		this.v1 = v1;
		this.v2 = v2;		
		this.v3 = v3;
		this.v4 = v4;

		gp.sprites.add(v);
		gp.sprites.add(v1);
		gp.sprites.add(v2);
		gp.sprites.add(v3);
		gp.sprites.add(v4);
		
		timer = new Timer(50, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				process();
			}
		});
		timer.setRepeats(true);
		
	}
	
	public void start(){
		timer.start();
	}
	
	private void process(){
		
		gp.updateGameUI(this);
		
		Rectangle2D.Double vr = v.getRectangle();
		Rectangle2D.Double vr1 = v1.getRectangle();
		Rectangle2D.Double vr2 = v2.getRectangle();
		Rectangle2D.Double vr3 = v3.getRectangle();
		Rectangle2D.Double vr4 = v4.getRectangle();
	}
	public long getScore(){
		return score;
	}
	
	public void controlVehicle(KeyEvent e){
		switch (e.getKeyCode()){
			case KeyEvent.VK_LEFT:
				v.move(-1);
				v1.move(-1);
				v2.move(-1);
				v3.move(-1);
				v4.move(-1);
				break;
			case KeyEvent.VK_RIGHT:
				v.move(1);
				v1.move(1);
				v2.move(1);
				v3.move(1);
				v4.move(1);
				break;		
				}
			}

	@Override
	public void keyPressed(KeyEvent e){
		controlVehicle(e);
	}
	
	@Override
	public void keyReleased(KeyEvent e){
		
	}
	
	@Override
	public void keyTyped(KeyEvent e){
	
	}
}
