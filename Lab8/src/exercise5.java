import acm.program.*;
import acm.util.RandomGenerator;
public class exercise5 extends ConsoleProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public String randomString(){
		int num = rgen.nextInt(6);
		String result = "";
		switch(num){
		case 0 : result = "LEMON";break;
		case 1 : result = "CHERRY";break;
		case 2 : result = "ORANGE";break;
		case 3 : result = "PLUM";break;
		case 4 : result = "BELL";break;
		case 5 : result = "BAR";break;
		}
		return result;
	}
	
	public void run(){
		int startMoney = 50;
		int penalty = 5;
		int money = startMoney;
		
		String newline = System.lineSeparator();
		
		
		String answer = readLine("Would you like instructions?");
		if(answer.equals("yes")){
			println("You have "+money+" dollars and you can play each turn for 10 dollars.");
			println("If you want to play just type 'yes' ");
		}
		
		while(money>0){
			print("You have $"+money+". Would you like to play? ");
			answer = readLine();
			if(answer.equals("yes")){
				String first = randomString();
				String second = randomString();
				String third = randomString();
				print(first+" "+second+" "+third+" -- ");
				if(first=="LEMON" || second=="LEMON" || third == "LEMON"){
					print("You lose"+newline);
					money -= penalty;
				}
				else if(first == "BAR" && second == "BAR" && third == "BAR"){
					print("You win $250 "+newline);
					money += 250;
				}
				else if(first == "BELL" && second == "BELL"&& (third == "BELL"||third=="BAR")){
					print("You win $20 "+newline);
					money += 20;
				}
				else if(first == "PLUM" && second == "PLUM"&& (third == "PLUM"||third=="BAR")){
					print("You win $14"+newline);
					money += 14;
					
				}
				else if(first == "ORANGE" && second == "ORANGE"&& (third == "ORANGE"||third=="BAR")){
					print("You win $10 "+newline);
					money += 10;
				}
				else if(first=="CHERRY"&& second == "CHERRY" && third == "CHERRY"){
					print("You win $7 "+newline);
					money += 7;
				}
				else if (first == "CHERRY" && second == "CHERRY"&& third != "CHERRY"){
					print("You win $5 "+newline);
					money += 5;
				}
				else if(first == "CHERRY" && second != "CHERRY" && third != "CHERRY"){
					print("You win $2 "+newline);
					money += 2;
				}
				else{
					print("You lose"+newline);
					money -= penalty;
				}
				
			
			}
			else if(answer.equals("no")){
				println("Thanks for playing");
				break;
			}
			else{
				println("Incorrect answer. Please type just 'yes' or 'no'");
			}
		}
		println("Your remaining money is: "+money);
		println("You gained"+(money-startMoney));
	}
	public static void main(String[] args){
		new exercise5().start();
	}
}
