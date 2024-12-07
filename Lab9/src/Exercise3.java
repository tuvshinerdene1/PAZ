import acm.program.*;
import java.lang.*;
import acm.util.RandomGenerator;;
public class Exercise3 extends ConsoleProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private final int MAXNUM = 20;
	private final int PROBLEMCOUNT = 5;
	private final int TRY = 3;
	public int[] generateProblem(){
		int[] result;
		result = new int[3];
		
		result[0] = rgen.nextInt(MAXNUM+1);
		if(rgen.nextBoolean()){
			result[1] = 1;
		}
		else{
			result[1] = -1;
		}
		if(result[1] == -1){
			result[2] = rgen.nextInt(result[0]+1);
		}
		else{
			result[2] = rgen.nextInt(MAXNUM+1);
		}
		return result;
	}
	public void run(){
		println("This program will give you "+PROBLEMCOUNT+" problems and you must answer in octal!!!");
		
		for(int i = 0 ; i < PROBLEMCOUNT; i++){
			int[] problem = new int[3];
			problem = generateProblem();
			
			int correctAnswer = problem[0] + problem[1]*problem[2];
			
			String symbol = " + ";
			if(problem[1] == -1){
				symbol = " - ";
			}
			
			print("What is "+ problem[0]+symbol+problem[2]+"? :");
			
			int j;
			for( j = 0 ; j < TRY ; j++){
				String answer = readLine();
				if(Integer.parseInt(answer, 8)==correctAnswer){
					println("That's the answer! ");
					break;
				}
				else{
					println("That's incorrect - try again!!!");
				}
			}
			if(j==TRY){
				println("No, the answer was "+correctAnswer);
			}
		}
	}
	public static void main(String[] arg){
		new Exercise3().start();
	}
}
