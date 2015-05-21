package bookpack;

class BookDemo {
	public static void main(String args[]) {
		Book books[] = new Book[3];

		books[0] = new Book("Harry Potter", "JK Rowling", 2000);
		books[1] = new Book("The Alchemist", "Paulo Coelho", 2000);
		books[2] = new Book("The Catcher In The Rye", "JD Salinger", 1951);

		for(int i=0; i<books.length; i++) {
			books[i].show();
		}
	}
}