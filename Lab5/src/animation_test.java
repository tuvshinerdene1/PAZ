import acm.graphics.*;
import acm.program.*;

public class animation_test extends GraphicsProgram{
	
	private static final int N_STEPS = 1000000000;
	private static final int PAUSE_TIME = 1000;
	private static final double SQUARE_SIZE = 50;
	
	public void run(){
		GRect square = new GRect(0, 0, SQUARE_SIZE, SQUARE_SIZE );
		square.setFilled(true);
		add(square);
		double dx = (getWidth() - SQUARE_SIZE);
		double dy = (getHeight() - SQUARE_SIZE);
		for(int i = 0; i < N_STEPS ; i++){
			square.move(dx, dy);
			pause(PAUSE_TIME);
		}
	}
	public static void main(String[] args){
		new animation_test().start();
	}
}
