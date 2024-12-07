import acm.program.*;
import acm.util.RandomGenerator;
public class exercise7 extends ConsoleProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private final int MAXNUM = 30;
	private final int PROBLEMCOUNT = 10;
	
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
	private String generateCompliment(){
		int num = rgen.nextInt(8);
		String result = " ";
		switch(num){
		case 0: result = " You must be a genius! ";break;
		case 1: result = " You will make Newton run for his money!"; break;
		case 2: result = " Are you an Asian? ";break;
		case 3: result = " You will make a damn fine mathematician! ";break;
		case 4: result = " How are you this smart? ";break;
		case 5: result = " Your parents must be proud of you! "; break; 
		case 6: result = " Goy baina ";break;
		case 7: result = " Ynziin baina";break;
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
					println(generateCompliment());
					break;
				}
				else{
					
					if(j == 2){
						println("No, the answer was "+correctAnswer);
					}
					else{
						println("That's incorrect - try again different answer: ");
					}
				}
			}
		
		}
	}
	public static void main(String[] args){
		new exercise7().start();
	}
}
