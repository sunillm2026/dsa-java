package strivers_60_Days;

public class Day10_P1_Longest_Subarray_with_given_Sum_KPositives {

	public static void main(String[] args) {
		int[]arr= {-3, 2, 1};
		int k = 15;
		int maxLength = 0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			int count=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum==k) {
					count =j-i+1;
					maxLength=Math.max(maxLength, j);
				}
			}
		}
		System.out.println(maxLength);

	}

}
