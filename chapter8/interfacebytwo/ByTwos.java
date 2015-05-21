// Interface page 279

package interfacebytwo;

public class ByTwos implements Series {
	int start;
	int val;
	int prev;

	ByTwos() {
		start = 0;
		val = 0;
		prev = -2;
	}

	public int getNext() {
		val += 2;
		prev = val - 2;
		return val;
	}

	public void reset() {
		val = start;
		prev = val - 2;
	}

	public void setStart(int x) {
		start = x;
		val = x;
		prev = val - 2;
	}

	// This method is not defined in the interface Series
	int getPrevious() {
		return prev;
	}

}