package strivers_60_Days;
import java.util.ArrayList;
public class Day7_P1_UnionOfTwoSortedArrays {

	public static void main(String[] args) {
		int[]arr1= {1,1,2,3,3};
		int[]arr2= {1,2,3,4,4,5};
		int n=5;
		int m=6;
		ArrayList<Integer> union= new ArrayList<Integer>();
		
		int i=0;
		int j=0;
		
		while(i < arr1.length && j < arr2.length) {	
			if(arr1[i]<arr2[j]) {
				if(union.isEmpty() || union.get(union.size()-1)!=arr1[i]) {
					union.add(arr1[i]);
				}
				i++;
			}
			else if(arr2[j]<arr1[i]) {
				if(union.isEmpty() || union.get(union.size()-1) !=arr2[j]) {
					union.add(arr2[j]);
				}
				j++;
			}
			else {
				if(union.isEmpty() || union.get(union.size()-1)!=arr1[i]) {
					union.add(arr1[i]);
				}
				i++;
				j++;
			}
	}
		while(i<n) {
			if(union.isEmpty() || union.get(union.size()-1)!=arr1[i]) {
				union.add(arr1[i]);
			}
			i++;
		}
		while(j<m) {
			if(union.isEmpty() || union.get(union.size()-1)!=arr2[j]) {
				union.add(arr2[j]);
			}
			j++;
		}
		System.out.println(union);

	}
}
