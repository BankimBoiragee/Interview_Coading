package java_practice;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String yourString ="Ban%$^$kim";
		//Only for number  "[^0-9]";
		//number and character "[^A-Za-z0-9]";
		String result = yourString.replaceAll("[^\\w\\s]",""); //[-+.^:,]
		//String result = yourString.replaceAll("[^0-9]","");
		System.out.println(result);
	}
/*public static void remSplChar() {
	String name="Ban%$^$kim";
	String result=name.replaceAll("[-+.^:,]","");
	System.out.println(result);
}*/
}
