package basic;

import java.util.Scanner;

public class basic_04_scanner01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : "); //println으로 안한 이유는 옆으로 입력받기 위해
		int time = scanner.nextInt(); // 정수 입력
		int second = time % 60; //60 으로 나눈 나머지는 초
		int minute = (time / 60) %60; //60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		int hour = (time / 60) / 60; //60으로 나눈 몫을 다시 60으로 나는 몫은 시간
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 입니다.");
		scanner.close();
		
	}

}
