import acm.program.*;
import java.lang.Math;

public class exercise4 extends ConsoleProgram{
	public void run(){
		println("Area of circle Program");
		
		double radius = readDouble("Enter radius of the circle: ");
		
		double area = Math.PI*radius*radius;
		println("Area of circle with "+radius+" is : "+String.format("%.2f", area));
		
	}
	public static void main(String[] args){
		new exercise4().start();
	}
}
