public class Unsigned {
	public static void main(String args[]) {
		byte a = -1;  // 00000001, 11111111
		byte b = 127;  // 011111111
		byte c = -128;
		System.out.println(a&256);
		System.out.println(b&256);

		System.out.println();

		for(int i=0; i<8; i++) {
			// System.out.println((a>>>i)&1);
			// System.out.println((b>>>i)&1);
			System.out.println((c>>>i)&1);
		}
	}
}