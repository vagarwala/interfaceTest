public class Circle extends Shape{
	private double radius;

	public double getRadius(){
		return radius;
	}
	public void setRadius(double r){
		radius = r;
	}
	public Circle(double r){
		radius = r;
	}
	public Circle(){
		radius = 1.0;
	}
	public String toString(){
		return "A circle with radius " + radius + ", which is a subclass of " + super.toString();
	}
	public double getArea(){
		return radius*radius*Math.PI;
	}
	public double getPerimeter(){
		return 2*radius*Math.PI;
	}
}