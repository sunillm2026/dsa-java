
package strivers_60_Days;
import java.util.Scanner;
public class Day29_P1_Print_each_char_of_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Take a String as user input
		String name = "Sunil";
		
		//Traverse through the String to access each character
		for (int i=0; i<name.length(); i++) {
			//Print each element of the string by using charAt(i) method
			System.out.println(name.charAt(i));
		}

	}

}
