package basic;

public class basic_17_circle {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		basic_17_circle pizza;
		pizza = new basic_17_circle();
		pizza.radius = 10;
		pizza.name = "java Pizza";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		basic_17_circle donut = new basic_17_circle();
		donut.radius = 2;
		donut.name = "java donut";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
	}

}
