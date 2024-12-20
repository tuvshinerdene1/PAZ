import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class exercise2 extends GraphicsProgram {
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run(){
		while(true){
			addLabel();
			pause(1000);
		}
	}
	
	private void addLabel(){
		
		String text = "this is label";
		
		double x = rgen.nextDouble(0,getWidth());
		double y = rgen.nextDouble(0, getHeight());
		
		double width = rgen.nextDouble(1, 100);
		double height = rgen.nextDouble(1,100);
		
		//GLabel label = new GLabel(x, y, width, height);
		
		GLabel label = new GLabel(text, x, y);
		add(label);
	}
	
	public static void main(String[] args){
		new exercise2().start();
	}
}
