import acm.program.*;
import acm.util.RandomGenerator;
public class exercise6 extends ConsoleProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private final int MAXNUM = 20;
	private final int PROBLEMCOUNT = 5;
	
	private int[] generateProblem(){
		int[] result;
		result = new int[3];
		
		result[0] = rgen.nextInt(MAXNUM+1);
		
		if(rgen.nextBoolean()){
			result[1] = 1;
		}
		else{
			result[1] = -1;
		}
		
		if(result[1]==-1){
			result[2] = rgen.nextInt(result[0]+1);
		}
		else{
			result[2] = rgen.nextInt(MAXNUM+1);
		}
		
		
		return result;
	}
	
	public void run(){
		println("This programm will give you "+PROBLEMCOUNT+" simple math problems");
		
		for(int i = 0 ; i < PROBLEMCOUNT ; i++){
			
			int[] problem = new int[3];
			problem = generateProblem();
			
			int correctAnswer = problem[0] + problem[1]*problem[2];
			
			String symbol = " + ";
			if(problem[1]==-1){
				symbol = " - ";
			}
			
			print("What is "+problem[0]+symbol+problem[2]+"? ");
			
			int j;
			for(j = 0 ; j < 3 ; j++){
				int answer = readInt();
				if(answer == correctAnswer){
					println("That's the answer!");
					break;
				}
				else{
					println("That's incorrect - try again different answer: ");
				}
			}
			if(j == 3){
				println("No, the answer was "+correctAnswer);
			}
		}
	}
	public static void main(String[] args){
		new exercise6().start();
	}
}
