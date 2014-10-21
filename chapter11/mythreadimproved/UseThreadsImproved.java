// Creating a Thread page 378

package mythreadimproved;

public class UseThreadsImproved {
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