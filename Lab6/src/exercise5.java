import acm.program.ConsoleProgram;
public class exercise5 extends ConsoleProgram{
	public void run(){
		
		println("this program will calculate digital root of given number");
		int number = readInt("Enter the number: ");
		int temp = number;
		
		while(temp>=10){
			int sum = 0;
			while(temp>0){
				sum += temp%10;
				temp/=10;
			}
			temp = sum;
		}
		
		println("Digital root is : "+temp);
	}
	public static void main(String[] args){
		new exercise5().start();
	}
}

