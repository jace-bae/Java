package basic;

public class basic_11_dowhile {

	public static void main(String[] args) {
		char a = 'a';
		
		do {
			System.out.print(a);
			a = (char)(a+1);
		}while(a<='z');
	}

}
