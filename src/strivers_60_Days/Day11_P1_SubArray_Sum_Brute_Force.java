
package strivers_60_Days;

public class Day11_P1_SubArray_Sum_Brute_Force {

	public static void main(String[] args) {
		int[]arr= {9,4,20,3,10,5};
		int target= 33;
		int ans=subArray(arr,target);
		System.out.println(ans);
	}
		static int subArray(int[]arr,int target) {
		    int count = 0;
      		for(int i=0;i<arr.length;i++) {
	      		int sum=0;
		  	
			    for(int j=i;j<arr.length;j++) {
				   sum+=arr[j];
				   if(sum==target) {
					   count++;
					   
				}
			}
		}
		return count;
	}
}
