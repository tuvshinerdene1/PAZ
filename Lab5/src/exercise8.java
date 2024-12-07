import acm.program.*;

public class exercise8 extends ConsoleProgram{
	public void run(){
		println("Program to find average of 4 numbers");
		double[] numbers;
		numbers = new double[4];
		
		for(int i = 0; i < 4; i++){
			numbers[i] = readDouble("number "+(i+1)+" = ");
		}
		
		double sum = 0;
		
		for(int i = 0; i < 4; i++){
			sum += numbers[i];
		}
		
		double average = sum / 4;
		println("average = "+average);
		
	}
	public static void main(String[] args){
		new exercise8().start();
	}
}
