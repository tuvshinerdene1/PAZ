import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise6 extends GraphicsProgram{
	
	private static final double FRAME_WIDTH = 50;
	   private static final double FRAME_HEIGHT = 100;
	   private static final double LAMP_RADIUS = 10;
	
	public void run(){
		double cx = getWidth() / 2;
	      double cy = getHeight() / 2;
	      double fx = cx - FRAME_WIDTH / 2;
	      double fy = cy - FRAME_HEIGHT / 2;
	      double dy = FRAME_HEIGHT / 4 + LAMP_RADIUS / 2;
	      
	      add(createFilledRect(fx, fy, FRAME_WIDTH, FRAME_HEIGHT, Color.gray));
	      add(createFilledCircle(cx, cy - dy, LAMP_RADIUS, Color.RED));
	      add(createFilledCircle(cx, cy, LAMP_RADIUS, Color.YELLOW));
	      add(createFilledCircle(cx, cy + dy, LAMP_RADIUS, Color.GREEN));
	}
	
	private GOval createFilledCircle(double x, double y, double r, Color color ){
		GOval circle = new GOval(x-r, y-r, 2*r, 2*r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
		
	}
	
	private GRect createFilledRect(double x, double y, double rectWidth, double rectHeight, Color color ){
		GRect rect = new GRect(x, y, rectWidth, rectHeight);
		rect.setColor(color);
		rect.setFilled(true);
		return rect;
	}
	
	public static void main(String[] args){
		new exercise6().start(args);
	}
}

