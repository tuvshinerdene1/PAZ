/*finding n-th member of fibonacci sequence*/

import acm.program.ConsoleProgram;
import java.math.*;

public class exercise2_b extends ConsoleProgram {
	public void run(){
		int number = readInt("enter the number: ");
		println(fibonacci(number));
	}
	
	public static void main(String[] args){
		new exercise2_b().start();
	}
	
	private int fibonacci(int n){
		if(n==1||n==2){
			return 1;
		}
		
		//a -> ehnii too
		//b -> 2dahi too
		int a = 1;
		int b = 1;
		for(int i = 0 ; i < (n-2); i++){
			int temp = a;
			a = b;
			b = temp + b;
		}
		return b;
	}
}
