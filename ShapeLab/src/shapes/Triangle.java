package shapes;

public class Triangle implements Shape {
	private double side;
	private double height;
	public Triangle(double side, double height)
	{
		this.side = side;
		this.height = height;
	}
	
	@Override
	public double perimeter() {
		return side * 3;
	}

	@Override
	public double area() {
		return (side*0.5)*height;
	}

	public String toString()
	{
		return "Triangle Side Length " + side + " Height " + height + " Area: " + this.area() + " Perimeter: " + this.perimeter();
	}
}
