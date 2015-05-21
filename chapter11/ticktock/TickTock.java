// MultiThreaded Programming using notify(), wait(). Page 397

package ticktock;

public class TickTock {
	String state;

	synchronized void tick(boolean running) {
		if(!running) {
			state = "ticked";
			notify(); // Notify any waiting threads
			return;
		}

		System.out.print("Tick ");

		state = "ticked";
		notify(); // Notify tock that tick is done

		try {
			while(!state.equals("tocked")) {
				wait();  // Wait for tock() to complete
			}
		} catch(InterruptedException e) {
				System.out.println("Thread interrupted");
		}
	}

	synchronized void tock(boolean running) {
		if(!running) {
			state = "tocked";
			notify();
			return;
		}

		System.out.println("Tock");

		state = "tocked";
		notify();

		try {
			while(!state.equals("ticked")) {
				wait();   // Wait for tick() to complete
			}
		} catch(InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}
}