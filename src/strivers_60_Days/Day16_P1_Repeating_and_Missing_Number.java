package strivers_60_Days;

import java.util.ArrayList;

public class Day16_P1_Repeating_and_Missing_Number {

    static ArrayList<Integer> findTwoElement(int[] arr) {
        int n = arr.length;
        long expectedSum   = (long) n * (n + 1) / 2;
        long expectedSumSq = (long) n * (n + 1) * (2L * n + 1) / 6;
        long arrSum      = 0;
        long arrSquareSum = 0;

        for (int num : arr) {
            arrSum       += num;
            arrSquareSum += (long) num * num;
        }

        long x       = arrSum - expectedSum;
        long y       = (arrSquareSum - expectedSumSq) / x;
        long repeat  = (x + y) / 2;
        long missing = y - repeat;

        ArrayList<Integer> result = new ArrayList<>();
        result.add((int) repeat);
        result.add((int) missing);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 3};
        System.out.println(findTwoElement(arr)); // [3, 4]
    }
}