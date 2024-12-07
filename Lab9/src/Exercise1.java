import acm.program.ConsoleProgram;
import java.lang.*;
public class Exercise1 extends ConsoleProgram{
	public void run(){
		println("This program will convert Hexadecimal to decimal.");
		println("Enter 0 to stop");
		while(true){
			String hex = readLine("Please enter hexadecimal: ");
			if(hex.equals("0")){
				break;
			}
			int result = Integer.parseInt(hex, 16);
			println(hex + " hex = "+Integer.toString(result)+" decimal.");
		}
	}
	public static void main(String[] arg){
		new Exercise1().start();
	}
}
