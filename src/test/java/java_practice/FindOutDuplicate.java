
package java_practice;

public class FindOutDuplicate {
	
	
	public static void main(String[] args) {
		int num[]= {2,2,4,4,6,7,7,8,8};
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
				System.out.println("Duplicate numbers are:"+num[i]);
				
			}
		}
	}
		//FindOutDuplicate.find_Dup();
}
/*public static void findDuplicate() {
	int num[]= {10,12,14,16,14,12,16,18,18};
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;i<num.length;j++) {
			if(num[i]==num[j]) {
				System.out.println("duplicate number is:"+num[i]);
			}
			
		}
		
	}
}*/
	/*public static void findDuplicate() {
		int number[]= {10,20,10,20,25,30,25,30};
		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number[i]==number[j]) {
					System.out.println("Duplicate Number is:"+number[i]);
				}
			}
			
		}
		
	}*/
	/*public static void find_Dup() {
		String name[]= {"Java","Java","Maven","Cucumber","Jenkin"};
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i]==name[j]) {
					System.out.println("Duplicate name is: " +name[i]);
					
				}
				
			}
			
		}
	}*/
	/*public static void find_Dup() {
		String tools[]= {"Java","Maven","Maven","Cucumber","Jenkin","Cucumber"};
		for(int i=0;i<tools.length;i++) {
			for(int j=i+1;j<0;j++) {
				if(tools[i]==tools[j]) {
					System.out.println("Duplicate tools:"+tools[i]);
					
				}
				
			}
			
		}
	}*/
	/*public static void find_Duplicate() {
		int number[]= {10,12,15,12,10,15,15};
		for(int i=0;i<=number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number[i]==number[j]) {
					System.out.println("Duplicate number:" +number[i]);
					
				}
				
			}
			
		}
	}*/
	/*public static void findDuplicate() {
		int num[]= {2,2,3,3,4,5,6,7,7};
		for(int i=0;i<=num.length;i++) {
			for(int j=i+1;j<=num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println("Duplicate Number: " +num[i]);
					
				}
				
			}
		}
	}*/
	/*public static void findOutDuplicate() {
		String name[]= {"Java","Selenium","Jenkin","Selenium","Java"};
		for(int i=0;i<=name.length;i++) {
			for(int j=i+1;j<=name.length;j++) {
				if(name[i]==name[j]) {
				System.out.println("Duplicate: "+name[i]);	
				}
				
			}
			
		}
	}*/
	/*public static void find_Duplicate() {
		int number[]= {10,12,15,16,12,15,16,18};
		for(int i=0;i<=number.length;i++) {
			for(int j=i+1;j<=number.length;j++) {
				if(number[i]==number[j]) {
					System.out.println("Duplicate:"+number[i]);
					
				}
				
			}
			
		}
	}*/
	/*public static void findDuplicate() {
		int number[]= {10,12,15,16,18,12,14,15};
		for(int i=0; i<=number.length;i++) {
			for(int j=i+1;j<=number.length;j++) {
				if(number[i]==number[j]) {
					System.out.println("Duplicate numbers are:" +number[i]);
					
				}
				
			}
			
		}
	}*/
	/*public static void findDuplicate() {
		int num[]= {7,8,12,12,10,10,18,20,18};
		for(int i=0;i<=num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println("Duplicate number are:"+num[i]);
					
				}
				
			}
			
		}
	}*/
	/*public static void findDuplicate() {
		String name[]= {"Java","Selenium","Cucumber","Java","Selenium","TestNG"};
		for(int i=0;i<=name.length;i++) {
			for(int j=i+1;j<=name.length;j++) {
				if(name[i]==name[j]) {
					System.out.println("Duplicates are:"+name[i]);
					
				}
				
			}
			
		}
	}*/
	/*public static void findDuplicate() {
		String tools[]={"Java","Selenium","Maven","Java","Cucumber","Selenium"};
		for(int i=0;i<=tools.length; i++) {
			for(int j=i+1;i<=tools.length; j++) {
				if(tools[i]==tools[j]) {
					System.out.println("Duplicate:"+tools[i]);
				}
			}
		}
	}*/
}
