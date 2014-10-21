import java.io.*;

public class CopyFile {
	public static void main(String args[]) {
		int i;

		// Check that the user input an argument 
		if(args.length != 2) {
			System.out.println("Please input one argument. ");
			return;
		}

		// Open and manage two files via the try statement
		// args[0] is the file "copyFrom.txt" 
		// args[1] is the file "copyTo.txt"
		try(FileInputStream fin = new FileInputStream(args[0]);
			FileOutputStream fout = new FileOutputStream(args[1]);) {

			do {
				// i will return -1 when .read() gets to the end of the file
				i = fin.read();
				if(i != -1) {
					fout.write(i);
				}
			} while(i != -1);
		} catch (IOException e) {
			System.out.println("E/O Error: " + e);
		}
	}
}