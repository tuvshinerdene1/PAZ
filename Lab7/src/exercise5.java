import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise5 extends GraphicsProgram{
	
	private static final int N_CIRCLES = 5;
	private static final double OUTER_RADIUS = 75;
	private static final double INNER_RADIUS = 1;
	
	public void run(){
		double width = getWidth();
		double height = getHeight();
		
		double radius = OUTER_RADIUS;
		double delta = (OUTER_RADIUS-INNER_RADIUS)/N_CIRCLES;
		
		for(int i = 0 ; i < N_CIRCLES ; i++){
			if(i%2==0){
				add(createFilledCircle(width/2 , height/2 , radius, Color.red ));
			}
			else{
				add(createFilledCircle(width/2 , height/2 , radius, Color.WHITE ));
			}
			radius -= delta;
		}
		
	}
	
	private GOval createFilledCircle(double x, double y, double r, Color color ){
		GOval circle = new GOval(x-r, y-r, 2*r, 2*r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
		
	}
	
	public static void main(String[] args){
		new exercise5().start(args);
	}
}

