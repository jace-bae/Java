package basic;

import java.util.Scanner;

public class basic_14_array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[];
		intArray = new int[5];
		int max = 0;//현재 가장 큰 수
		System.out.println("양수 5개를 입력하세요");
		
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max)
				max=intArray[i]; //max change
		}
		System.out.print("가장 큰 수는" + max + "입니다," );
		scanner.close();
	}

}
