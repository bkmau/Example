package exercise_08;

public class Rentangle extends Shape implements IShape{
    private double length;
    private double width;
	
	public Rentangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double Area() {
		return (length*width);
	}

	@Override
	public double Perimeter() {
		return ((length+width)*2);
	}

	@Override
	public void printShapeInfo(String name) {
		super.printShapeInfo(name);
		System.out.print("    Lenght: "+ length + "\r" +
								 "     Width: "+ width + "\r" +
				                 "Perimeter: " + Perimeter() + "\r" +
								 "       Area: " + Area());
	}
	
}
