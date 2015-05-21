// Generic Queue page 462

public class QueueEmptyException extends Exception {
	public String toString() {
		return "\nQueue is empty.";
	}
}