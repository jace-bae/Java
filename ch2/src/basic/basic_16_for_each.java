package basic;

public class basic_16_for_each {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		int sum = 0;
		for(int k : n) { //k는 n[0], n[1] ...로 반복
			System.out.print(k + "");// 반복되는 k값 출력
			sum += k;
	}
		System.out.println("합은" + sum);
		
		String f[] = {"사과","배","바나나","체리","포도","딸기"};
		for(String s:f) //s는 f[0], s[1]로 반복
			System.out.print(s + "");
			}
}
