public class ShiftDemo {
	public static void main(String args[]) {
		int valLeft = 1;

		System.out.println("Shift Left <<: ");

		for(int i=0; i<8; i++) {
			for(int b=128; b>0; b=b/2) {
				if((b & valLeft) != 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			valLeft = valLeft << 1;  // Shift left
			System.out.println();
		}

		System.out.println();
		System.out.println("Shift Right >>: ");
		int valRight = 128;

		for(int i=0; i<8; i++) {
			for(int b=128; b>0; b=b/2) {
				if((b & valRight) != 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			valRight = valRight >> 1;
			System.out.println();
		}
	}
}