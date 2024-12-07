
import acm.program.ConsoleProgram;
import java.math.*;

public class exercise4 extends ConsoleProgram {
	public void run(){
		int number = readInt("enter the number: ");
		println(countDigits(number));
	}
	
	public static void main(String[] args){
		new exercise4().start();
	}
	
	private int countDigits(int n){
		int count = 0;
		if(n<0){
			return 0;
		}
		else{
			while(n > 0){
				count++;
				n /= 10;
			}
		}
		return count;
	}
}
