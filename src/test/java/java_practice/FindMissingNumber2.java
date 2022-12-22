package java_practice;

public class FindMissingNumber2 {
	public static void main(String[] args) {

		int[] arr = {1, 3, 4, 2, 6 };
		int n = arr.length + 1;
		//System.out.println(n);

		int sum = (n * (n + 1)) / 2;
		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr [i];
		}
		
		System.out.println("Missing number is " + sum);
	}

}
