package basic;

public class basic_19_circle2 {
	int radius;
	String name;
	
	//매개변수 없는 생성자
	public basic_19_circle2() { 
		radius = 1; 
		name = "";
	}
	
	//매개변수 있는 생성자
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
		System.out.println(pizza.name+ "의 면적은 " + area);
		
		basic_19_circle2 donut = new basic_19_circle2();
		donut.name = "donut pizza";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		}
	}
