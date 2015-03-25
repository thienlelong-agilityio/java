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

		for(String s : map.keySet()) {
			System.out.println(s);
		}
	}
}