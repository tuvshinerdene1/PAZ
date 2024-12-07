import acm.program.ConsoleProgram;
public class exercise3 extends ConsoleProgram {
	public void run(){
		println("Interest calculating program");
		
		double balance = readDouble("Enter starting balance: ");
		double interest = readDouble("Enter annual interest rate: ");
		
		double first_year = balance*(interest/100+1);
		println("Balance after one year = "+first_year);
		
		double second_year = first_year*(interest/100+1);
		println("Balance after two years = "+second_year);
	}
	
	public static void main(String[] args){
		new exercise3().start();
	}
}
