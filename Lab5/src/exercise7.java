import acm.program.*;

public class exercise7 extends ConsoleProgram{
	public void run(){
		println("Kilogram to pound and ounce program");
		
		double kg = readDouble("Enter kg: ");
		double pound = kg*2.2;
		double ounce = pound*16;
		
		println(kg + " kg is equilvant of "+pound+" pounds or "+ounce+" ounces");
	}
	public static void main(String[] args){
		new exercise7().start();
	}
}
