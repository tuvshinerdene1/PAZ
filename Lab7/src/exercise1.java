/*quadratic equation program*/
import acm.program.ConsoleProgram;
import java.math.*;

public class exercise1 extends ConsoleProgram {
	public void run(){
		println("This program solves quadratic equation!!(Super cool!)");
		
		
		double a = readDouble("a = ");
		double b = readDouble("b = ");
		double c = readDouble("c = ");
		
		solveQuadratic(a , b, c);
		
	}
	
	public static void main(String[] args){
		new exercise1().start();
	}
	private void solveQuadratic(double a, double b, double c){
		double D = b*b - 4*a*c;
		double s1, s2;
		
		if(D<0){println("There is no real solution.");}
		else{
			s1 = (-b+Math.sqrt(D))/(2*a);
			s2 = (-b-Math.sqrt(D))/(2*a);
			if(s1==s2){
				println("There is only 1 real solution and it is : "+s1);
			}
			else{
				println("The first solution is : "+s1);
				println("The second solution is : "+s2);
			}
		}
	}
}
