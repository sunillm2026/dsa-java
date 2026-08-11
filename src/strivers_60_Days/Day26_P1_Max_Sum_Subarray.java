package strivers_60_Days;

public class Day26_P1_Max_Sum_Subarray {

	public static void main(String[] args) {
		int[] arr = {2,5,1,8,2,9,1};
		int k = 3;
		int ans = maxSum(arr,k);
		System.out.println(ans);
	}
	static int maxSum(int[]arr,int k) {
		int n = arr.length;
		int maxSum = Integer.MIN_VALUE;
		int sum = 0 ;
		int i = 0;
		int j = 0;
		while(j<n) {
			sum+=arr[j];
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				maxSum = Math.max(maxSum, sum);
				sum-=arr[i];
				i++;
				j++;
			}
		}
		return maxSum;
	}

}
