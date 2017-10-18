package shapes;

public class Square extends Rectangle{
	double side;
	public Square(double side) {
		super(side, side);
		this.side = side;	
	}
	
	public String toString()
	{
		return "Square Side Length: " + side + " Area: " + this.area() + " Perimeter: " + this.perimeter();
	}

}
