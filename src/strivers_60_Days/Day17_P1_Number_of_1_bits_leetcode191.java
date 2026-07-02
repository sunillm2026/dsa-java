package strivers_60_Days;

public class Day17_P1_Number_of_1_bits_leetcode191 {

	public static void main(String[] args) {
		int n = 11; //binary 8421 general formula
                           //1011 binary representation
		                  // 11   actual value 
		int ans= hammingWeight(n);
		System.out.println(ans);
	}
	  static int hammingWeight(int n) {
	        int count=0;
	        while(n>0){
	            count+=n&1;
	            n >>=1;
	        }
	        return count;
	    }
	}

