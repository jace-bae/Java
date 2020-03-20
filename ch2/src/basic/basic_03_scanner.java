/*
 * Scanner scanner = new Scanner(System.in);
 * 
 * String name = scanner.next(); // 문자열로 리턴
 * int age = scanner.nextint(); //int 로 리턴
 * double weight = scanner.nextDouble(); //double 로 리턴
 * boolean single = scanner.nextBoolean(); 
 * */

package basic;

import java.util.Scanner;

public class basic_03_scanner {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하시오.");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("당신의 이름은 " + name + "입니다.");
		String city = scanner.next();
		System.out.println("당신이 사는 도시는 " + city + "입니다.");
		int age = scanner.nextInt();
		System.out.println("당신의 나이는 " + age + "살 입니다.");
		double weight = scanner.nextDouble();
		System.out.println("당신의 체중은 " + weight + "kg 입니다.");
		boolean single = scanner.nextBoolean();
		System.out.println("당신의 독신여부는 " + single + "입니다.");
		
		scanner.close();
	}

}
