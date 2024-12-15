import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
import java.lang.*;
import java.util.*;

public class exercise10 extends ConsoleProgram{
	
	public void run(){
		
		String sentence = readLine("enter a line: ");
		println("the longest word is : "+longestWord(sentence));
		
	}
	private String longestWord(String line){
		String result = "";
		StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS, false);
		while(tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			if(token.length() > result.length()){
				result = token;
			}
		}
		return result;
	}
	public static void main(String[] arg){
		new exercise10().start();
	}
	
	private static final String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`|\\ ";
	
	
}
