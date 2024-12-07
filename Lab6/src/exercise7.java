
import acm.graphics.*;
import acm.program.GraphicsProgram;
public class exercise7 extends GraphicsProgram{
	
	private static final int BRICK_WIDTH = 60;
	private static final int BRICK_HEIGHT = 30;
	private static final int BRICKS_IN_BASE = 14;
	
	
	
	public void run(){
		setSize(BRICK_WIDTH*BRICKS_IN_BASE+200, BRICK_HEIGHT*BRICKS_IN_BASE+200);
		int startX = 100;
		int startY = getHeight() - 50;
		int count = BRICKS_IN_BASE;
		
		while(count >0){
			int x = startX;
			for(int i = 0 ; i < count; i++){
				add(new GRect(x, startY, BRICK_WIDTH, BRICK_HEIGHT));
				x += BRICK_WIDTH;
			}
			startX += BRICK_WIDTH/2;
			startY -= BRICK_HEIGHT;
			count--;
		}
		
	}
	public static void main(String[] args){
		new exercise7().start();
	}
}

