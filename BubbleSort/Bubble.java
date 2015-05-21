class Bubble {
	public static void main(String args[]) {
		int nums[] = {5, 6, 4, 1, 3, 2, 7, 9, 8};
		int size = nums.length;

		System.out.print("This is the original order: ");	
		// Output array
		for(int i=0; i<size; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println();

		int t;

		//Bubble sort
		for(int a=1; a<size; a++) {
			for(int b=size-1; b>=a; b--) {
				if(nums[b] < nums[b-1]) {
					// Swap values
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		}


		System.out.print("This is the sorted order: ");	
		// Output array
		for(int i=0; i<size; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println();


	}
}