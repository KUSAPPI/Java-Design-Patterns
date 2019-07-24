package adapterPatternDemo;

class Rect
{
	public double l;
	public double w;
}

class Triangle
{
	public double b;//base
	public double h;//height
	
public Triangle(int b, int h)
{
		this.b = b;
		this.h = h;
}
	}

//Calculator class can calculates the area of a rectangle. An input Rectangle is needed to calculate the area of a rectangle

class Calculator
{ 
	Rect rectangle;

	public double getArea(Rect r){
		
		rectangle=r;

		return rectangle.l * rectangle.w;

}
	}

//The area of a triangle is calculated using the class CalculatorAdaptor. Input is Triangle

class CalculatorAdapter
{
	Calculator calculator;
	Triangle triangle;

	public double getArea(Triangle t){

		calculator = new Calculator();
		triangle=t;
		Rect r = new Rect();
		
//Area of Triangle=0.5*base*height
		r.l = triangle.b;
		r.w = 0.5*triangle.h;
		return calculator.getArea(r);
}
	}

public class AdapterPattern {

	public static void main(String[] args) {
	
		System.out.println("***Adapter Pattern Demo***");
		CalculatorAdapter cal=new CalculatorAdapter();
		Triangle t = new Triangle(20,10);
		System.out.println("\nAdapter Pattern Example\n");
		System.out.println("Area of Triangle is :" + cal.getArea(t));

	}

}
