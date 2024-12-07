import acm.program.ConsoleProgram;
import java.math.*;

public class exercise7 extends ConsoleProgram {
	public void run(){
		String question = "Would you like instructions?";
		println(askYesNoQuestion(question));
	}
	
	public static void main(String[] args){
		new exercise7().start();
	}
	private boolean askYesNoQuestion( String prompt){
		println(prompt);
		String answer = "";
		answer = readLine();
		while(!answer.equals("yes") && !answer.equals("no")){
			println("Please answer yes or no.");
			println(prompt);
			answer = readLine();
		}
		if(answer.equals("yes")){
			return true;
		}
		else{
			return false;
		}
	}
}
