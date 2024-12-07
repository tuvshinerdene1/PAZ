import acm.program.*;

public class exercise6 extends ConsoleProgram{
	public void run(){
		float result = 4+9-2*16+(float)1/3*6-67+8*2-3+26-(float)1/34+(float)3/7+2-5;
		println("the result is : "+result );
	}
	public static void main(String[] args){
		new exercise6().start();
	}
}
