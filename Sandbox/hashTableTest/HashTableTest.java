import java.util.*;
import java.util.Hashtable;

public class HashTableTest {
	public static void main(String args[]) {
		Hashtable<Integer, LinkedList<Integer>> ht = new Hashtable<Integer, LinkedList<Integer>>();

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);

		ht.put(1, ll);

		LinkedList<Integer> ll2;

		ll2 = ht.get(1);
		ll2.add(2);

		LinkedList<Integer> ll3 = ht.get(1);

		for(int i : ll3) {
			System.out.print(i + " ");
		}

		System.out.println();

		Set<Integer> keys = ht.keySet();
		for(Integer i : keys) {
			System.out.print(i + " ");
		}
	}
}