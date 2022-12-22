package java_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Occuring_String {

	public static void main(String[] args) {
		String inputString = "hello";   //Capzamini
		// Creating a HashMap containing char
		// as a key and occurrences as a value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		// Converting given string to char array
		//Converts the given string into a sequence of characters.
		char[] strArray = inputString.toCharArray();
		// checking each char of strArray
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				// If char is present in charCountMap,
				// incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} 
			else {
				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}

		// Printing the charCountMap
		for (Entry<Character,Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
//Practice
	/*public static void occuringString() {
		String inputString="Infosys";
		HashMap<Character, Integer> charcountmap= new HashMap<Character, Integer>();
		char[] strArray= inputString.toCharArray();
		for(char c: strArray) {
			if(charcountmap.containsKey(c)) {
				charcountmap.put(c,charcountmap.get(c)+1);
								
			}
			else{
			charcountmap.put(c, 1);
			
		}
		for(Map.Entry entry : charcountmap.entrySet()) {
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
	}*/
	/*public static void countCharacter() {
		String inputString="capjamini";
		Map<Character, Integer> charcountMap= new HashMap<Character, Integer>();
		char[] strArray= inputString.toCharArray();
		for(char c: strArray) {
			if(charcountMap.containsKey(c)) {
				charcountMap.put(c,charcountMap.get(c)+1);
								
			}
			else {
				charcountMap.put(c,1);
			}
		}
		for(Map.Entry entry: charcountMap.entrySet()) {
			System.out.println(entry.getKey() +" " + entry.getValue());
			
		}
	}*/
	/*public static void occuringString() {
		String inputstring="cognizant";
		HashMap<Character, Integer> charCount= new HashMap<>();
		char[] strArray=inputstring.toCharArray(); //c,o,g,n,i,z,a,n,t
		for(char c:strArray) {
			if(charCount.containsKey(c)) {
				charCount.put(c,charCount.get(c)+1);
				
			}
			else {
				charCount.put(c,1);
			}
		}
		for(Map.Entry entry:charCount.entrySet()) {
			System.out.println(entry.getKey() + " " +entry.getValue());
			
		}
	}*/
	/*public static void occuringString() {
		String inputString="Bangladesh";
		HashMap<Character, Integer> charCount=new HashMap<Character, Integer>();
		char[] strArray=inputString.toCharArray();
		for(char c:strArray) {
			if(charCount.containsKey(c)) {
				charCount.put(c,charCount.get(c)+1);
			}
			else {
				charCount.put(c,1);
			}
		}
		for(Map.Entry entry:charCount.entrySet()) {
			System.out.println(entry.getKey()+"" + entry.getValue());
		}
	}*/
	/*public static void occuringStr() {
		String inputString="Bangladesh";
		HashMap<Character, Integer> charCount= new HashMap<>();
		char[] strArray=inputString.toCharArray();
		for(char c:strArray) {
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
								
			}
			else {
				charCount.put(c,1);
			}
		}
		for(Map.Entry entry: charCount.entrySet()) {
			System.out.println(entry.getKey()+"" +entry.getValue());
			
		}
	}*/
/*public static void getOccuring() {
	String inputString="Bangladesh";
	HashMap<Character, Integer> charCount=new HashMap<>();
	char[] strArray=inputString.toCharArray();
	for(char c: strArray) {
		if(charCount.containsKey(c)) {
			charCount.put(c,charCount.get(c)+1);
			
		}
		else {
			charCount.put(c,1);
		}
	}
	for(Entry<Character, Integer> entry:charCount.entrySet()) {
		System.out.println(entry.getValue()+""+entry.getKey());
		
	}
}*/
	/*public static void getOccuringStr() {
		String inputStr="hello";
		HashMap<Character, Integer> charCountMap=new HashMap<>();
		char[]strArray= inputStr.toCharArray();
		for(char c: strArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
								
			}
			else {
				charCountMap.put(c,1);
			}
		}
		for(Entry<Character,Integer> entry:charCountMap.entrySet()) {
			System.out.println(entry.getValue()+""+ entry.getKey());
			
		}
	}*/
	}


