import acm.program.ConsoleProgram;
import java.lang.*;

public class Exercise5 extends ConsoleProgram{
	
	public void run(){
		
		println("This programm will use swap method!!!");
		int a = readInt("Enter integer1= ");
		int b = readInt("Enter integer2= ");
		
		INT integer1 = new INT(a);
		INT integer2 = new INT(b);
		
		/*Integer int1 = new Integer(a);
		Integer int2 = new Integer(b);
		
		println("integer1 is now "+int1);
		println("integer2 is now "+int2);*/
		
		println("INT 1 is now"+ integer1);
		println("INT 2 is now"+integer2);
		
		swap(integer1, integer2);
		
		println("After swapping:");
		println("integer1 is now "+integer1 + " "+ integer1.value);
		println("integer2 is now "+integer2 + " "+ integer2.value);
	
	}
	
	private void swap(INT x, INT y){
		int temp = x.value;
		x.value = y.value;
		y.value = temp;
	}
	
	public static void main(String[] arg){
		new Exercise5().start();
	}
}
