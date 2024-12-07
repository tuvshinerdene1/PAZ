import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextArea;

public class main extends GraphicsProgram {
	
	
	private static final int N_STEPS = 5;
	private static final int PAUSE_TIME = 5;
	private static final int PLAY_SPEED = 3;
	
	private static final int GROUNDHEIGHT = 300;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
    public void run() {
    	boolean isDead = false;
    	boolean isJumping = false;
    	
        player player = new player(10, 0, Color.BLACK);
        add(player);
        
        
        
        level level1 = new level(0, GROUNDHEIGHT, getWidth(), GROUNDHEIGHT);
        add(level1);
        level level2 = new level(getWidth(), GROUNDHEIGHT,getWidth()*2, GROUNDHEIGHT);
        add(level2);
        
        cactus cactus1 = new cactus(rgen.nextDouble(getWidth(), getWidth()*2), 300);
        add(cactus1);
        
        cactus cactus2 = new cactus(rgen.nextDouble(getWidth(), getWidth()*2), 300);
        add(cactus2);
        
        while(!isDead){
        	JTextArea jt = new JTextArea();
        	jt.addKeyListener(new KeyListener(){
        		public void keyPressed(KeyEvent ke){
        			if(ae.getKeyCode()==KeyEvent.VK_SPACE)
        		}
        	});
        	while(!isJumping){
        		while(player.getY()+player.playerHeight < level1.getY()){
        			player.move(0, N_STEPS);
        			pause(PAUSE_TIME);
        		}
        		if(player.getY()+player.playerHeight == level1.getY()){
        			break;
        		}
        	}
        	level1.move(-PLAY_SPEED, 0);
        	if(level1.getX()<-getWidth()){
        		level1.setStartPoint(getWidth(), 300);
        		level1.setEndPoint(getWidth()*2, 300);
        	}
        	level2.move(-PLAY_SPEED, 0);
        	if(level2.getX()<-getWidth()){
        		level2.setStartPoint(getWidth(), 300);
        		level2.setEndPoint(getWidth()*2, 300);
        	}
        	cactus1.move(-PLAY_SPEED, 0);
        	if(cactus1.getX()<0){
        		cactus1.setLocation(rgen.nextDouble(getWidth(), getWidth()*2), GROUNDHEIGHT-player.getHeight());
        	}
        	cactus2.move(-PLAY_SPEED, 0);
        	if(cactus2.getX()<0){
        		cactus2.setLocation(rgen.nextDouble(getWidth(), getWidth()*2), GROUNDHEIGHT-player.getHeight());
        	}
        	pause(PAUSE_TIME);
        }
        
    }

    public static void main(String[] args) {
        new main().start();
    }
}
