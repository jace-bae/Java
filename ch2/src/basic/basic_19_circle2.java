package basic;

public class basic_19_circle2 {
	int radius;
	String name;
	
	//�Ű����� ���� ������
	public basic_19_circle2() { 
		radius = 1; 
		name = "";
	}
	
	//�Ű����� �ִ� ������
	public basic_19_circle2(int r, String n) { 
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		basic_19_circle2 pizza = new basic_19_circle2(10,"java pizza");
		double area = pizza.getArea();
		System.out.println(pizza.name+ "�� ������ " + area);
		
		basic_19_circle2 donut = new basic_19_circle2();
		donut.name = "donut pizza";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
		}
	}