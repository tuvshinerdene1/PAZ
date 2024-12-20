import acm.program.ConsoleProgram;
import java.lang.*;

public class Exercise4 extends ConsoleProgram{
	
	private static final int garbageCount = 9999;
	
	public void run(){
		println("Garbage collector example!!!");
		
		Runtime myRunTime = Runtime.getRuntime();
		long preSpace = myRunTime.freeMemory();
		
		println("Before creating garbage "+ preSpace);
		println("Allocating "+garbageCount+" Rational objects");
		
		for(int i = 0 ; i < garbageCount; i++){
			new Rational(i,i+1);
		}
		
		preSpace = myRunTime.freeMemory();
		println("before collecting garbage "+preSpace);
		
		myRunTime.gc();
		
		long postSpace = myRunTime.freeMemory();
		println("after collecting garbage "+postSpace);
		
		println("Garbage collection freed "+(postSpace- preSpace)+" bytes");
	}
	
	public static void main(String[] arg){
		new Exercise4().start();
	}
}
