import acm.program.ConsoleProgram;
public class exercise2 extends ConsoleProgram{
	public void run(){
		
		String lastWord = "";
		String newline = System.lineSeparator();
		
		for(int i = 1; i <= 10; i++){
			switch(i){
			case 1: lastWord = "thumb";break;
			case 2: lastWord = "shoe";break;
			case 3: lastWord = "knee";break;
			case 4: lastWord = "door";break;
			case 5: lastWord = "hive";break;
			case 6: lastWord = "sticks";break;
			case 7: lastWord = "heaven";break;
			case 8: lastWord = "pate";break;
			case 9: lastWord = "spine";break;
			case 10: lastWord = "shin";	break;	
			}
			
			println("This old man, he played "+i);
			println("He played knick-knack on my "+lastWord);
			println("With a knick-knack, paddy-whack");
			println("Give your dog a bone");
			println("This old man came rolling home.");
			println(newline);
		}
	}
	
	public static void main(String[] args){
		new exercise2().start();
	}
}

