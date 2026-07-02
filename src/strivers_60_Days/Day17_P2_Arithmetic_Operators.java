package strivers_60_Days;
import java.util.Scanner;
public class Day17_P2_Arithmetic_Operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the name:");
		String name = sc.nextLine();
		System.out.print("Enter the second number:");
		int b = sc.nextInt();
		
		//Arithmetic operators
		
		//addition
		int addition = a+b;
		System.out.println("addition is = "+addition);
		
		//subtraction 
		int subtraction = a-b;
		System.out.println("subtraction is = "+subtraction);
		
		//multiplication
		int multiplication = a*b;
		System.out.println("multiplication = "+ multiplication);
		
		//Division
		int division = a/b;
		System.out.println("division is = " +division);
		
		//modulus
		int modulus = a%b;
		System.out.println("modulus is = "+modulus);
		
		sc.close();
	}

}
