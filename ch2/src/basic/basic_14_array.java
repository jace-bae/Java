package basic;

import java.util.Scanner;

public class basic_14_array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[];
		intArray = new int[5];
		int max = 0;//���� ���� ū ��
		System.out.println("��� 5���� �Է��ϼ���");
		
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max)
				max=intArray[i]; //max change
		}
		System.out.print("���� ū ����" + max + "�Դϴ�," );
		scanner.close();
	}

}