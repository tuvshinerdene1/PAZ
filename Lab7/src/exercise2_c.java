/*finding n-th member of fibonacci sequence*/

import acm.program.ConsoleProgram;
import java.math.*;

public class exercise2_c extends ConsoleProgram {
	public void run(){
		int number = readInt("enter the number: ");
		println(fibonacci(number));
	}
	
	public static void main(String[] args){
		new exercise2_c().start();
	}
	private int fibonacci(int n){
		if(n <= 1){
			return n;
		}
		else{
			return(fibonacci(n-1)+fibonacci(n-2));
		}
	}
}
