package strivers_60_Days;
import java.util.Scanner;
public class Day20_P1_Take_character_check_whether_it_is_upper_lower_digit__special {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char choice;
		do {
		System.out.println("Enter the character: ");
		char ch=sc.next().charAt(0);
		
		//checking whether character is upper,lower,digit,special
		if(ch>='A' && ch<='Z') {
			System.out.println("It is uppercase");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println("It is lowercase");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("It is digit");
		}
		else {
			System.out.println("It is a special character");
		}
		System.out.println("Do you want to continue?(y/n)");
		choice=sc.next().charAt(0);
		}while(choice=='y' || choice=='Y');
		  
		 System.out.println("program ended");
		 sc.close();

	}

}
