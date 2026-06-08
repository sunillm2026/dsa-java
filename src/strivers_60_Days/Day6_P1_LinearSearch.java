package strivers_60_Days;

public class Day6_P1_LinearSearch {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5};
		int num=3;
		
		// Traversing Through The Array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println(i);
				break;
			}
		}

	}

}
