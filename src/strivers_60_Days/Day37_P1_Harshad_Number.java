package strivers_60_Days;
import java.util.Scanner;
public class Day37_P1_Harshad_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n>0) {
            int rem = n%10;
            sum+=rem;
            n = n/10;
        }
        if(n%sum==0) {
            System.out.println("yes, it is Harshad Number");
        } else {
            System.out.println("No, it is not a Harshad Number");
        }

	}

}
