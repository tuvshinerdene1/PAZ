import acm.program.ConsoleProgram;
import java.lang.*;
public class Exercise2 extends ConsoleProgram{
	public void run(){
		println("this program will find the average of values you entered until you enter blank line");
		int sum = 0;
		int count = 0;
		while(true){
			String num = readLine("Enter the number: ");
			if(num.equals("")){
				break;
			}
			sum += Integer.parseInt(num);
			count++;
		}
		if(count == 0){
			println("you entered no number at all T_T");
		}
		else{
			println("The average of the numbers you entered is : "+String.format("%.3f", (double)sum/count));
		}
	}
	public static void main(String[] arg){
		new Exercise2().start();
	}
}
