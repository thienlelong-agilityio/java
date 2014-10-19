package bookpack;

class Book {
	private String title, author;
	private int pubDate;

	Book(String titl, String auth, int pDate) {
		title = titl;
		author = auth;
		pubDate = pDate;
	}

	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}