// sum 1 ~ 10
package basic;

public class basic_09_for {

	public static void main(String[] args) {
		int i, sum =0;
		
		for(i=1; i<=10; i++) {
			sum += i;
			System.out.print(i);
			
			if(i<=9)
				System.out.print("+");
				else {
					System.out.print("=" + sum);	
				}		
		}
	}
}