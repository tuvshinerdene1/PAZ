import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
import java.lang.*;

public class exercise6 extends ConsoleProgram{
	
	public void run(){
		println("this program checks for sentence palindromes.");
		println("indicate the end of the input with a blank line");
		
		String sentence = readLine("Enter a sentence: ");
		if(!isSentencePalindrome(sentence)){
			println("that sentence is a palindrome");
		}
		else{
			println("that sentence is not palindrome");
		}
		
	}
	boolean isSentencePalindrome(String word){
		String wordLetters = "";
		for(int i = 0 ; i < word.length();i++){
			if((word.charAt(i)>='a' && word.charAt(i)<='z') || (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')){
				wordLetters += word.charAt(i);
			}
		}
		String result = "";
		for (int i = word.length()-1 ; i >= 0; i--){
			if((word.charAt(i)>='a' && word.charAt(i)<='z') || (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')){
				result += word.charAt(i);
			}
		}
		if(wordLetters.equals(result)){
			return true;
		}
		return false;
	}
	public static void main(String[] arg){
		new exercise6().start();
	}
}
