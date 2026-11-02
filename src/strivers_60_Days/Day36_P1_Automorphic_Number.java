package strivers_60_Days;
import java.util.Scanner;
public class Day36_P1_Automorphic_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        double square = n*n;

        double rem1 = square % 10;
        double rem2 = n % 10;
        if(rem1 == rem2) {
            System.out.println("Yes, it is a automorphic number");
        } else {
            System.out.println("No, it is not a automorphic number");
        }

	}

}
