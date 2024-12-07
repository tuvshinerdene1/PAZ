import acm.graphics.*;
import acm.program.*;

public class exercise10 extends GraphicsProgram {
	
	private static final int N_STEPS = 10;
	private static final int PAUSE_TIME = 5;
	
	
	public void run() {
		
		
		GLabel label = new GLabel("SE Tuvshin-Erdene Erdenebat 23B1NUM0869");
		add(label, getWidth() , 500);
		label.setFont("Serif-300");
		
		while(true){
			label.move(-N_STEPS, 0);
			pause(PAUSE_TIME);
			
			if(label.getX()-label.getWidth()<0){
				label.setLocation(getWidth(), 500);
			}
		}
	}
	

	public static void main(String[] args){
		new exercise10().start();
	}
}
