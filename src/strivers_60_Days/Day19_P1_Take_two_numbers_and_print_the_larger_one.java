package strivers_60_Days;

public class Day19_P1_Take_two_numbers_and_print_the_larger_one {

	public static void main(String[] args) {
		int n1=5;
		int n2=10;
		int ans=(n1>n2) ? n1 : n2;
		System.out.println(ans);
		
		
		int a=2;
		int b=4;
		int c=6;
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(b>c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}

	}

}
