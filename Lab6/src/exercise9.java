import acm.graphics.*;
import java.awt.*;
import acm.program.GraphicsProgram;

public class exercise9 extends GraphicsProgram{
	public void run(){
		setSize(1000, 600);
		int y = 0;
		
		int squareSize = getHeight()/8;
		int ballDiameter = squareSize-6;
		
		for(int i = 0 ; i < 8; i++){
			
			int x = (getWidth()-getHeight())/2;
			
			for(int j = 0 ; j < 8; j++){
				GRect square = new GRect(x, y, squareSize, squareSize);
				add(square);
				if((i+j)%2==1){
					square.setFilled(true);
					square.setColor(Color.gray);
					if(i<3){
						GOval redBall = new GOval(x+(squareSize-ballDiameter)/2,y+(squareSize-ballDiameter)/2,ballDiameter,ballDiameter);
						add(redBall);
						redBall.setFilled(true);
						redBall.setColor(Color.RED);
					}
					else if(i > 4){
						GOval blackBall = new GOval(x+(squareSize-ballDiameter)/2, y+(squareSize-ballDiameter)/2, ballDiameter, ballDiameter);
						add(blackBall);
						blackBall.setFilled(true);
						blackBall.setColor(Color.black);
					}
				}
				x += squareSize;
			}
			y += squareSize;
		}
	}
	public static void main(String[] args){
		new exercise9().start(args);
	}
}

