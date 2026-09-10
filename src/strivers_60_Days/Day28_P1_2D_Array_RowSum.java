package strivers_60_Days;
import java.util.*;
public class Day28_P1_2D_Array_RowSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][]arr = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // rowSum

        for(int i=0;i<rows;i++) {
            int rowSum = 0;
            for(int j=0;j<cols;j++) {
                rowSum+=arr[i][j];
            }
            System.out.println("RowSum of " + i + " is " + rowSum);
        }
	}

}
