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

		// // This is another way to stop running this thread after the other child threads stop
		// // This will run when the child threads are alive using isAlive()
		// do {
		// 	System.out.print(".");
		// 	try {
		// 		Thread.sleep(100);
		// 	} catch (InterruptedException e) {
		// 		System.out.println("Main Thread interrupted.");
		// 	}
		// } while (mt1.myThread.isAlive() || mt2.myThread.isAlive() || mt3.myThread.isAlive());


		// // Another way of doing it
		// // join() waits until the thread on which it is called terminates
		// try {
		// 	mt1.myThread.join();
		// 	System.out.println(mt1.myThread.getName() + " joined.");

		// 	mt2.myThread.join();
		// 	System.out.println(mt2.myThread.getName() + " joined.");

		// 	mt3.myThread.join();
		// 	System.out.println(mt3.myThread.getName() + " joined.");
		// } catch (InterruptedException e) {
		// 	System.out.println("Main Thread interrupted.");
		// }

		System.out.println("Main Thread ending");
	}
}