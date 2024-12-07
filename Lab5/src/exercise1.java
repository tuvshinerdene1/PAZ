import acm.program.*;

public class exercise1 extends ConsoleProgram{
	
	public void run(){
		println("This program converts feet and inches to centimeters.");
		int feet = readInt("Enter number of feet: ");
		int inch = readInt("Enter number of inches: ");
		println(feet + " feet and "+inch+" inches = "+ (feet*30.48+inch*2.54));
	}
	public static void main(String[] args){
		new exercise1().start();
	}
}
