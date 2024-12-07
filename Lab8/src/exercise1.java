import acm.program.ConsoleProgram;
import java.math.*;
import acm.util.*;

public class exercise1 extends ConsoleProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private String generateCard(){
		
		String name = "";
		int num = rgen.nextInt(1, 13);
		
		switch(num){
		case 1: name = "Ace";break;
		case 2: name = "2"; break;
		case 3: name = "3"; break;
		case 4: name = "4"; break;
		case 5: name = "5"; break;
		case 6: name = "6"; break;
		case 7: name = "7"; break;
		case 8: name = "8"; break;
		case 9: name = "9"; break;
		case 10: name = "10"; break;
		case 11: name = "Jack"; break;
		case 12: name = "Queen"; break;
		case 13: name = "King"; break;
		}
		
		String type = "";
		num = rgen.nextInt(1, 4);
		
		switch(num){
		case 1: type = "Clubs";break;
		case 2: type = "Hearts";break;
		case 3: type = "Spades";break;
		case 4: type = "Diamond";break;
		}
		
		return (name +" of "+type);
	}
	
	public void run(){
		println("This program displays a randomly chosen card.");
		for(int i = 0; i < 10; i++){
			println(generateCard());
		}
	}
	
	public static void main(String[] args){
		new exercise1().start();
	}
}
