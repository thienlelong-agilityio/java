class NumericFns<T extends Number> {
	T num;

	NumericFns(T n) {
		num = n;
	}

	double reciprocal() {
		return 1/num.doubleValue();
	}

	// Return the fractional part
	double fraction() {
		return num.doubleValue() - num.intValue();
	}

	// Determine if absolute value of two numbers are the same
	// You have to use the wild card <?> because then both object must be the ame type T. It cannot be Integer with Double
	boolean absEqual(NumericFns<?> ob) {
		if( Math.abs(this.num.doubleValue()) == Math.abs(ob.num.doubleValue()) ) {
			return true;
		} else {
			return false;
		}
	}
}