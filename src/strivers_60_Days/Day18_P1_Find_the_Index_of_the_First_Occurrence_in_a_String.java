package strivers_60_Days;
import java.util.Scanner;
public class Day18_P1_Find_the_Index_of_the_First_Occurrence_in_a_String {

	static int strStr(String haystack, String needle) {

		        int i = 0;

		        while (i <= haystack.length() - needle.length()) {

		            int j = 0;

		            while (j < needle.length() &&
		                   haystack.charAt(i + j) == needle.charAt(j)) {
		                j++;
		            }

		            if (j == needle.length()) {
		                return i;
		            }

		            i++;
		        }

		        return -1;
		    }

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter haystack: ");
		        String haystack = sc.nextLine();
		        sc.nextLine();
		        

		        System.out.print("Enter needle: ");
		        String needle = sc.nextLine();

		        int result = strStr(haystack, needle);

		        System.out.println("Output: " + result);

		        sc.close();
		    }

	}
