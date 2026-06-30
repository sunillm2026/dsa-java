package strivers_60_Days;
import java.util.Scanner;
public class Day15_P1_Check_Divisible_by_3and5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean check=(n%3==0&&n%5==0) ? true : false;
		System.out.println(check);

	}

}
