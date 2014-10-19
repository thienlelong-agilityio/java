// Interface page 279

package interfacebytwo;

public class SeriesDemo {
	public static void main(String args[]) {
		ByTwos ob = new ByTwos();

		for(int i=0; i<5; i++) {
			System.out.println(ob.getNext());
		}

		System.out.println("Resetting: ");
		ob.reset();

		for(int i=0; i<5; i++) {
			System.out.println(ob.getNext());
		}

		System.out.println("Starting at 5: ");
		ob.setStart(5);

		for(int i=0; i<5; i++) {
			System.out.println(ob.getNext());
		}	
	}
}