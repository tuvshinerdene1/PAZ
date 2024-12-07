import acm.program.GraphicsProgram;

import java.awt.Color;

import acm.graphics.*;

public class exercise6 extends GraphicsProgram {
    public void run() {
    	
    	GOval circle1 = new GOval(100, 100, 400, 400);
    	circle1.setFilled(true);
    	circle1.setColor(Color.red);
    	add(circle1);
    	

    	GOval circle2 = new GOval(150, 150, 300, 300);
    	circle2.setFilled(true);
    	circle2.setColor(Color.white);
    	add(circle2);
    	
    	
    	GOval circle3 = new GOval(200, 200, 200, 200);
    	circle3.setFilled(true);
    	circle3.setColor(Color.red);
    	add(circle3);
    	
    	
    	GOval circle4 = new GOval(250, 250, 100, 100);
    	circle4.setFilled(true);
    	circle4.setColor(Color.white);
    	add(circle4);
    	
    }

    public static void main(String[] args) {
        new exercise6().start();
    }
}