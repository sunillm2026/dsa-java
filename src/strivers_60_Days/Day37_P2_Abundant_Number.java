package strivers_60_Days;
import java.util.Scanner;
public class Day37_P2_Abundant_Number {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int sum = 0;
		        for(int i=1;i<n;i++) {
		            if(n%i==0) {
		                sum+=i;
		            }
		        }
		        if(sum>n) {
		            System.out.println("Yes, it is abundant number");
		        } else {
		            System.out.println("No, it is not an abundant number");
		        }

			}

		}

