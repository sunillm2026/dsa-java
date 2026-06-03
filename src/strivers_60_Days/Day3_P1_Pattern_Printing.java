package strivers_60_Days;

public class Day3_P1_Pattern_Printing {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			
			//stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");			
				}
			
			//space
			for(int k=1;k<=2*n-2*i;k++) {
				System.out.print(" ");
			}
			
			//stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");			
				}
			System.out.println();
			
		}
          int m = 4;
		  for(int i=1;i<=m;i++) {
			
			//stars
			for(int j=1;j<=m-i+1;j++) {
				System.out.print("*");			
				}
			
			//space
			for(int k=1;k<=2*i;k++) {
				System.out.print(" ");
			}
			
			//stars
			for(int j=1;j<=m-i+1;j++) {
				System.out.print("*");			
				}
			System.out.println();
			
		}
		

	}

}
