import acm.graphics.GLine;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.Color;

public class level extends GLine {
	private RandomGenerator rgen = RandomGenerator.getInstance();
    public level(double x1, double y1, double x2, double y2){
    	super(x1, y1, x2, y2);
    }
}
