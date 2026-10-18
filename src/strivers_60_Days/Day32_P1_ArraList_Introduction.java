package strivers_60_Days;
import java.util.*;
public class Day32_P1_ArraList_Introduction {

	public static void main(String[] args) {
		
	        ArrayList<Integer> al = new ArrayList<>();
	        al.add(10);
	        al.add(20);
	        al.add(1);
	        al.add(9);
	        al.add(98);
	        al.add(87);
	        System.out.println(al);
	        System.out.println(al.size());
	        al.remove(0);
	        System.out.println(al);
	        List<Integer> list = new ArrayList<>();
	        list.add(2);
	        list.add(3);
	        System.out.println(list);
	        System.out.println(list.size());
	        al.addAll(list);
	        System.out.println(al);
	        System.out.println(al.size());
	        System.out.println(list.get(0));
	        list.set(0,4);
	        System.out.println(list);
	        System.out.println(list.contains(4));
	        Iterator<Integer> It = al.iterator();
	        while(It.hasNext()) {
	            System.out.print(It.next() + " ");
	        }
	        System.out.println();
	        // int[] arr = al.toArray(new int[al.size()]);
	        Object[] arr = al.toArray();
	        for(int i=0;i<arr.length;i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	        for(int a:al) {
	            System.out.print(a + "  ");
	        }

	        System.out.println();
	        Collections.sort(al);
	        System.out.println(al);

	        ArrayList<Integer> al2 = (ArrayList<Integer>)al.clone();
	        System.out.println(al2);

	        System.out.println(al.isEmpty());
	        System.out.println(al.indexOf(20));
	    }
	}
