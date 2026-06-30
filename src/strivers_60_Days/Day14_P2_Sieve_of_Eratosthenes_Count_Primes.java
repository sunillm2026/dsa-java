package strivers_60_Days;
import java.util.Scanner;
public class Day14_P2_Sieve_of_Eratosthenes_Count_Primes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans=countPrime(n);
		System.out.println(ans);
	}
		
		static int countPrime(int n) {
			if(n <= 2) {
				return 0;
			}
		
		// put true to all the elements
		boolean[]arr=new boolean[n];
		for(int i=2;i<n;i++) {
			arr[i]=true;
		}
		
		// put false for multiples of prime
		for(int j=2;j<=Math.sqrt(n);j++) {
			if(arr[j]) {
				for(int k=j*j;k<n;k+=j) {
					arr[k]=false;
				}
			}
		}
		
		// count the number of primes
		int count=0;
		for(int j=2;j<n;j++) {
			if(arr[j]) {
				count++;
			}
		}
		return count;
	}
}
