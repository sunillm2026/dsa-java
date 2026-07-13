package strivers_60_Days;
import java.util.Scanner;
public class Day20_P1_Valid_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//compare a+b>c
		if((a+b>c)&&(a+c>b)&&(b+c>a)) {
			System.out.println("It is a valid triangle");
		} else {
			System.out.println("Invalid");
		}
		
	}

}
