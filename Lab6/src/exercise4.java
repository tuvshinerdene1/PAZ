import acm.program.ConsoleProgram;
public class exercise4 extends ConsoleProgram{
	public void run(){
		println("This program will calculate average of exam points.");
		println("Enter values one per line and put -1 at the end of the list.");
		
		int total = 0;
		int count = 0;
		
		while(true){
			int value = readInt ("Enter point : ");
			if(value == -1){break;}
			total += value;
			count++;
		}
		
		println("average is : "+(double)total/count);
	}
	public static void main(String[] args){
		new exercise4().start();
	}
}

