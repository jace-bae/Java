package basic;
import java.util.Scanner;

public class basic_08_switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int month = scanner.nextInt(); // ������ �� �Է�
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("Spring");
				break;
			case 6: case 7: case 8:
				System.out.println("Summer");
				break;
			case 9: case 10: case 11:
				System.out.println("Fall");
				break;
			case 12: case 1: case 2:
				System.out.println("Winter");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
		}
		scanner.close();
	}
}