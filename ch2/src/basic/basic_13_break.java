package basic;

import java.util.Scanner;

public class basic_13_break {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.contentEquals("exit"))
				break;
		}
		System.out.println("�����մϴ�");
		scanner.close();
	}

}
