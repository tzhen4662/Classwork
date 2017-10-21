package shapes;

public class Rhombus implements Shape {
	private double diagOne;
	private double diagTwo;
	public Rhombus (double diagOne, double diagTwo)
	{
		this.diagOne = diagOne;
		this.diagTwo = diagTwo;
	}
	@Override
	public double perimeter() {
		double halfone = 0.5 * diagOne;
		double halftwo = 0.5 * diagTwo;
		return 4*Math.sqrt((halfone*halfone) + (halftwo*halftwo));	
	}

	@Override
	public double area() {
		return (diagOne * diagTwo)/2;
	}

	public String toString()
	{
		return "Rhombus Diagonal One Length: " + diagOne + " Diagonal Two Length: " + diagTwo + " Area: " + this.area() + " Perimeter: " + this.perimeter();
	}
}
