package java_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Merge_Arrays {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};//1st array
		int b[]= {50,60,70,80};
		int a1=a.length;       //length of first array
		int b1=b.length;
		int c1=a1+b1;         //Resultant array size
		int c[]=new int[c1];  //Create resultant array,c[]=8
		//System.arraycopy(c, a1, c, b1, c1);
		System.arraycopy(a, 0, c, 0, a1);  // Predefined function array copy
		System.arraycopy(b, 0, c, a1, b1);
		System.out.println(Arrays.toString(c)); //Print the resultant array
		
/*int arr1[]= {80,10,15,2,35,60};//Merge two array and return common number
int arr2[]= {35,80,60,20,75};
//printIntersection(arr1, arr2);
printUnion(arr1,arr2); //For unique value
	}
public static void printIntersection(int arr1[], int arr2[]) {
	Set<Integer> set= new HashSet<>();
	for(int i=0; i<arr1.length;i++) {
		set.add(arr1[i]);

	}
	for(int i=0; i<arr2.length; i++) {
		if(set.contains(arr2[i])) {
			System.out.println(arr2[i] + "");
		}
			
  }
}
public static void printUnion(int arr1[], int arr2[]) {
	Set<Integer> set= new HashSet<>();
	for(int i=0; i<arr1.length;i++) {
		set.add(arr1[i]);

	}
	for(int i=0; i<arr2.length; i++) {
		if(set.contains(arr2[i])) {
			set.add(arr2[i]);
		}
		System.out.println("Union");
		System.out.println(set);
  }*/
}
}
