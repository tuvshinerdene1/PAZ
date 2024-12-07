import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
import java.math.*;
public class exercise3 extends ConsoleProgram{
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run(){
		
		int count = 0;
		int total = 999999999;
		
		for(int i = 0 ; i < total; i++){
			
			double x = rgen.nextDouble(-1.0  , 1.0);
			double y = rgen.nextDouble(-1.0, 1.0);
			
			if(Math.sqrt(x*x+y*y)<1){
				count ++;
			}
		}
		
		double pi = (double)count/(total/4);
				
		println("total tries: "+total);
		println("successful ones: "+ count);
		println("Calculating PI from this is : "+ pi);
	}
	
	public static void main(String[] args){
		new exercise3().start();
	}

}
