// Creating a Thread page 378 abd 381

package mythreadimproved;

public class MyThread implements Runnable {
	Thread myThread;

	// This constructor takes the name of the thread
	MyThread(String name) {
		myThread = new Thread(this, name);
		myThread.start();
	}

	public void run() {
		System.out.println(myThread.getName() + " starting.");

		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(400);
				System.out.println("In " + myThread.getName() + ", count is: " + i);
			} catch (InterruptedException e) {
				System.out.println(myThread.getName() + " interrupted!");
			}
		}
		System.out.println(myThread.getName() + " terminating.");
	}
}