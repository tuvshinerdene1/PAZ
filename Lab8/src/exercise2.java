import acm.program.ConsoleProgram;
import java.math.*;
import acm.util.*;

public class exercise2 extends ConsoleProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private String tossCoin(){
		boolean coin = rgen.nextBoolean();
		if(coin){
			return ("Heads");
		}
		return("Tails"); 
	}
	
	public void run(){
		println("This program displays a randomly chosen card.");
		
		int count = 0;
		int total = 0;
		
		while(count<3){
			total++;
			String result = tossCoin();
			println(result);
			if(result == "Heads"){
				count++;
			}
			else{
				count = 0;
			}
		}
		println("It took "+total+" flips to get 3 consecutive heads");
	}
	
	public static void main(String[] args){
		new exercise2().start();
	}
}
