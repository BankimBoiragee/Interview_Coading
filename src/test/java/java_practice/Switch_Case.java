
package java_practice;

public class Switch_Case {
	//What is the switch case
	//What is the Switch Statement
	//How to use the Switch Statement
	//Where you use the Switch Statement

	public static void main(String[] args) { 
		//Basically any thing I want to switch another valu to other value then I use switch statement
		//Same code use different environments like UAT,QA,DEV then I have to use the Switch
		//Statement
		//If I want to switch the value one value to anothe value then I have to use 
		//the Switch statement
		Switch_Case.getDays(4);
	}
	public static void getDays(int days) {
		int day=days;
		String daysString;
		switch(day){
		case 1:
			daysString="Manager"	;
			break;
		case 2:
			daysString="Supervisor";
			break;
		case 3:
			daysString="Super user";
			break;
		case 4:
			daysString="Clark user";
			break;
		case 5:
			daysString="Corporate user";
			break;
		case 6:
			daysString="Saturday";
			break;
		case 7:
			daysString="Sunday";
			break;
		default:
			daysString="Invalid days";
			break;
			
			
		}
		System.out.println("Today is : "+daysString);
	}
	
/*public static void switchCase(String state) {
		
		switch (state) {
		
		case "CA":
			System.out.println(" xpath 1");
			break;
			
		case "VA":
			System.out.println("xpath 2");
			break;
			
		case "NY":
			System.out.println("xpath 3");
			break;
			
		case "PA":
			System.out.println("xpath 4");
			break;
		case "NJ":
			System.out.println("xpath 5");
			break;
			
		case "FL":
			System.out.println("xpath 6");
			break;

		case "TN":
			System.out.println("xpath 7");
			break;

		default:
			System.out.println(" Another xpath");

		}

	}*/

}
