package java_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Object> number=new ArrayList<Object>(Arrays.asList(10,"Tan","Tan",10,30,30,40,40));
		//number.add(10);
		List<Object> duplicate=number.stream().distinct().collect(Collectors.toList());
		System.out.println(duplicate);
		
	}
	/*
	public static void removeDuplicate() {
		List<Object> list=new ArrayList<Object>(Arrays.asList("Ariyan","Aritra","Ariyan","Aritra",20,20,10,10,30,30));
	List<Object> duplicate=list.stream().distinct().collect(Collectors.toList());
	System.out.println(duplicate);
	
	}*/
	/*public static void removeDuplicate() {
		List<Integer> number=new ArrayList<Integer>();
		number.add(10);
		number.add(20);
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		number.add(50);
		List<Object> dulicate=number.stream().distinct().collect(Collectors.toList());
		System.out.println(dulicate);
	}*/
	/*public static void rem_Dup() {
		List<Integer> number=new ArrayList<Integer>();
		number.add(10);
		number.add(12);
		number.add(10);
		number.add(12);
		number.add(14);
		number.add(15);
		number.add(14);
		number.add(12);
		List<Object> duplicate1= number.stream().distinct().collect(Collectors.toList());
		System.out.println(duplicate1);
	}*/
	/*public static void rem_Dup() {
		List<Integer> num=new ArrayList<Integer>(Arrays.asList(10,10,12,12,15,16,17));
		List<Integer> duplicate=num.stream().distinct().collect(Collectors.toList());
	}*/
	/*public static void remDuplicate() {
		List<Integer> number=new ArrayList<>(Arrays.asList(12,15,12,13,14,15,15,16,16));
		List<Integer> duplicate=number.stream().distinct().collect(Collectors.toList());
		
	}*/
	/*public static void remDup() {
		List<Integer> number=new ArrayList<>(Arrays.asList(8,10,12,8,10,12,14,16));
		List<Integer> duplicate=number.stream().distinct().collect(Collectors.toList());
		System.out.println(duplicate);
	}*/
	/*public static void remDuplicate() {
		List<String> name=new ArrayList<>();
		name.add("Java");
		name.add("Selenium");
		name.add("Java");
		name.add("Selenium");
		name.add("Cucumber");
		name.add("TestNG");
		name.add("Cucumber");
		name.add("Selenium");
		List<String> remove=name.stream().distinct().collect(Collectors.toList());
	}*/
/*public static void remDuplicate() {
	List<Integer> number=new ArrayList<>(Arrays.asList(22,24,22,28,29,28,32,32,30));
	List<Integer> duplicate=number.stream().distinct().collect(Collectors.toList());
	System.out.println(duplicate);
	
}*/
	/*public static void remDup() {
		List<Integer> number=new ArrayList<>(Arrays.asList(5,6,8,2,5,6,7,8));
		List<Integer> duplicate=number.stream().distinct().collect(Collectors.toList());
		System.out.println(duplicate);
	}*/
}
