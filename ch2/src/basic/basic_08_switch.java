package basic;
import java.util.Scanner;

public class basic_08_switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = scanner.nextInt(); // 정수로 월 입력
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
				System.out.println("잘못된 입력입니다.");
		}
		scanner.close();
	}
}
