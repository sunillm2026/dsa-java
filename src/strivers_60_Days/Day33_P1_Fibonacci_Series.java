package strivers_60_Days;
import java.util.Scanner;
public class Day33_P1_Fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        for(int i=1;i<=n;i++) {
            System.out.println(a);
            int val = a+b;
            a = b;
            b = val;
        }

	}

}
