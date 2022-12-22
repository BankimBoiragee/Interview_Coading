package java_practice;

public class Palindrome_Test {
	public static void main(String[] args) {
		String name="MOM";    //LOL,424
		String rev1="";
		for(int i=name.length()-1;i>=0;i--)
			rev1=rev1+name.charAt(i); //charAt()function in Java is used to read characters 
			//at a particular index number.
		System.out.println(rev1);
		
		if(name.equals(rev1)) {    //if(name.toLowerCase().equals(rev1.toLowerCase()))
		System.out.println("This is palindrome" );
	}
		else {
			System.out.println("This is not palindrome");	
		}
	}
	/*public static void paliDrome1() {
		String mum="MOM",rev1="";
		for(int i=mum.length()-1;i>=0;i--) {
			rev1=rev1+mum.charAt(i);
			
		}
		System.out.println(rev1);
		if(mum.equals(rev1)) {
			System.out.println("This is Palindrome");
			
		}
		else {
			System.out.println("This is not a palindrome");
		}
	}*/
	/*public static void find_Palindrome() {
		String name="MOM",rev1="";
		for(int i=name.length()-1;i>=0;i--) {
			rev1=rev1+name.charAt(i);
			
		}
		System.out.println(rev1);
		if(name.equals(rev1)) {
			System.out.println("This is Palindrome Number");
			
		}
		else {
			System.out.println("This is not Palindrome Number");
		}
	}*/
	/*public static void palinDrome() {
		String name="MOM", rev1="";
		for(int i=name.length()-1;i>=0;i--) {
			rev1=rev1+name.charAt(i);
						
		}
		System.out.println(rev1);
		if(name.equals(rev1)) {
			System.out.println("This is palindrome number");
			
		}
		else {
			System.out.println("This is not palindrome Number");
		}
	}*/
	/*public static void palinDrome() {
		String name="LOL", rev1="";
		for(int i=name.length()-1;i>=0;i--) {
			rev1=rev1+name.charAt(i);
			
		}
		System.out.println(rev1);
		if(name.equals(rev1)) {
			System.out.println("This is Palindrome number");
			
		}
		else {
			System.out.println("This is not palindrome number");
		}
	}*/
	/*public static void palinDrome() {
		String name="MOM",rev1="";
		for(int i=name.length()-1;i>=0;i--) {
			rev1=rev1+name.charAt(i);
			
		}
		System.out.println(rev1);
		if(name.equals(rev1)) {
			System.out.println("This is Palindrome:");
			
		}
		else {
			System.out.println("This is not Palindrome:");	
		}
	}*/
	/*public static void palindrome() {
		String name="MOM", rev1="";
		for(int i=name.length()-1;i>=0;i--) {
			rev1=rev1+name.charAt(i);
			
		}
		System.out.println(rev1);
		if(name.equals(rev1)) {
			System.out.println("This is palindrome :");
			
		}
		else {
			System.out.println("This is not palindrome");
		}
	}*/
	/*public static void palindrome() {
		String name="MOM", rev1="";
		for(int i=name.length()-1;i>=0;i--) {
			rev1=rev1+name.charAt(i);
						
		}
		System.out.println(rev1);
		if(name.equals(rev1)) {
			System.out.println("This is palindrome");
			
		}
		else {
			System.out.println("This is not palindrome");
		}
	}*/
	/*public static void palindrome() {
		String name="MOM", rev1="";
		for(int i=name.length()-1;i>=0;i--) {
			rev1=rev1+name.charAt(i);
			
		}
		System.out.println(rev1);
		if(name.equals(rev1)) {
			System.out.println("This is palindrome number");
			
		}
		else {
			System.out.println("This is not palindrome number");
		}
	}*/
	/*public static void palinDrome() {
		String name="level",rev1="";
		for(int i=name.length()-1;i>=0;i--) {
			rev1=rev1+name.charAt(i);
			
		}
		System.out.println(rev1);
		if(name.equals(rev1)) {
			System.out.println("This is Palindrome");
			
		}
		else {
			System.out.println("This is not Palindrome");
		}
	}*/
	/*public static void getPalinDrome() {
		String name="Level", rev1="";
		for(int i=name.length()-1;i>=0;i--) {
			rev1=rev1+name.charAt(i);
		}
		System.out.println(rev1);
		if(name.equals(rev1)) {
			System.out.println("This is a Palindrome:");
		}
		else {
			System.out.println("This is not Palindrome:");
		}
	}*/
}
