package strivers_60_Days;
import java.util.Scanner;
public class Day29_P4_Reverse_a_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Take String as input from user
		String name =sc.nextLine();
		reverse(name);
	}
	static void reverse(String s) {
		
		// Convert the string into char array
		
		char[] ch = s.toCharArray();
		// Two pointer pattern
		// declare and initialize left and right variables to implement 2 pointer pattern
		int left = 0;
		int right = ch.length-1;
		
		while(left<right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			
			left++;
			right--;
		}
		
		for(char t: ch) {
			System.out.print(t);
		}
	}

}










