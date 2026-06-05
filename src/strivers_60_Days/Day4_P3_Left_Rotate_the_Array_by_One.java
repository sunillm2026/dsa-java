package strivers_60_Days;

// BRUTEFORCE Left Rotate the Array by One
//public class Day4_P3_Left_Rotate_the_Array_by_One {
//
//	public static void main(String[] args) {
//		int[]arr= {1,2,3,4,5};
//		int n=5;
//		int[]temp= new int[n];
//		
//		//shifting the array elements by one
//        for(int i=1;i<n;i++) {
//        	temp[i-1]=arr[i];
//        }
//        
//        // storing temp[last position]=arr[i]
//        temp[n-1]=arr[0];
//        
//        // printing the array
//        for(int i=0;i<n;i++) {
//        	System.out.print(temp[i]+" ");
//        }
			

//  OPTIMAL SOLUTION Left Rotate the Array by One
import java.util.*;
public class Day4_P3_Left_Rotate_the_Array_by_One {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Solution solution = new Solution();
		solution.rotateArrayByOne(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
}


class Solution {
	void rotateArrayByOne(int[] arr) {
		// storing the first element of array in temporary variable 
		 int temp=arr[0];
		 
		 // shifting all the elements of the array by one
		 for(int i=1;i<arr.length;i++) {
			 arr[i-1]=arr[i];
		 }
		 // placing the temporary variable to last position
		 arr[arr.length-1]=temp;
	}
}
