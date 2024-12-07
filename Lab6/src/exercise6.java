import acm.program.ConsoleProgram;
public class exercise6 extends ConsoleProgram{
	
	private static final int START = 10;
	
	public void run(){
		
		int t = START;
		
		while(t >= 0){
			println(t);
			t--;
		}
		println("Liftoff!");
	}
	
	public static void main(String[] args){
		new exercise6().start();
	}
}

