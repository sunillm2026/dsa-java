package strivers_60_Days;

public class Day8_P3_Squares_of_a_Sorted_Array {

	public static void main(String[] args) {
		int[]arr= {-7,-3,2,3,11};
		int[]ans=sortedSquare(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
	static int[] sortedSquare(int[]arr) {
		int k=arr.length-1;
		int[]result=new int[arr.length];
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			int rightSquare=arr[i]*arr[i];
			int leftSquare=arr[j]*arr[j];
			if(rightSquare>leftSquare) {
				result[k]=rightSquare;
				i++;
			}
			else {
				result[k]=leftSquare;
				j--;
			}
			k--;
		}
		return result;
	}

}
