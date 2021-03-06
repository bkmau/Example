package exercise_08;

public class RectangleFigure {
	private double length;
    private double width;
    
    public RectangleFigure () {}

    public RectangleFigure (double l, double w) {
       setDimension(l, w);
    }
    
    public void setDimension(double l, double w) {
    	this.length = doesSetZero(l);
    	this.width = doesSetZero(w);
    }
    
    public void setDimension(double l, double w, double h) {}
    
    public double doesSetZero(double value) {
    	if(value < 0) {
    		return 0;
    	} else {
    		return value;
    	}
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double Area() {
        return length * width;
    }
    
    public double Area(double x, double y) {
        return x * y;
    }

    public double Perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return String.format("Length = %.2f; Width = %.2f; Area = %.2f", length, width, Area()); 
    }
}
