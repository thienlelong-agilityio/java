// Generic Queue page 462

public interface IGenQ<T> {
	void put(T el) throws QueueFullException;
	T get() throws QueueEmptyException;
}