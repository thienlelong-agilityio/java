// Quicksort for sorting arrays of chars from "Java A Beginner's Guide" p. 211 (236 of 729 in pdf)

public class Quicksort {
	public static void qsort(char items[]) {
		qs(items, 0, items.length-1);
	}

	private static void qs(char items[], int left, int right) {
		int l = left, r = right;
		char pivot = items[(left+right)/2];
		char temp;

		do {
			// Comparing pivots with left and right
			while((items[l]<pivot) && (l<right)) {
				l++;
			}

			while((items[r]>pivot) && (left<r)) {
				r--;
			}

			if(l<=r) {
				// Swap items
				temp = items[l];
				items[l] = items[r];
				items[r] = temp;
				l++;
				r--;
			}

		} while(l <= r);

		// Recursive calls
		if(left < r) {
			qs(items, left, r);
		}

		if(l < right) {
			qs(items, l, right);
		}
	}
}