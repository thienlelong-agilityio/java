import java.util.*;
import java.io.*;

public class ReadFile {
	public static void main(String args[]) throws IOException {
		File fr = new File("snake.txt");
		Scanner in = new Scanner(fr);

		int t = in.nextInt();
		System.out.println(t);

		String str;
		String arrayStr[];

		in.nextLine();
		for(int i=0; i<t; i++) {
			String numLaddersSnakes[] = in.nextLine().split(",");
			for(int j=0; j<2; j++) {
				int laddersSnakes = Integer.parseInt(numLaddersSnakes[j]);
				String laddersSnakesString[] = in.nextLine().split(" ");
				for(int h=0; h<laddersSnakes; h++) {
					System.out.print(laddersSnakesString[h] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}