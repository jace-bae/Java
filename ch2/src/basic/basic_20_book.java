package basic;

public class basic_20_book {
	String title;
	String author;
	
	public basic_20_book(String t) {
		title = t;
		author = "���ڹ̻�";
	}
	
	public basic_20_book(String t, String a) {
		title = t;
		author = a;
	}

	public static void main(String[] args) {
		basic_20_book javaBook = new basic_20_book("java", "jace");
		System.out.println(javaBook.title + "�� ���ڴ� " + javaBook.author);
		
		basic_20_book bible = new basic_20_book("Bible");
		System.out.println(bible.title + "�� ���ڴ� " + bible.author);
	}
}
 