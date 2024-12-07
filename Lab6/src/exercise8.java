import acm.program.ConsoleProgram;
public class exercise8 extends ConsoleProgram{
	
	private final int SENTINEL = 0;
	
	public void run(){
		println("This program finds the largest integer in a list.");
		println("Enter values, one per line, using a "+SENTINEL+" to signal ");
		println("the end of the list.");
		
		int max = 0;
		
		while(true){

			int current = readInt("? :");
			if(current == SENTINEL){break;}
			
			if(current > max){
				max = current;
			}
		}
		
		println("The largest value is "+max);
		
	}
	public static void main(String[] args){
		new exercise8().start();
	}
}

