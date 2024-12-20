import acm.program.GraphicsProgram;
import java.awt.Color;
import acm.graphics.*;

public class exercise8 extends GraphicsProgram{
	public void run(){
		
		int thickness = 20;
		
		int x = 100;
		int y = 100;
		int size = 100;
		
		for(int i = 0 ; i < thickness; i++){
			GOval circle1 = new GOval(x,y,size,size);
			circle1.setColor(Color.blue);
			add(circle1);
			x++;y++;
			size = size - 2;
		}
		
		x = 220;
		y = 100;
		size = 100;
		for(int i = 0 ; i < thickness; i++){
			GOval circle1 = new GOval(x,y,size,size);
			circle1.setColor(Color.black);
			add(circle1);
			x++;y++;
			size = size - 2;
		}
		
		x = 340;
		y = 100;
		size = 100;
		for(int i = 0 ; i < thickness; i++){
			GOval circle1 = new GOval(x,y,size,size);
			circle1.setColor(Color.red);
			add(circle1);
			x++;y++;
			size = size - 2;
		}
		
		x = 160;
		y = 150;
		size = 100;
		for(int i = 0 ; i < thickness; i++){
			GOval circle1 = new GOval(x,y,size,size);
			circle1.setColor(Color.yellow);
			add(circle1);
			x++;y++;
			size = size - 2;
		}
		
		x = 280;
		y = 150;
		size = 100;
		for(int i = 0 ; i < thickness; i++){
			GOval circle1 = new GOval(x,y,size,size);
			circle1.setColor(Color.green);
			add(circle1);
			x++;y++;
			size = size - 2;
		}
		
	}
	public static void main(String[] args){
		new exercise8().start();
	}

}
