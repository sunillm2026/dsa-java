package strivers_60_Days;

import java.util.Arrays;

public class Day2_P2_SecondLargestElement {

	public static void main(String[] args) {
		int[]arr= {1,2,4,5,7,7};
		Arrays.sort(arr);
		int largest=arr[arr.length-1];
		int secondLargest=0;
		System.out.println(largest);
		for(int i=arr.length-1;i>1;i--) {
			if(arr[i]!=largest) {
				secondLargest=arr[i];
				break;
			}
		}
		System.out.println(secondLargest);

	}

}
