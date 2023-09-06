package EY_1423;

abstract class Shape{
	
	abstract void draw();
	
	int area,length,breadth,height,radius;
	double areaOfCircle;
	
	void purpose() {
		System.out.println("Calculate the area of different shapes");
	}
	
}

class Triangle extends Shape {
	
	void draw() {
		int breadth =20, height = 30;
		area= (breadth*height)/2;
		System.out.println("Area of Triangle is " + area);	
	}
}

class Rectangle extends Shape {
	
	void draw() {
		int breadth =20, length = 30;
		area = (breadth*length);
		System.out.println("Area of Rectangle is " + area);	
	}
}

class Circle extends Shape {
	void draw() {
		double radius = 20;
		areaOfCircle = 2*Math.PI*radius;
		System.out.println("Area of Circle is " + areaOfCircle);	
	}
}

public class LetsTestAbstraction {

	public static void main(String[] args) {

		//Shape obj1 = new Shape();
		Triangle obj2 = new Triangle();
		obj2.draw();
		Rectangle obj3 = new Rectangle();
		obj3.draw();
		Circle obj4 = new Circle();
		obj4.draw();
	}

}
