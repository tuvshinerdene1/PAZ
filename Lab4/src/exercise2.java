import acm.program.ConsoleProgram;

public class exercise2 extends ConsoleProgram{
	public void run() {
		double b = readDouble("Enter b: "); //Gurwaljnii suuri
		double h = readDouble("Enter h: "); //gurwaljnii undur
		double a = (b*h)/2; //gurwaljnii talbai
		println("a = " + a);
	}
	public static void main(String[] args) {
		new exercise2().start();
	}
}