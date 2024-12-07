import acm.program.GraphicsProgram;
import java.awt.Color;
import acm.graphics.*;

public class exercise9 extends GraphicsProgram{
	
	public void run(){
		
		setSize(800,600);
		
		int thickness = 20;
		int x = -200;
		int y = 50;
		int size = 800 + 2*(-x);
		
		//background
		GRect background = new GRect(0, 0, 800, 600);
		background.setFilled(true);
		background.setColor(Color.CYAN);
		add(background);
		
		for(int i = 0 ; i < thickness; i ++){
			GOval circle1 = new GOval(x,y,size,size);
			circle1.setColor(Color.red);
			add(circle1);
			x++; y++;
			size = size-2;
		}
		for(int i = 0 ; i < thickness; i ++){
			GOval circle1 = new GOval(x,y,size,size);
			circle1.setColor(Color.orange);
			add(circle1);
			x++; y++;
			size = size-2;
		}
		for(int i = 0 ; i < thickness; i ++){
			GOval circle1 = new GOval(x,y,size,size);
			circle1.setColor(Color.yellow);
			add(circle1);
			x++; y++;
			size = size-2;
		}
		for(int i = 0 ; i < thickness; i ++){
			GOval circle1 = new GOval(x,y,size,size);
			circle1.setColor(Color.green);
			add(circle1);
			x++; y++;
			size = size-2;
		}
		for(int i = 0 ; i < thickness; i ++){
			GOval circle1 = new GOval(x,y,size,size);
			circle1.setColor(Color.blue);
			add(circle1);
			x++; y++;
			size = size-2;
		}
		for(int i = 0 ; i < thickness; i ++){
			GOval circle1 = new GOval(x,y,size,size);
			circle1.setColor(Color.magenta);
			add(circle1);
			x++; y++;
			size = size-2;
		}
		

		
	}
	public static void main(String[] args){
		new exercise9().start();
	}
}
