import acm.program.*;
import acm.graphics.*;

public class exercise1 extends GraphicsProgram {
	public void run(){
		GLabel label = new GLabel("I love Java");
		add(label, 100, 100);
		
		GLabel label1 = new GLabel("E.Tuvshin-Erdene");
		add(label1, 600,450);
	
	}
	public static void main(String[] args) {
        new exercise1().start();
    }
}
