package strivers_60_Days;

public class Day1_P8_Pattern_Printing {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*(n-i)+1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
