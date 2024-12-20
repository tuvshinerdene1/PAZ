import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
import java.lang.*;

public class exercise7 extends ConsoleProgram{
	
	public void run(){
		
		int number = readInt("enter the number: ");
		println("The oridinal form is "+createOrdinalForm(number));
	
	}
	
	private String createOrdinalForm(int num){
		
		String result = Integer.toString(num);
		int lastDigit = num % 10;
		if(num%100 >= 10 && num%100 <= 19){
			return result+"th";
		}
		
		switch(lastDigit){
		case 1: result += "st";break;
		case 2: result += "nd";break;
		case 3: result += "rd";break;
		default: result += "th";break;
		}
		
		return result;
	}

	public static void main(String[] arg){
		new exercise7().start();
	}
}
