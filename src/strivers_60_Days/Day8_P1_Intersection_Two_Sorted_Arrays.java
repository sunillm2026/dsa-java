package strivers_60_Days;
import java.util.ArrayList;
public class Day8_P1_Intersection_Two_Sorted_Arrays {

	public static void main(String[] args) {
		int n=5;
		int m=6;
		int[]arr1= {1,1,2,3,3};
		int[]arr2= {1,2,3,4,4,5};
		
		ArrayList<Integer>inter=new ArrayList<Integer>();
		
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr2[j]<arr1[i]) {
				j++;
			}
			else {
				if(inter.isEmpty() || inter.get(inter.size()-1)!=arr1[i]) {
					inter.add(arr1[i]);
				}
				i++;
				j++;
			}
		}
		System.out.println(inter);
	}

}
