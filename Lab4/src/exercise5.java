import acm.program.GraphicsProgram;

import java.awt.Color;

import acm.graphics.*;

public class exercise5 extends GraphicsProgram {
    public void run() {
    	GRect head = new GRect(200, 200, 300, 500);
    	head.setFilled(true);
    	head.setColor(Color.GRAY);
    	add(head);
    	
    	GOval eye1 = new GOval(240, 300, 50, 50);
    	eye1.setFilled(true);
    	eye1.setColor(Color.YELLOW);
    	add(eye1);
    	
    	GOval eye2 = new GOval(410, 300, 50, 50);
    	eye2.setFilled(true);
    	eye2.setColor(Color.YELLOW);
    	add(eye2);
    	
    	GRect nose = new GRect(345, 400, 10, 50);
    	nose.setFilled(true);
    	nose.setColor(Color.BLACK);
    	add(nose);
    	
    	
    	GRect mouth = new GRect(240, 600, 220, 40);
    	mouth.setFilled(true);
    	mouth.setColor(Color.white);
    	add(mouth);
    }

    public static void main(String[] args) {
        new exercise5().start();
    }
}
