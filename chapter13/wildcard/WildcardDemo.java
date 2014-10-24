public class WildcardDemo {
	public static void main(String args[]) {
		NumericFns<Integer> iOb = new NumericFns<Integer>(5);
		NumericFns<Integer> niOb = new NumericFns<Integer>(-5);
		NumericFns<Double> ndOb = new NumericFns<Double>(-5.0);
		NumericFns<Integer> niOb2 = new NumericFns<Integer>(-4);

		System.out.println(iOb.absEqual(niOb));  // True
		System.out.println(iOb.absEqual(iOb));  // True
		System.out.println(iOb.absEqual(ndOb));  // True
		System.out.println(iOb.absEqual(niOb2));  // False


	}
}