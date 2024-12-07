
import acm.program.ConsoleProgram;
import java.lang.*;

public class example extends ConsoleProgram{
	
	public void run(){
		
		println("This programm will use swap method!!!");
		int a = readInt("Enter integer1= ");
		int b = readInt("Enter integer2= ");
		swap(a, b);
		println("After swapping:");
		println("integer1 is now "+a);
		println("integer2 is now "+b);
	
	}
	
	private void swap(int x, int y){
		int temp;
		temp = x;
		x= y;
		y = temp;
	}
	
	public static void main(String[] arg){
		new example().start();
	}
}
