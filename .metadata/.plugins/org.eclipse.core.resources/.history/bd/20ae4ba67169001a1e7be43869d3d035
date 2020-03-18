package basic;

import java.util.Scanner;

public class basic_07_ifelse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 (0점 ~ 100점) : " );
		int score =scanner.nextInt();
		
		System.out.print("학년을 입력하세요(1 ~ 4) : ");
		int grade = scanner.nextInt();
		
		if(score >=60) {
			if(grade !=4)
				System.out.println("합격");
			else if(score >=70)
				System.out.println("합격"); //4학년이 70점이상이면 합격
			else
				System.out.println("불합격"); //4학년이 70점 미만이면 불합격
		}
		else
			System.out.println("불합격");
		
		scanner.close();

	}

}
