// The difference between break and continue is: break goes out of the 
// loop completely and continue will skip this iteration go to the next 
// iteration if there is one

public class TestBreak {
	public static void main(String args[]) {
		for(int i=0; i<3; i++) {
			System.out.println("Running if condition");
			System.out.println("Doing it again");
			break; // Break only works with loops and switch statements
			//System.out.println("This should be skipped"); // Break only work if all the statements are executed at least once. So if this statement goes after the break without being executed the program will not compile
			// You should use continue statement to skip the next statements instead of break but it also has to run at least once
			//System.out.println("This should be skipped with continue");
		}	

		System.out.println("Out of the if now");
	}
}

