package strivers_60_Days;
import java.util.Scanner;
public class Day4_P1_CheckIfArrayIsArrayIsSorted {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=5;
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean ans = CheckSort(arr);
		System.out.println(ans);
	}
	static boolean CheckSort(int[]arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>=arr[i-1]) {
				
			}
			else {
				return false;
			}
		}
		return true;
	}

}
