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
 * => �ѹ������� : int big = (x>y)?x:y;
 * */

package basic;

import java.util.Scanner;

public class basic_06_if {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̸� �Է��Ͻÿ� : ");
		int age = scanner.nextInt();
		if((age>=20) && (age <30)) {
			System.out.print("20�� �Դϴ�.");
			System.out.println("20��� �ູ�մϴ�.");
		}
		else
			System.out.println("20�밡 �ƴմϴ�.");
		
		scanner.close();
				
	}

}
