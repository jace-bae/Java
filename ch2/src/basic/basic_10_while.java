// while문을 이용하여 입력된 정수의 평균 구하기
package basic;
import java.util.Scanner;
public class basic_10_while {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count=0, n=0;
		double sum = 0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		while((n=scanner.nextInt()) !=0){
			sum = sum+n;
			count++;
		}
		System.out.print("수의 개수는" + count + "개이며");
		System.out.println("평균은" + sum/count + "입니다.");
		
		scanner.close();
	}
}
