
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

import java.lang.*;

public class exercise2 extends ConsoleProgram{
	
	private static final int MIN_LETTERS = 2 ;
	private static final int MAX_LETTERS = 10;
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run(){
		
		for(int j = 0 ; j < 10 ; j ++){
			int wordLength = rgen.nextInt(MIN_LETTERS, MAX_LETTERS);
			String result = "";
			for(int i = 0 ; i < wordLength; i++){
				result+=(char)rgen.nextInt(97, 122);
			}
			
			println(result);
			
		}
		
	}
	
	public static void main(String[] arg){
		new exercise2().start();
	}
}
