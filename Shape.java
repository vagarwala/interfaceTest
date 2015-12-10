public abstract class Shape{
	private String color;
	private boolean filled;

	public Shape(){
		this("black", false);
	}
	public Shape(String c, boolean f){
		color = c;
		filled = f;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String c){
		color = c;
	}
	public boolean isFilled(){
		return filled;
	}
	public double getSemiPerimeter(){
		return getPerimeter() / 2.0;
	}
	public String toString(){
		String y = "not filled";
		if (filled) {
			y = "filled";
		}
		return "A Shape with color of " + getColor() + " and is " + y;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}