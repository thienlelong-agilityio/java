// Interface page 279

package interfacebytwo;

public interface Series {
	int getNext(); // Return next number
	void reset();
	void setStart(int x);

	// A default method does not have to be implemented in the class
	default int[] getNextArray(int n) {
		int vals[] = new int[n];

		for(int i=0; i<n; i++) {
			vals[i] = getNext();
		}

		return vals;
	}
}