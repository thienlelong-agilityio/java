// Creating a thread that extends Thread instead of using the Runnable interface page 379

package mythreadextend;

public class MyThread extends Thread {
	MyThread(String name) {
		super(name); // This one calls the Thread constructor Thread(threadName)
		start(); // Start running the thread
	}

	public void run() {
		System.out.println(getName() + " starting.");
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(400);
				System.out.println("In " + getName() + ", count is: " + i);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted.");
			}
		}
		System.out.println(getName() + " terminating.");
	}
}