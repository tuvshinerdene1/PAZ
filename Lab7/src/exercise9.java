import acm.program.ConsoleProgram;
import java.math.*;

public class exercise9 extends ConsoleProgram {
	public void run(){
		println("Program to check if given number is a prime number");
		int number = readInt("number = ");
		println(isPrime(number));
	}
	
	public static void main(String[] args){
		new exercise9().start();
	}
	
	private boolean isPrime(int n){
		if(n < 2){return false;}
		
		for(int i = 2; i*i <= n; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
		
	}
}
//Buh anhnii bus too uuriin yzguuraad hetrehgu 2 toonii urjwertei tentsu baina.