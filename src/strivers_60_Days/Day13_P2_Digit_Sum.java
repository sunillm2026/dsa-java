package strivers_60_Days;
import java.util.Scanner;
public class Day13_P2_Digit_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println("The sum of digits is "+sum);
	}
}
