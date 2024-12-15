import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
import java.lang.*;

public class exercise9 extends ConsoleProgram{
	
	public void run(){
		int number = readInt("enter a number: ");
		println("added commas : "+addCommas(Integer.toString(number)));
	}
	private String addCommas(String digits){
		
		int finish = 0;
		
		if(digits.charAt(0) == '-'){
			finish = 1;
		}
		
		String result = "";
		
		int separator = digits.length()-1;
		
		for(int i = digits.length()-1 ; i >= finish ;i--){
			
			if((separator - i )%3==0 && i < digits.length()-1){
				result = ',' + result;
			}
			result = digits.charAt(i) + result;
		}
		if(finish == 1){
			return '-'+result;
		}
		return result;
	}
	public static void main(String[] arg){
		new exercise9().start();
	}
}
