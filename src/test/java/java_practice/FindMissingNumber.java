package java_practice;

public class FindMissingNumber {
	// Driver Code
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 5 };
        int N = arr.length;
       
        // Function call
        System.out.println(getMissingNo(arr, N));
	}
	// Function to get the missing number
    public static int getMissingNo(int a[], int n)
    {
        int total = 1;
        for (int i = 2; i <= (n + 1); i++) {
            total += i;
            total -= a[i - 2];
        }
        return total;
    }
    /*public static void findMissingNumber() {
    	int arr[]= {3,2,1,5};
    	int N=arr.length;
    	System.out.println(getMissingNo(arr, N));
    }
    public static int getMissNo(int a[],int n) {
    	int total=1;
    	for(int i=2;i<=(n+1));i++ {
    	total +=i;
    	total -=a[i-2];
    	
    }
    return total;
    */
   
    }

