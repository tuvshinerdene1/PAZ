import java.awt.Window;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class exercise1 extends GraphicsProgram {
	public void run(){
		
		setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
		
		GImage image = new GImage("gaben.jpeg");
		double x = (getWidth() - image.getWidth()) /2 ;
		double y = (getHeight() - image.getHeight()) / 2;
		add(image, x, y);
		addCitation("The Lord Gaben");
		
	}
	
	private void addCitation(String text){
		GLabel label = new GLabel(text);
		label.setFont(CITATION_FONT);
		double x = getWidth() - label.getWidth();
		double y = getHeight() - CITATION_MARGIN + label.getAscent();
		add(label, x, y);
		
	}
	
	private static final String CITATION_FONT = "SansSerif-10";
	private static final int CITATION_MARGIN = 13;
	
	public static final int APPLICATION_WIDTH = 640;
	public static final int APPLICATION_HEIGHT = 640 + CITATION_MARGIN;
	
	public static void main(String[] args){
		new exercise1().start();
	}
}
