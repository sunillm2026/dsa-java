package strivers_60_Days;
import java.util.ArrayList;
public class Day8_P2_Merge_Two_Sorted_Arrays {

	public static void main(String[] args) {
		int[]arr1= {1,1,3,5,5,9};
		int[]arr2= {1,2,5,6};
		ArrayList<Integer> Merge=new ArrayList<Integer>();
		
		int i=0;
		int j=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				Merge.add(arr1[i]);
				i++;
		}
			else if (arr2[j]<arr1[i]) {
				Merge.add(arr2[j]);
				j++;
			}
			else {
				Merge.add(arr1[i]);
				Merge.add(arr2[j]);
				i++;
				j++;
			}
		}
		while(i<arr1.length) {
			Merge.add(arr1[i]);
			i++;
		}
		while(j<arr2.length) {
			Merge.add(arr2[j]);
			j++;
		}
		System.out.println(Merge);
	}
}
