package java_practice;

public class Findout_Vowel {
public static void main(String[]args) {
String str="Souhardra";
//String str= new String("Well come to my World");
//The length() is used to find the length of a string,i.e.,
//the number of characters present in the string.
for(int i=0;i<str.length();i++) { 
// charAt() function in Java is used to read characters at a particular index number.
// ||(Logical or) Or operator
if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
	System.out.println(str.charAt(i));	
	//System.out.println("Given string contains " + 
    // str.charAt(i)+" at the index " + i);
			}
			
		}
		
	}
/*public static void findVowel() {
	String name="Infosis";
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
			System.out.println("Vawel are: "+name.charAt(i));
		}
		
	}
}*/
	/*public static void findVowel() {
		String name="Infosis";
		for(int i=0;i<=name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				System.out.println("Vawel are:"+name.charAt(i));
				
			}
			
		}
	}*/
	/*public static void findVowel() {
		String str="Capjamini";
		for(int i=0; i<=str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				System.out.println(str.charAt(i));
				
			}
			
		}
	}*/
	/*public static void findVowel() {
		String str="Cognizant";
		for(int i=0; i<=str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				System.out.println(str.charAt(i));
				
			}
			
		}
	}*/
	/*public static void findVowel() {
		String str="cognizant";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				System.out.println(str.charAt(i));
				
			}
			
		}
	}*/
	/*public static void findVowel() {
		String str="Aritra";
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				System.out.println(str.charAt(i));
			}
		}
	}*/
}
