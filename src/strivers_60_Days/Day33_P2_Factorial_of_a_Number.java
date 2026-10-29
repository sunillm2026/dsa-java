package strivers_60_Days;
import java.util.Scanner;
public class Day33_P2_Factorial_of_a_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int factorial = 1;
		for(int i=1;i<=n;i++) {
			factorial *= i;
		}
		System.out.println(factorial);

	}

}
