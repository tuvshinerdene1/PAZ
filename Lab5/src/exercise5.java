import acm.program.*;

public class exercise5 extends ConsoleProgram{
	public void run(){
		println("This program converts Fahrenheit to Celsius.");
		
		double F = readDouble("Enter Fahrenheit temperature: ");
		double C = (5.0/9)*(F-32);
		
		println("Celsius equivalent = "+String.format("%.1f", C));
	}
	public static void main(String[] args){
		new exercise5().start();
	}
}
