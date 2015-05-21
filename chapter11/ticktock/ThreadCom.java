// MultiThreaded Programming using notify(), wait(). Page 397

package ticktock;

public class ThreadCom {
	public static void main(String args[]) {
		TickTock tt = new TickTock();
		MyThread mt1 = new MyThread("Tick", tt);
		MyThread mt2 = new MyThread("Tock", tt);

		try {
			mt1.myThread.join();
			mt2.myThread.join();
		} catch(InterruptedException e) {
			System.out.println("Thread interrupted.");
		}

		System.out.println("Main Thread terminated.");
	}
}