package strivers_60_Days;

import java.util.Arrays;
import java.util.*;
public class Day2_P1_Largest_Element_in_an_array {
	
	    //Brute Force Approach

//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=6;
//		int[]arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();		
//			}
//		Arrays.sort(arr);
//		System.out.println(arr[n-1]);
//	}
//
//}
	
	public static void main(String[] args) {
		int[]arr= {3,2,1,5,2};
		int largest=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println(largest);
	}

}
