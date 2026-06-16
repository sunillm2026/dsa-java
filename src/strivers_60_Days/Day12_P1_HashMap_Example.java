package strivers_60_Days;
import java.util.HashMap;
public class Day12_P1_HashMap_Example {

	public static void main(String[] args) {
		HashMap<String, Integer> map= new HashMap<>();
		
		// Insert or Put key-values
		map.put("Science", 97);
		map.put("English", 89);
		map.put("Mathematics", 99);
		
		System.out.println(map);
		
		// get values using key
		int val=map.get("Science");
		System.out.println(val);
		System.out.println(map.get("English"));
		System.out.println(map.get("Mathematics"));
		
		// Check if key exists
		boolean value=map.containsKey("English");
		System.out.println(value);
		System.out.println(map.containsKey("Mathematics"));
		System.out.println(map.containsKey("Science"));
		
		// Remove key-value pair
		map.remove("English");
		System.out.println(map);
		
		// size of the map
		System.out.println(map.size());
	}

}
