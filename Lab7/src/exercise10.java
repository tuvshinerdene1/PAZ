import acm.program.ConsoleProgram;
import java.math.*;

public class exercise10 extends ConsoleProgram {
	public void run(){
		println("Program to check if given number is perfect or not");
		int number = readInt("enter the number: ");
		println(isPerfect(number));
	}
	
	public static void main(String[] args){
		new exercise10().start();
	}
	private boolean isPerfect(int n){
		int sum = 1;
		for(int i = 2; i <= n/2 ; i++ ){
			if(n%i==0){
				sum+=i;
			}
		}
		if(n==sum){
			return true;
		}
		return false;
	}
}
