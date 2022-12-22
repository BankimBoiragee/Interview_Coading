package java_practice;

public class deleteChar_Rev {
	public static void main(String[] args) {
		
	String name = "infosys";
	
	String NewValue = name.replaceAll("s", "");//[so] for more than one character
		
	System.out.println(NewValue);
	StringBuffer rev = new StringBuffer(NewValue);

	String reverse = rev.reverse().toString();
	System.out.println(reverse);
	
	}
	//Practice
	/*public static void deleteCharAndRev() {
		String name="Infosis";
		String newvalue=name.replaceAll("s", "");
		System.out.println(newvalue);
		StringBuffer rev= new StringBuffer(newvalue);
		String reverse=rev.reverse().toString();
		System.out.println(reverse);
	}*/
/*public static void remAndReverse() {
	String name="Infosis";
	String newname=name.replaceAll("s","");
	System.out.println(newname);
	StringBuffer rev=new StringBuffer(newname);
	String reverse=rev.reverse().toString();
	System.out.println(reverse);
	
}*/
	/*public static void remReverse() {
		String name="Infosys";
		String newName=name.replaceAll("s", "");
		System.out.println(newName);
		StringBuffer rev= new StringBuffer(newName);
		String reverse=rev.reverse().toString();
		System.out.println(reverse);
	}*/
	/*public static void rem_Reverse() {
		String name="Capzamini";
		String newName=name.replaceAll("i", "");
		System.out.println(newName);
		StringBuffer rev=new StringBuffer(newName);
		String reverse=rev.reverse().toString();
		System.out.println(reverse);
	}*/
	/*public static void remReverse() {
		String name="Cognizant";
		String newName=name.replaceAll("n", "");
		System.out.println(newName);
		StringBuffer rev=new StringBuffer(newName);
		String reverse=rev.reverse().toString();
		System.out.println(reverse);
	}*/
	/*public static void delCharRev() {
		String name="Aritra";
		String newName=name.replaceAll("r","");
		StringBuffer rev= new StringBuffer(newName);
		String reverse=rev.reverse().toString();
		System.out.println(reverse);
	}*/
	/*public static void replaceRev() {
		String name="Souhardra";
		String newName=name.replaceAll("a","");
		System.out.println(newName);
		StringBuffer rev=new StringBuffer(newName);
		String reverse=rev.reverse().toString();
		System.out.println(reverse);
	}*/
	
}
