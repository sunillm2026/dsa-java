package strivers_60_Days;
import java.util.Scanner;
public class Day29_P5_Check_String_is_a_palindrome_or_not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Take string as input
		String name = sc.nextLine();
		boolean res = checkPalindrome(name);
		System.out.println(res);
		

	}
	
	
	static boolean checkPalindrome(String s) {
		
		// Convert String into character array
		char[] ch = s.toCharArray();
		
		// Use two pointer approach
		// declare and initialize left=0; and right = ch.length;
		int left = 0;
		int right = ch.length-1;
		
		while(left<right) {
			if(ch[left] != ch[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}










