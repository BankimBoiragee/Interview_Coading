package java_practice;

public class Reverse_String {
	
	public static void main(String[] args) {
		String name= "Infosys",rev1= "";
		for(int i=name.length()-1;i>=0;i--) {
			rev1=rev1+name.charAt(i);
		}
		System.out.println(rev1);
		
	}
/*public static void revString() {
	String company="Cognijen", rev1= "";
	for(int i=company.length()-1;i>=0;i--) {
		rev1=rev1+company.charAt(i);
	}
	System.out.println(rev1);
}*/
	/*public static void revString() {
		String com="INFOSIS",rev1="";
		for(int i=com.length()-1;i>=0;i--) {
			rev1=rev1+com.charAt(i);
			
		}
		System.out.println(rev1);
	}*/
	/*public static void revString() {
		String company="Infosis", rev1= "";
		for(int i=company.length()-1;i>=0;i--) {
			rev1=rev1+company.charAt(i);
		}
		System.out.println(rev1);
	}*/
	
	/*public static void revStr() {
		String com="INFO", rev1="";
		for(int i=com.length()-1;i>=0;i--) {
			rev1=rev1+com.charAt(i);
		}
		System.out.println(rev1);
	}*/
	/*public static void rev_String() {
		String name="LOL", rev1="";
		for(int i=name.length()-1;i>=0;i--) {
			rev1=rev1+name.charAt(i);
			
		}
		System.out.println(rev1);
		if(name.equals(rev1)) {
			System.out.println("This is Palindrome Number");
			
		}
		else {
			System.out.println("This is not Palindrome number");
		}
		
	}*/
	/*public static void ReverseString() {
		String name="TCS", rev1="";
		for(int i=name.length()-1;i>=0;i--) {
			rev1=rev1+name.charAt(i);
			
		}
		System.out.println("After reverse"+rev1);
		if(name.equals(rev1)) {
			System.out.println("This is Palindrome number");
			
		}
		else {
			System.out.println("This is not Palindrome Number");
		}
	}*/
	/*public static void revString() {
		String num="LOL", rev1="";
		for(int i=num.length()-1;i>=0;i--) {
			rev1=rev1+num.charAt(i);
			
		}
		System.out.println(rev1);
		if(num.equals(rev1)) {
			System.out.println("This is palindrome:");
			
		}
		else {
			System.out.println("This is not palindrome");
		}
	}*/
}
