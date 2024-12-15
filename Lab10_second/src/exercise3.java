
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

import java.lang.*;

public class exercise3 extends ConsoleProgram{
	
	public void run(){
		String str = readLine("Enter the word: ");
		println(capitalize(str));
	}
	String capitalize(String str){
		int firstLetter = -1;
		for(int i = 0 ; i < str.length();i++){
			if((str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='A' && str.charAt(i)<='Z')){
				firstLetter = i;
				break;
			}
		}
		
		if(firstLetter == -1){
			return str;
		}
		
		String result = str.substring(0, firstLetter) + Character.toUpperCase(str.charAt(firstLetter)) + str.substring(firstLetter+1).toLowerCase();
		return result;
	}
	
	public static void main(String[] arg){
		new exercise3().start();
	}
}
