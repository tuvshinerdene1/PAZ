import acm.program.GraphicsProgram;
import acm.graphics.*;

public class exercise4 extends GraphicsProgram {
    public void run() {
        GRect base = new GRect (400, 400, 400, 300);
        add(base);
        
        GLine line1 = new GLine (400, 400, 600, 200);
        add(line1);
        
        GLine line2 = new GLine (600, 200, 800, 400);
        add(line2);
        
        GRect window1 = new GRect (450, 450, 75, 75);
        add(window1);
        
        GRect window2 = new GRect (675, 450, 75, 75);
        add(window2);
        
        GRect door = new GRect(575, 500, 60, 200);
        add(door);
        
        GOval doorKnob = new GOval(620, 600, 10, 10);
        add(doorKnob);
    }

    public static void main(String[] args) {
        new exercise4().start();
    }
}
