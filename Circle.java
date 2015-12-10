public class Circle extends Shape implements Area{
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
	public Circle(double radius, String name){
		super(name);
		this.radius = radius;
    }
	public String toString(){
		return "Circle "+getName()+" with radius of "+getRadius();
    }
	public double getArea(){
		return radius*radius*Math.PI;
	}
	public double getPerimeter(){
		return 2*radius*Math.PI;
	}
}