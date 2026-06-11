package strivers_60_Days;

public class Day9_P2_Count_Maximum_Consecutive_Ones_in_the_array {

	public static void main(String[] args) {
		int[]arr= {1};
		int target=1;
		int n=arr.length;
		int i=0;
		int count=0;
		int maxCount=0;
		while(i<n) {
			if(arr[i]==target) {
				count++;
			}
			else {
				count=0;
			}
			maxCount=Math.max(count, maxCount);
			i++;
		}
		System.out.println(maxCount);

	}

}
