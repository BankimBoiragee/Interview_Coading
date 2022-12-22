package java_practice;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Asending_Order {

	public static void main(String[] args) {
		// SortedSet = Interface (Auto sorting order)
				// set = Instance
				//SortedSet<String> set = new TreeSet<String>();
				String name[] = { "Bankim", "Aritra", "Souhardra", "Ariyan", "Sourav"};
                SortedSet<String> set=new TreeSet<>();
				for (int i = 0; i < name.length; i++) {
					set.add(name[i]);

				}
				for (Object newvalue : set) {
					System.out.println(newvalue);
			}
				
	}
	/*public static void asendind() {
	String name = "nabgcdxswryz";

	char[] obj = name.toCharArray();

	Arrays.sort(obj);
	String str = new String(obj);
	System.out.println(str);
	}*/
	/*public static void sortAssc() {
		String name[]= {"Bankim","Sourav","Aritra","Souhardra","Taan"};
		SortedSet<String> set=new TreeSet<>();
		for(int i=0;i<name.length; i++) {
			set.add(name[i]);
		}
		for(Object newValue: set) {
			System.out.println(newValue);
			
		}
		
	}*/
	/*public static void sortAsc() {
		String name[]= {"xyz","pqr","abc","ryb"};
		SortedSet<String> set=new TreeSet<>();
		for(int i=0;i<name.length;i++) {
			set.add(name[i]);
			
		}
		for(Object newValue: set) {
			System.out.println(newValue);
			
		}
	}*/
	/*public static void sortAcs() {
		String name[]= {"Bankim","Ariyan","Aritra","Souhardra","Tann"};
		SortedSet<String> set= new TreeSet<>();
		for(int i=0;i<name.length;i++) {
			set.add(name[i]);
			
		}
		for(Object newValue:set) {
			System.out.println(newValue);
			
		}
	}*/
	/*public static void sortAsc() {
		String name[]= {"Souhardra","Aritra","Sourav","Ariyan","Tann"};
		SortedSet<String> set=new TreeSet<>();
		for(int i=0;i<name.length; i++) {
			set.add(name[i]);
			
		}
		for(Object newValue:set) {
			System.out.println(newValue);
			
		}
	}*/
	/*public static void assendingOrder() {
		String name[]= {"Aritra","Sourav","Souhardra","Tann","Ariyan"};
		SortedSet<String> set=new TreeSet<>();
		for(int i=0;i<name.length;i++) {
			set.add(name[i]);
		
		}
		for(Object newName:set) {
			System.out.println(newName);
		}
	}*/
}
