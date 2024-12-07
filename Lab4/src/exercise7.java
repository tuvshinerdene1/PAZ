import acm.program.GraphicsProgram;
import java.awt.Color;
import acm.graphics.*;

public class exercise7 extends GraphicsProgram{
	public void run(){
		int diameter = 100;
		
		GOval circle1 = new GOval(100,100,diameter,diameter);
		circle1.setColor(Color.CYAN);
		add(circle1);
		
		GOval circle2 = new GOval(220, 100, diameter, diameter);
		circle2.setColor(Color.black);
		add(circle2);
		
		GOval circle3 = new GOval(340, 100, diameter, diameter);
		circle3.setColor(Color.RED);
		add(circle3);
		
		GOval circle4 = new GOval(160, 150, diameter, diameter);
		circle4.setColor(Color.yellow);
		add(circle4);
		
		GOval circle5 = new GOval(280, 150, diameter, diameter);
		circle5.setColor(Color.GREEN);
		add(circle5);
	}
	
	
	public static void main(String[] args){
		new exercise7().start();
	}
}
