package strivers_60_Days;

public class Day4_P2_RemoveduplicatesfromSortedarray {

	public static void main(String[] args) {
		int[]arr= {5,5,8,8,8,9,9};
		int ans=removeDuplicate(arr);
		for(int k=0;k<ans;k++) {
			System.out.print(arr[k]+" ");
		}
		
	}
		static int removeDuplicate(int[]arr) {
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i]!=arr[j]) {
				arr[i+1]=arr[j];
			    i++;
			}
		}
		return i+1;
		}
}
		
