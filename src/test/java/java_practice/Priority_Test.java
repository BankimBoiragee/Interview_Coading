package java_practice;

import org.testng.annotations.Test;

public class Priority_Test {
	@Test(priority=0)
	public static void aeroplaneTest2() {
		System.out.println("Aeroplane Test");//Down stream execute first and then follow the Alphabetic way
	}
		
	/*@Test(priority=0)
	public static void driveTest() {
		System.out.println("Drive Test");
	}*/
	@Test(priority=1)
	public static void priorityTest1() {
		System.out.println("Priority Test");
	}
	/*@Test(priority=0)
	public static void aeroplaneTest2() {
		System.out.println("Aeroplane Test");
	}*/

	@Test(priority=0)
	public static void driveTest() {
		System.out.println("Drive Test");
	}

}
