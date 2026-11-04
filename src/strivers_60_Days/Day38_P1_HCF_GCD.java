package strivers_60_Days;
import java.util.Scanner;
public class Day38_P1_HCF_GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int hcf = 0;
        for(int i=1;i<=n || i<m;i++) {
            if(n%i==0 && m%i==0) {
                hcf=i;
            }
        }
        System.out.println(hcf);

	}

}
