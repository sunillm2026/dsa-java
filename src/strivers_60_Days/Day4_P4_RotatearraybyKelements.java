package strivers_60_Days;

public class Day4_P4_RotatearraybyKelements {

	public static void main(String[] args) {
		int[]arr= {1, 2, 3, 4, 5, 6, 7};
		int k=2;
		 Sol1 sol=new Sol1();
		int[]result=sol.rotate(arr, k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(result[i]+" ");
		}

	}
}
class Sol1{
	 void reverse(int[]arr,int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public int[] rotate(int[]arr,int k) {
		int n=arr.length;
		k=k%n;
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		return arr;
	}
}
