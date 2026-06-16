package strivers_60_Days;

public class Day10_P2_Two_Sum_Brute_Force {

	public static void main(String[] args) {
		int[]arr= {2,6,5,8,11};
		int target= 14;
		twoSum(arr,target);
		
	}
		static void twoSum(int[]arr,int target) {
      		for(int i=0;i<arr.length;i++) {
	      		int sum=0;
		  	
			    for(int j=i+1;j<arr.length;j++) {
				   sum=arr[i]+arr[j];
				   if(sum==target) {
					   System.out.println(i+" "+j);
				}
			}
		}
	}
}
