package strivers_60_Days;

public class Day9_P1_Find_missing_number {

	public static void main(String[] args) {
		int[]arr= {8,2,4,5,3,7,1};
		int n=arr.length+1;
		int actualSum=0;
		int expectedSum=n*(n+1)/2;
		for(int i=0;i<arr.length;i++) {
			actualSum+=arr[i];
		}
		int missingNumber=expectedSum-actualSum;
		System.out.println(missingNumber);

	}

}
