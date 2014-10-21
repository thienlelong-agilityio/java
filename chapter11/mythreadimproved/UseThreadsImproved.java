// Creating a Thread page 378 and 381

package mythreadimproved;

public class UseThreadsImproved {
	public static void main(String args[]) {

		// My thread will start running once it is created
		// You can run many threads at the same time
		MyThread mt1 = new MyThread("MyThread 1");
		MyThread mt2 = new MyThread("MyThread 2");
		MyThread mt3 = new MyThread("MyThread 3");

		// While you run this part
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