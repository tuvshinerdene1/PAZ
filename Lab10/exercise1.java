
import acm.program.ConsoleProgram;
import java.lang.*;

public class exercise1 extends ConsoleProgram{
	
	public void run(){
		println("a : "+isEnglishConsonant('a'));
		println("b : "+isEnglishConsonant('b'));
	}
	private boolean isEnglishConsonant(char ch){
		switch (Character.toLowerCase(ch)){
		case 'a' : case 'e' : case 'i': case 'o':case 'u':
			return false;
		}
		return true;
	}
	public static void main(String[] arg){
		new exercise1().start();
	}
}
