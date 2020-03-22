/*
 * int x = 5;
 * int y = 3;
 * 
 * int big;
 * if(x>y)
 * 	big = x;
 * else
 * 	big = y;
 * 
 * => 한문장으로 : int big = (x>y)?x:y;
 * */

package basic;

import java.util.Scanner;

public class basic_06_if {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오 : ");
		int age = scanner.nextInt();
		if((age>=20) && (age <30)) {
			System.out.print("20대 입니다.");
			System.out.println("20대라서 행복합니다.");
		}
		else
			System.out.println("20대가 아닙니다.");
		
		scanner.close();
				
	}

}
