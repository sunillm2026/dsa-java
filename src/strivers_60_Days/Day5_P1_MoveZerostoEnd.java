package strivers_60_Days;

public class Day5_P1_MoveZerostoEnd {

	public static void main(String[] args) {
		int[]arr= {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
		Movezerostoend sol = new Movezerostoend();
		sol.moveZeroes(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}

 class Movezerostoend{
	void moveZeroes(int[]arr) {
		int n=arr.length;
		int i=0;
		for(int j=0;j<n;j++) {
			if(arr[j]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}
	}
}