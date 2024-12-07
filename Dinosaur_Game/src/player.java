import java.awt.Color;
import acm.graphics.*;

public class player extends GRect {
	
	public static int playerHeight = 50;
	public static int playerWidth = 25;
	boolean isJumping = false;
	
    public player(double x, double y, Color color) {
        super(x, y, playerWidth, playerHeight);
        setFilled(true);
        setFillColor(color);
    }
    public double getWidth(){
    	return playerHeight;
    }
}