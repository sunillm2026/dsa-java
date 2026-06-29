package strivers_60_Days;

public class Day14_P1_Count_Primes {

	public static void main(String[] args) {
		int n = 10;
		int count = 0;
		if(n<=1) {
			System.out.println("0");
		}
		
		for(int i=2;i<n;i++) {
			boolean isPrime=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				count++;
			}
		}
		System.out.println(count);

	}

}
