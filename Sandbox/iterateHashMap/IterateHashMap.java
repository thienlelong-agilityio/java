import java.util.HashMap;

public class IterateHashMap {
	public static void main(String args[]) {
		HashMap<String, String> map = new HashMap<String, String>();
		String h = "\"h\"";
		map.put(h, h);
		map.put("ek", "e");
		map.put("l", "l");
		map.put("o", "o");
		map.put("a", "a");

		System.out.println(map.get("\"h\""));
		System.out.println();

		// This will not return the same order as you added it in
		// Instead it will be in the order by their hashcode or key
		for(String s : map.keySet()) {
			System.out.println(s);
		}
		System.out.println();

		HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();
		num.put(1,1);
		num.put(5,5);
		num.put(3,3);
		num.put(2,2);
		num.put(4,4);

		for(int i : num.keySet()) {
			System.out.println(i);
		}
	}
}