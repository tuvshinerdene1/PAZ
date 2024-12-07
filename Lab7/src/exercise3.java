import acm.program.ConsoleProgram;
import java.math.*;

public class exercise3 extends ConsoleProgram {
	public void run(){
		for(int i = 0 ; i <= 10 ; i++){
			println(raiseIntToPower(2, i));
		}
	}
	
	public static void main(String[] args){
		new exercise3().start();
	}
	
	private int raiseIntToPower(int n, int k){
		int result = 1;
		for(int i = 0 ; i < k ; i++){
			result *= n;
		}
		return result;
	}
}
