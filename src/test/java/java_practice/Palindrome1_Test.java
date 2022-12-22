package java_practice;

public class Palindrome1_Test {

	public static void main(String[] args) {
		String name="LOL";                     //MOM,454,
		StringBuffer rev=new StringBuffer(name);
		String text=rev.reverse().toString();
		System.out.println("After reverse:"+text);
		if(name.equals(text)) {
			System.out.println("This is a Palindrome number:");
		}
		else {
			System.out.println("This is not a Palindrome number:");
		}
		
		

	}
	//Practice
	/*public static void polindrome2() {
		String name2="MOM";
		StringBuffer revr=new StringBuffer(name2);
		String texts=revr.reverse().toString();
		System.out.println("After Reverse:"+texts);
		if(name2.equals(texts)) {
			System.out.println("This is a palindrom number");
			
		}
		else {
			System.out.println("This is not a palindrom number");	
		}
		
	}*/
	/*public static void palnDrome() {
		String name="mom";
		StringBuffer rev=new StringBuffer();
		String text=rev.reverse().toString();
		System.out.println("After Reverse"+text);
		if(name.equals(text)) {
			System.out.println("This is Palindrome Number");
			
		}
		else {
			System.out.println("This is not Palindrome number");
		}
	}*/

}
