// Read, write and parse a file to a new file
// http://stackoverflow.com/questions/2885173/java-how-to-create-a-file-and-write-to-a-file

import java.util.*;
import java.io.*;

public class ReadAndWriteFile {
	public static void main(String args[]) throws IOException {
		File file = new File("PracticeInput.txt");  // Name of the file to read;
		Scanner in = new Scanner(file);  // Read a file
		PrintWriter writer = new PrintWriter("newFile.txt");  // Write to a file

		while(in.hasNextLine()) {
			String line = in.nextLine();  // Reading line
			String elements[] = line.split(",");  // Separating elements by comma

			System.out.println(line);
			System.out.println(elements[0]);  // Printing first element of a line

			writer.println(elements[0]); // Writing the first element of a line to a file
		}
		writer.close();  // You must do this to write to a file
	}
}