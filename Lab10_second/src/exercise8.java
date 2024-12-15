import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
import java.lang.*;

public class exercise8 extends ConsoleProgram{
	
	public void run(){
		println("this program encodes a message using a Caesar cipher");
		
		int cipher = readInt("enter the number of character positions to shift: ");
		String message = readLine("Enter a message: ");
		
		println("Encoded message: "+encodeCaesarCipher(message, cipher));
		
	}
	
	private String encodeCaesarCipher(String str, int shift){
		String result = "";
		for(int i = 0 ; i < str.length() ; i++){
			if(Character.isLetter(str.charAt(i))){
				int code = (int)str.charAt(i);
				code += shift;
				if(str.charAt(i) >= 'A'&& str.charAt(i) <= 'Z'){
					if(code > 90){
						code = 65 + code%90 - 1;
					}
				}
				if(str.charAt(i) >= 'a'&& str.charAt(i) <= 'z'){
					if(code > 122){
						code = 97 + code%122 - 1;
					}
				}
				result += (char) code;
				continue;
			}
			result += str.charAt(i);
		}
		
		return result;
	
	}
	
	public static void main(String[] arg){
		new exercise8().start();
	}
}
