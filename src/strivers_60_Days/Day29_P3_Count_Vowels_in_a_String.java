package strivers_60_Days;
import java.util.Scanner;
public class Day29_P3_Count_Vowels_in_a_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Take String as user input
		String s = sc.nextLine();
		
		//Declare and initialize vowelCount variable as 0 to track count of vowels
		int vowelsCount = 0;
		
		// convert String to character array
		char[] ch = s.toCharArray();
		
		//Traverse through the character array to count vowels
		for(int i = 0; i<ch.length;i++) {
			if(ch[i] == 'a' || ch[i] =='A' || ch[i] =='e' || ch[i] =='E' || ch[i] =='i' || ch[i] =='I' || ch[i] =='o' || ch[i] =='O' || ch[i] =='u' || ch[i] =='U') {
				vowelsCount++;
			}
		}
		System.out.println("Total number of vowels present in this is: " + vowelsCount);
	}

}
