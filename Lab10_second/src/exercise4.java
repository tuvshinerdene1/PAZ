import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

import java.lang.*;

public class exercise4 extends ConsoleProgram{
	
	public void run(){
		int day = readInt("Enter the day: ");
		int month = readInt("Enter the month: ");
		int year = readInt("Enter the year");
		
		String result = createDateString(day, month, year);
		println(result);
	}
	
	String createDateString(int day, int month, int year){
		String result = "";
		result += day;
		
		String monthName;
		switch(month){
		case 1: monthName = "JAN";break;
		case 2: monthName = "FEB";break;
		case 3: monthName = "MAR";break;
		case 4: monthName = "APR";break;
		case 5: monthName = "MAY";break;
		case 6: monthName = "JUN";break;
		case 7: monthName = "JUL";break;
		case 8: monthName = "AUG";break;
		case 9: monthName = "SEP";break;
		case 10: monthName = "OCT";break;
		case 11: monthName = "NOV";break;
		case 12: monthName = "DEC";break;
		default: return("Invalid month");
		}
		if(day <1 || day > 31){
			return("Invalid day");
		}
		else if (!(day==28 || day == 29) && month == 2 ){
			if(!((year%4==0 && year%100!=0)||(year%400==0))&&day==29){
				return ("The given date is invalid because "+year+" is not a leap year.");
			}
			return("Invalid day");
		}
		else if(day == 31 && month!=1 && month!=3 && month!= 5 && month!= 7 && month!=8 && month!=10 && month!= 12 ){
			return("Invalid day");
		}
		else if(day == 30 && month!=4 && month!=6 && month!= 9 && month!= 11){
			return("Invalid day");
		}
		
		result += ("-"+monthName+"-"+year);
		return result;
	}
	
	
	
	public static void main(String[] arg){
		new exercise4().start();
	}
}
