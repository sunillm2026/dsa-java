package strivers_60_Days;
import java.util.Scanner;
public class Day25_P1_Power_Of_A_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  base = sc.nextInt();
		int exponent = sc.nextInt();
		int res = 1;
		// loop until it runs exponent number of times
		while(exponent>0) {
			res*=base;
			exponent--;
		}
		System.out.println("Res="+res);

	}

}
