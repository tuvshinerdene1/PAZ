/*finding n-th member of fibonacci sequence*/

import acm.program.ConsoleProgram;
import java.math.*;

public class exercise2 extends ConsoleProgram {
	public void run(){
		int number = readInt("enter the number: ");
		println(fibonacci(number));
	}
	
	public static void main(String[] args){
		new exercise2().start();
	}
	private int fibonacci(int n){
		double result =  (Math.pow((1+Math.sqrt(5)), n)-Math.pow((1-Math.sqrt(5)), n))/(Math.pow(2, n)*Math.sqrt(5));
		return (int)result;
	}
}
