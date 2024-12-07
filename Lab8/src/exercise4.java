import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class exercise4 extends ConsoleProgram{
	
	final int atoms = 10000000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run(){
		
		int remaining = atoms;
		int year = 1;
		
		println("There are "+atoms+" atoms initially");
		
		while(remaining >0 ){
			
			int destroyedCount = 0;
			
			for(int i = 0 ; i < remaining; i++){
				boolean isDestroyed = rgen.nextBoolean();
				if(isDestroyed){
					destroyedCount++;
				}
			}
			remaining -= destroyedCount;
			println("There are "+remaining+" atoms at the end of year "+year);
			year ++;
		}
		
	}
	public static void main(String[] args){
		new exercise4().start();
	}
}
