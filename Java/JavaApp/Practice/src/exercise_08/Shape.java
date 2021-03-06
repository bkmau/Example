package exercise_08;

public abstract class Shape {
	private String color;

	public void printShapeInfo(String name){
		System.out.print(String.format("My name is %s, " + 
	                                                "This is my personal info...\r" +
	                                                "My color is %s\r", 
				                 name, color));
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getColor(){
		return color;
	}
}
