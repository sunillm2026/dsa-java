package strivers_60_Days;
import java.util.Scanner;
public class Day29_P2_Count_Length_of_the_string_without_length_method {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Take String as user input
		String name = sc.nextLine();
		
		//Declare and initialize count variable with 0
		int count = 0;
		
		// Traverse through the string to get length
		for(int i=0; i<name.length(); i++) {
			count++;
		}
		System.out.println(count);
	}

}
