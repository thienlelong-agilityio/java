// Generic Queue page 462

public class GenQueue<T> implements IGenQ<T> {
	int putloc, getloc;
	T q[];

	GenQueue(T[] aRef) {
		q = aRef;
		putloc = getloc = 0;
	}

	public void put(T el) throws QueueFullException {
		if(putloc == q.length) {
			throw new QueueFullException(q.length);
		} else {
			q[putloc++] = el;
		}
	}

	public T get() throws QueueEmptyException {
		if(putloc == getloc) {
			throw new QueueEmptyException();
		} else {
			return q[getloc++];
		}
	}

}