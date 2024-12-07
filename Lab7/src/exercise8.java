import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise8 extends GraphicsProgram{
	
	final double windowHeight = 30;
	final double windowWidth = 50;
	final double doorKnob = 10; 
	final double houseWidth = 500;
	final double houseHeight = 300;
	final double roofHeight = 150;
	final double doorWidth = 60;
	final double doorHeight = 90;
	
	public void run(){
		
		double x = 100;
		double y = 200;
		double width = getWidth();
		double height = getHeight();
		
		GRect body = new GRect(x, y, houseWidth, houseHeight);
		add(body);
		
		drawTriangle(x, y, x + houseWidth/2, y-roofHeight, x+houseWidth, y );
		
		drawWindow(x+50, y+25, 2, 2);
		drawWindow(x+houseWidth - 150, y+25 , 2, 2);
		
		drawWindow(x+40, y+150, 3 , 2);
		drawWindow(x+houseWidth - 190, y+150, 3 ,2);
		
		drawDoor(x+houseWidth/2-doorWidth/2, y+houseHeight - doorHeight, doorWidth, doorHeight);
	}
	
	public static void main(String[] args){
		new exercise8().start(args);
	}
	
	
	private void drawWindow(double  x, double y, int width, int height){
		for(int i = (int)x ; i < x + width*windowWidth ; i+=windowWidth){
			for(int j = (int)y ; j < y+height*windowHeight ; j += windowHeight){
				add(new GRect(i, j, windowWidth, windowHeight));
			}
		}
	}
	
	private void drawTriangle (double x1, double y1, double x2, double y2,  double x3, double y3){
		add(new GLine(x1, y1, x2, y2));
		add(new GLine(x2, y2, x3, y3));
		add(new GLine(x3, y3, x1, y1));
	}
	
	private void drawDoor(double x1, double y1, double width, double height){
		//door body
		add(new GRect(x1, y1, width, height));
		//door knob
		add(new GOval(x1+width-doorKnob, y1+doorHeight/2, doorKnob, doorKnob));
	}
}

