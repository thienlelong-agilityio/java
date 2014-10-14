public class QSDemo {
	public static void main(String args[]) {
		char items[] = {'c', 'a', 'd', 'b', 'e', 'f'};

		System.out.println("Original array: ");
		for(int i=0; i<items.length; i++) {
			System.out.print(items[i] + " ");
		}

		System.out.println();

		Quicksort.qsort(items);

		System.out.println("Sorted array: ");
		for(int i=0; i<items.length; i++) {
			System.out.print(items[i] + " ");
		}

		System.out.println();
	}
}