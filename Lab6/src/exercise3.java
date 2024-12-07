import acm.program.ConsoleProgram;
public class exercise3 extends ConsoleProgram{
	public void run(){
		
		int N = readInt("N = ");
		
		for(int i = 1; i <= N; i++){
			if((i%6==0 || i%7==0)&&(!(i%6==0&&i%7==0))){
				println(i);
			}
		}
	}

	public static void main(String[] args){
		new exercise3().start();
	}
}

