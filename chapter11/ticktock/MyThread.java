// MultiThreaded Programming using notify(), wait(). Page 397

package ticktock;

public class MyThread implements Runnable {
	Thread myThread;
	TickTock ttOb;

	MyThread(String name, TickTock tt) {
		myThread = new Thread(this, name);
		ttOb = tt;
		myThread.start();
	}

	public void run() {
		if(myThread.getName().compareTo("Tick") == 0) {
			for(int i=0; i<5; i++) {
				ttOb.tick(true);
			}
			ttOb.tick(false);
		} else {
			for(int i=0; i<5; i++) {
				ttOb.tock(true);
			}
			ttOb.tock(false);
		}
	}
}