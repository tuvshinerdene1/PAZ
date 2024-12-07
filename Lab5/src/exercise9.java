import acm.graphics.GLine;
import acm.program.*;
public class exercise9 extends GraphicsProgram {
	
	
	public void run(){
		
		//first picture
		
			int board = getHeight()*6/9;
			
			double windowW=getWidth();
			double windowH=getHeight();
			
			//vertical line1
			GLine v1 = new GLine((windowW-board)/2+board/3, (windowH-board)/2, (windowW-board)/2+board/3,(windowH-board)/2+board);
			add(v1);
			
			//vertical line2
			GLine v2 = new GLine((windowW-board)/2+(board/3)*2, (windowH-board)/2, (windowW-board)/2+(board/3)*2,(windowH-board)/2+board);
			add(v2);
			
			//horizontal line1
			GLine h2 = new GLine((windowW - board)/2, (windowH-board)/2+(board/3)*2 ,(windowW - board)/2+board,(windowH-board)/2+(board/3)*2);
			add(h2);
			
			//horizontal line2
			GLine h1 = new GLine((windowW - board)/2, (windowH-board)/2+(board/3) ,(windowW - board)/2+board,(windowH-board)/2+(board/3));
			add(h1);
			
			
			
			while(true){
				
				windowW = getWidth();
				windowH = getHeight();
				
				v1.setStartPoint((windowW-board)/2+board/3, (windowH - board)/2);
				v1.setEndPoint((windowW-board)/2+board/3, (windowH - board)/2+board);
				v2.setStartPoint((windowW-board)/2+(board/3)*2,(windowH-board)/2);
				v2.setEndPoint((windowW-board)/2+(board/3)*2, (windowH-board)/2+board);
				
				h1.setStartPoint((windowW - board)/2, (windowH-board)/2+(board/3)*2);
				h1.setEndPoint((windowW-board)/2+board, (windowH-board)/2+(board/3)*2);
				h2.setStartPoint((windowW - board)/2,(windowH-board)/2+(board/3));
				h2.setEndPoint((windowW - board)/2+board, (windowH-board)/2+(board/3));
				
			}
	}
	public static void main(String[] args){
		new exercise9().start();
	}
}