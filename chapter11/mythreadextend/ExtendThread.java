// Creating a thread that extends Thread instead of using the Runnable interface page 379

package mythreadextend; 

public class ExtendThread {
	public static void main(String args[]) {
		// My thread will start running once it is created
		MyThread mt = new MyThread("MyThread 1");

		System.out.println("Main Thread Starting. ");
		for(int i=0; i<50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Main Thread interrupted.");
			}
		}
		System.out.println("Main Thread ending");
	}
}