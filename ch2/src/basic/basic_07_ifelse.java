package basic;

import java.util.Scanner;

public class basic_07_ifelse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� (0�� ~ 100��) : " );
		int score =scanner.nextInt();
		
		System.out.print("�г��� �Է��ϼ���(1 ~ 4) : ");
		int grade = scanner.nextInt();
		
		if(score >=60) {
			if(grade !=4)
				System.out.println("�հ�");
			else if(score >=70)
				System.out.println("�հ�"); //4�г��� 70���̻��̸� �հ�
			else
				System.out.println("���հ�"); //4�г��� 70�� �̸��̸� ���հ�
		}
		else
			System.out.println("���հ�");
		
		scanner.close();

	}

}
