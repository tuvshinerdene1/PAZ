
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

import java.lang.*;

public class exercise5 extends ConsoleProgram{
	
	public void run(){
		String word = readLine("enter the word: ");
		println("the point is "+findScrabble(word));
	}

	private int findScrabble(String word){
		word = word.toUpperCase();
		int point = 0;
		for(int i = 0 ; i < word.length();i++){
			char ch = word.charAt(i);
			switch(ch){
			case 'A': case 'E':case 'I':case 'L':case 'N':case 'O':case 'R':case 'S': case 'T':case 'U': point +=1; break;			
			case 'D':case 'G': point += 2;break;
			case 'B':case 'C':case 'M':case 'P': point += 3; break;
			case 'F':case 'H':case 'V':case 'W':case 'Y': point += 4; break;
			case 'K': point+=5; break;
			case 'J':case 'X':point +=8; break;
			case 'Q':case 'Z':point +=10; break;
			default:continue;
			}
		}
		return point;
	}
	public static void main(String[] arg){
		new exercise5().start();
	}
}
