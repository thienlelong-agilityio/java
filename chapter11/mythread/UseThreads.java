// Creating a Thread page 374

package mythread; 

public class UseThreads {
	public static void main(String args[]) {
		System.out.println("Main thread starting: ");

		MyThread mt = new MyThread("MyThread 1");
		Thread newThread = new Thread(mt);

		// MyThread will start running now
		newThread.start();

		// Meanwhile we can run this too other thing 
		for(int i=0; i<50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Main Thread Interrupted.");
			}
		}

		System.out.println("Main Thread ending.");
	}
}