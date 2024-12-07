import acm.program.*;
public class exercise1 extends ConsoleProgram{
	public void run(){
		int bottles = 10;
		String newline = System.lineSeparator();
		while(bottles > 0){
			println(bottles + " bottles of beer on the wall.");
			println(bottles + " bottles of beer. You take one down, pass it around.");
			bottles -=1;
			println(bottles + " bottles of beer on the wall.");
			println(newline);
		}
	}
	public static void main(String[] args){
		new exercise1().start();
	}
}

