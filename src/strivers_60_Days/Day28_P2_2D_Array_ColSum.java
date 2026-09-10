package strivers_60_Days;
import java.util.Scanner;
public class Day28_P2_2D_Array_ColSum {

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
        // Column sum
        for(int j=0;j<arr[0].length;j++) {
            int colSum = 0;
            for(int i=0;i<arr.length;i++) {
                colSum+=arr[i][j];
            }
            System.out.println("Column sum of column " + j + " is " + colSum);
        }

	}

}
