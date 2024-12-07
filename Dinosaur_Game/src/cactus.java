import java.awt.Color;
import acm.graphics.*;

public class cactus extends GRect {
	
	public final static float CACTUSHEIGHT = 50;
	public final static float CACTUSWIDTH = 25;
	
    public cactus(double x, double y) {
        super(x, y-CACTUSHEIGHT, CACTUSWIDTH, CACTUSHEIGHT);
        setFilled(true);
        setFillColor(Color.green);
    }
}