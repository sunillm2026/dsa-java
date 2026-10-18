package strivers_60_Days;
import java.util.*;
public class Day31_P1_Sorting_elements_in_ArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(10);
		ad.add(50);
		ad.add(30);
		ad.add(20);
		ad.add(60);
		ad.add(40);
		System.out.println(ad);
		ArrayList<Integer> al = new ArrayList<>();
		al.addAll(ad);
		Collections.sort(al);
		System.out.println(al);

	}

}
