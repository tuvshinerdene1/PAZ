import acm.program.*;
public class exercise2 extends ConsoleProgram {
	public void run(){
		println("Interest calculating program");
		double balance = readDouble("Enter starting balance: ");
		double interest = readDouble("Enter annual interest rate: ");
		println("Balance after one year = "+(balance*(interest/100+1)));
	}
	
	public static void main(String[] args){
		new exercise2().start();
	}
}
