class Phone {
	public static void main(String args[]) {
		String numbers[][] = {{"Jesus", "123-456-7890"}, 
													{"Alex", "014-773-7777"}, 
													{"Diana", "098-765-4321"}, 
													{"Anto", "025-621-5682"}
		};

		int i; // I have to declare it outside of the loop because I will use it later out of the scope

		if(args.length != 1) {
			System.out.println("Please input only one argument!");
			return;
		} else {
				for(i=0; i<numbers.length; i++) {
					if(numbers[i][0].equals(args[0])) {
						System.out.println(numbers[i][0] + ": " + numbers[i][1]);
						break;
					}
				} 
			}

		if(i == numbers.length) {
			System.out.println("Name not found!");
		}
	}
}