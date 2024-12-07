
import acm.program.DialogProgram;

public class exercise3 extends DialogProgram{
	public void run() {
		println("this program adds 3 numbers.");
		int n1 = readInt("enter n1: ");
		int n2 = readInt("enter n2: ");
		int n3 = readInt("enter n3: ");
		int total = n1 + n2 + n3;
		println("The total is "+ total);
	}
	public static void main(String[] args) {
		new exercise3().start();
	}
}
