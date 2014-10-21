// Creating a Thread page 374

package mythread; 

public class MyThread implements Runnable {
	String threadName;

	MyThread(String name) {
		threadName = name;
	}

	// This is a method from the Runnable inteface
	public void run() {
		System.out.println(threadName + " starting: ");
		try {
			for(int i=0; i<10; i++) {
				Thread.sleep(400);
				System.out.println("In " + threadName + ", count is: " + i);
			}
		} catch (InterruptedException e) {
			System.out.println(threadName + " interrupted!");
		}

		System.out.println(threadName + " terminating.");
	}

}