package basic;

public class basic_05_operator {

	public static void main(String[] args) {
		int a=3, b=3, c=3;
		
		//���Կ�����
		a += 3;
		b *= 3;
		c %= 2;
		System.out.println("a = " + a + ",b = " + b + " ,c = "+ c);
		
		int d=3;
		//���� ������
		a = d++;
		System.out.println("a=" + a + ", d=" + d);
		a = ++d;
		System.out.println("a=" + a + ", d=" + d);
		a = d--;
		System.out.println("a=" + a + ", d=" + d);
		a = --d;
		System.out.println("a=" + a + ", d=" + d);

	}

}
