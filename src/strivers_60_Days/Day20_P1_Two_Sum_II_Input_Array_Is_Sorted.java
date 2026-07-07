package strivers_60_Days;

import java.util.Arrays;

public class Day20_P1_Two_Sum_II_Input_Array_Is_Sorted {

	public static void main(String[] args) {
		int[]num= {2,7,11,15};
		int target = 9;
		int[]arr=twoSum(num, target);
		System.out.println(Arrays.toString(arr));

	}

	
	    public static int[] twoSum(int[] numbers, int target) {
	        int[]arr;
	        int left = 0;
	        int right = numbers.length-1;
	        while(left<right){
	            int sum=numbers[left]+numbers[right];
	            if(sum==target){
	                return new int[]{left+1,right+1};
	            }
	            else if(sum>target){
	                right--;
	            } else{
	                left++;
	            }
	        }
	        return new int[]{-1,-1} ;
	    }
}

