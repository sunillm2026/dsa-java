package strivers_60_Days;

public class Day34_P1_Strong_Number {

	public static void main(String[] args) {

        int n = 145;
        int original = n;
        int sum = 0;
        while(n>0) {
            int rem = n % 10;
            int factorial = 1;
            for(int i=1;i<=rem;i++) {
                factorial = factorial*i;
            }
            sum+=factorial;
            n = n/10;
        }
        if(sum == original) {
            System.out.println("Yes, it is a strong number");
        }
        else {
            System.out.println("No, it is not a strong number");
        }

	}

}
